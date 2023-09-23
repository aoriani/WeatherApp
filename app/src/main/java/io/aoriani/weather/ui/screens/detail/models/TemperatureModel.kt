package io.aoriani.weather.ui.screens.detail.models

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.res.stringResource
import io.aoriani.weather.R
import io.aoriani.weather.domain.models.Weather

@Immutable
data class TemperatureModel(
    private val current: Double,
    private val feelsLike: Double,
    private val min: Double,
    private val max: Double,

    ) {
    @Composable
    private fun format(temp: Double): String = stringResource(id = R.string.temp_in_f, temp)

    @Composable
    fun current() = format(temp = current)

    @Composable
    fun feelsLike() = format(temp = feelsLike)

    @Composable
    fun min() = format(temp = min)

    @Composable
    fun max() = format(temp = max)
}

fun Weather.toTemperatureModel() =
    TemperatureModel(
        current = temperature,
        feelsLike = feelsLikeTemperature,
        min = minTemperature,
        max = maxTemperature
    )