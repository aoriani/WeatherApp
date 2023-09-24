package io.aoriani.weather.ui.screens.detail.models

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.common.models.formatAsFahrenheit

@Immutable
data class TemperatureModel(
    private val current: Double,
    private val feelsLike: Double,
    private val min: Double,
    private val max: Double,

    ) {
    @Composable
    fun current() = current.formatAsFahrenheit()

    @Composable
    fun feelsLike() = feelsLike.formatAsFahrenheit()

    @Composable
    fun min() = min.formatAsFahrenheit()

    @Composable
    fun max() = max.formatAsFahrenheit()
}

fun Weather.toTemperatureModel() =
    TemperatureModel(
        current = temperature,
        feelsLike = feelsLikeTemperature,
        min = minTemperature,
        max = maxTemperature
    )