package io.aoriani.weather.ui.screens.master

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import io.aoriani.weather.domain.WeatherRepo
import io.aoriani.weather.domain.models.Result
import io.aoriani.weather.ui.screens.master.models.MasterScreenState
import io.aoriani.weather.ui.screens.master.models.toWeatherModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

interface MasterViewModel {
    val state: State<MasterScreenState>
    fun fetchCities()
}

class MasterViewModelImpl(
    private val weatherRepo: WeatherRepo,
    private val mainDispatcher: CoroutineDispatcher = Dispatchers.Main,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) : ViewModel(), MasterViewModel {
    override val state: MutableState<MasterScreenState> = mutableStateOf(MasterScreenState.Init)

    init {
        fetchCities()
    }

    override fun fetchCities() {
        viewModelScope.launch(mainDispatcher) {
            state.value = MasterScreenState.Loading
            val result = withContext(ioDispatcher) {
                weatherRepo.fetchCities(
                    listOf(
                        5391749,
                        4684904,
                        3453643,
                        4219762,
                        2643743,
                        2988507,
                        1277333,
                        2692969,
                    )
                )
            }

            state.value = when (result) {
                is Result.Success -> MasterScreenState.Loaded(result.data.map { it.toWeatherModel() })
                is Result.NotFound -> MasterScreenState.NotFound
                is Result.Unknown -> MasterScreenState.Error
            }
        }
    }

    class Factory(private val repo: WeatherRepo) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            return MasterViewModelImpl(repo) as T
        }
    }
}