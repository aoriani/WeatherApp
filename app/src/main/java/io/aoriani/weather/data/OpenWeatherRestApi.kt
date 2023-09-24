package io.aoriani.weather.data

import io.aoriani.weather.data.models.Forecast
import io.aoriani.weather.data.models.Forecasts
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.http.appendPathSegments

interface OpenWeatherRestApi {
    suspend fun search(cityQuery: String): Forecast
    suspend fun forecasts(cityIds: List<Long>): Forecasts
}

internal class OpenWeatherRestApiImpl(private val httpClient: HttpClient) : OpenWeatherRestApi {
    private val apiKey = "e8436a6e7b06d6872f8e593fac92e267"
    private val baseUrl = "https://api.openweathermap.org/data/2.5/"

    override suspend fun search(cityQuery: String): Forecast {
        require(cityQuery.isNotBlank()) { "Query argument cannot be blank" }
        return httpClient.get(baseUrl) {
            url {
                appendPathSegments("weather")
                parameters.append("appid", apiKey)
                parameters.append("q", cityQuery)
            }
        }.body()
    }

    override suspend fun forecasts(cityIds: List<Long>): Forecasts {
        require(cityIds.isNotEmpty()) { "Cannot have a list of empty ids" }
        return httpClient.get(baseUrl) {
            url {
                appendPathSegments("group")
                parameters.append("appid", apiKey)
                parameters.append("id", cityIds.joinToString(separator = ","))
            }
        }.body()
    }
}