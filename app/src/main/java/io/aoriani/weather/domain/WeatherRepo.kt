package io.aoriani.weather.domain

import io.aoriani.weather.data.OpenWeatherRestApi
import io.aoriani.weather.domain.models.Weather
import io.ktor.client.plugins.ClientRequestException
import io.ktor.http.HttpStatusCode
import io.aoriani.weather.domain.models.Result
import io.aoriani.weather.domain.models.toWeather

interface WeatherRepo {
    suspend fun searchCity(city: String): Result<Weather>
    suspend fun fetchCities(ids: List<Long>): Result<List<Weather>>
}

class WeatherRepoImpl(private val restApi: OpenWeatherRestApi) : WeatherRepo {

    private val cache = hashMapOf<Long, Weather>()
    override suspend fun searchCity(city: String): Result<Weather> {
        return cache.values.firstOrNull { it.name.equals(city, ignoreCase = true) }
            ?.let { Result.Success(it) }
            ?: try {
                val forecast = restApi.search(city)
                val weather = forecast.toWeather()
                cache[forecast.id] = weather
                Result.Success(weather)
            } catch (throwable: Throwable) {
                if (throwable is ClientRequestException && throwable.response.status == HttpStatusCode.NotFound) {
                    Result.NotFound
                } else {
                    Result.Unknown
                }
            }
    }

    override suspend fun fetchCities(ids: List<Long>): Result<List<Weather>> {
        TODO()
    }

}