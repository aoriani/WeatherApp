package io.aoriani.weather.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Forecasts(
    val cnt: Long,
    val list: List<Forecast>
)

@Serializable
data class Forecast(
    val coord: Coord,
    val weather: List<Weather> = emptyList(),
    val base: String? = null,
    val main: Main,
    val visibility: Long,
    val wind: Wind,
    val clouds: Clouds,
    val dt: Long,
    val sys: Sys,
    val timezone: Long? = null,
    val id: Long,
    val name: String,
    val cod: Long? = null
) {

    @Serializable
    data class Clouds(
        val all: Long
    )

    @Serializable
    data class Coord(
        val lon: Double,
        val lat: Double
    )

    @Serializable
    data class Main(
        val temp: Double,

        @SerialName("feels_like")
        val feelsLike: Double,

        @SerialName("temp_min")
        val tempMin: Double,

        @SerialName("temp_max")
        val tempMax: Double,

        val pressure: Long,
        val humidity: Long
    )

    @Serializable
    data class Sys(
        val type: Long? = null,
        val id: Long? = null,
        val country: String,
        val sunrise: Long,
        val sunset: Long
    )

    @Serializable
    data class Weather(
        val id: Long,
        val main: String,
        val description: String,
        val icon: String
    )

    @Serializable
    data class Wind(
        val speed: Double,
        val deg: Long
    )
}