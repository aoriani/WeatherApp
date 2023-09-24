package io.aoriani.weather.ui.screens.detail

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.CreationExtras
import io.aoriani.weather.domain.WeatherRepo
import io.aoriani.weather.domain.models.Result
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.master.MasterViewModelImpl
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

interface DetailViewModel {
    val weather: State<Weather?>
}

class DetailViewModelImpl(
    private val cityId: Long,
    private val weatherRepo: WeatherRepo,
    ioDispatcher: CoroutineDispatcher = Dispatchers.IO,
    mainDispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel(), DetailViewModel {
    override val weather: MutableState<Weather?> = mutableStateOf(null)

    init {
        viewModelScope.launch(mainDispatcher) {
            val result = withContext(ioDispatcher) {
                weatherRepo.fetchCities(listOf(cityId))
            }
            if (result is Result.Success) {
                weather.value = result.data.first()
            }

        }
    }

    class Factory(private val cityId: Long, private val repo: WeatherRepo) :
        ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            return DetailViewModelImpl(cityId, repo) as T
        }
    }
}