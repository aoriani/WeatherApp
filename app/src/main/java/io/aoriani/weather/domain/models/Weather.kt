package io.aoriani.weather.domain.models

import androidx.annotation.VisibleForTesting
import io.aoriani.weather.data.models.Forecast

data class Weather(
    val name: String,
    val condition: Condition,
    val temperature: Double,
    val feelsLikeTemperature: Double,
    val minTemperature: Double,
    val maxTemperature: Double,
    val humidity: Int
) {
    enum class Condition {
        Thunderstorm,
        Drizzle,
        Rain,
        Snow,
        Mist,
        Smoke,
        Haze,
        Fog,
        Tornado,
        Clear,
        Cloudy,
        Other
    }
}

@VisibleForTesting
internal fun Int.toCondition(): Weather.Condition = when (this) {
    in 200..232 -> Weather.Condition.Thunderstorm
    in 300..321 -> Weather.Condition.Drizzle
    in 500..531 -> Weather.Condition.Rain
    in 600..623 -> Weather.Condition.Snow
    701 -> Weather.Condition.Mist
    711 -> Weather.Condition.Smoke
    721 -> Weather.Condition.Haze
    741 -> Weather.Condition.Fog
    781 -> Weather.Condition.Tornado
    800 -> Weather.Condition.Clear
    in 801..804 -> Weather.Condition.Cloudy
    else -> Weather.Condition.Other
}

@VisibleForTesting
internal fun kelvinToFahrenheit(kelvin: Double): Double {
    return (kelvin - 273.15) * 9.0/5.0 + 32.0
}

internal fun Forecast.toWeather(): Weather {
    return Weather(
        name = this.name,
        condition = this.weather.firstOrNull()?.id?.toCondition() ?: Weather.Condition.Other,
        temperature = kelvinToFahrenheit(this.main.temp),
        feelsLikeTemperature = kelvinToFahrenheit(this.main.feelsLike),
        minTemperature = kelvinToFahrenheit(this.main.tempMin),
        maxTemperature = kelvinToFahrenheit(this.main.tempMax),
        humidity = this.main.humidity
    )
}