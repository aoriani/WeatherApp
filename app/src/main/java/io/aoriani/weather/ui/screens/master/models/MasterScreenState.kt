package io.aoriani.weather.ui.screens.master.models

interface MasterScreenState {
    data object Init: MasterScreenState
    data object Loading : MasterScreenState

    data class Loaded(val weathers: List<WeatherModel>) : MasterScreenState
    data object NotFound : MasterScreenState
    data object Error : MasterScreenState
}