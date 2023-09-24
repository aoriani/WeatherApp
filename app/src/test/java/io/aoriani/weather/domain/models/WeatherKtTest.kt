package io.aoriani.weather.domain.models

import io.aoriani.weather.data.models.Forecast
import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test

class WeatherKtTest {

    @Test
    fun `Ensure that conversion from kelvin to freedom units works`() {
        assertEquals(32.0, kelvinToFahrenheit(273.15), 0.1)
        assertEquals(77.0, kelvinToFahrenheit(298.15), 0.1)
        assertEquals(212.0, kelvinToFahrenheit(373.15), 0.1)
    }

    @Test
    fun `Ensure that weather ids are mapped correctly to conditions`() {
        assertEquals(Weather.Condition.Thunderstorm, 200.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 201.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 202.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 210.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 211.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 212.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 221.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 230.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 231.toCondition())
        assertEquals(Weather.Condition.Thunderstorm, 232.toCondition())
        assertEquals(Weather.Condition.Drizzle, 300.toCondition())
        assertEquals(Weather.Condition.Drizzle, 300.toCondition())
        assertEquals(Weather.Condition.Drizzle, 301.toCondition())
        assertEquals(Weather.Condition.Drizzle, 302.toCondition())
        assertEquals(Weather.Condition.Drizzle, 310.toCondition())
        assertEquals(Weather.Condition.Drizzle, 311.toCondition())
        assertEquals(Weather.Condition.Drizzle, 312.toCondition())
        assertEquals(Weather.Condition.Drizzle, 313.toCondition())
        assertEquals(Weather.Condition.Drizzle, 314.toCondition())
        assertEquals(Weather.Condition.Drizzle, 321.toCondition())
        assertEquals(Weather.Condition.Rain, 500.toCondition())
        assertEquals(Weather.Condition.Rain, 501.toCondition())
        assertEquals(Weather.Condition.Rain, 502.toCondition())
        assertEquals(Weather.Condition.Rain, 503.toCondition())
        assertEquals(Weather.Condition.Rain, 504.toCondition())
        assertEquals(Weather.Condition.Rain, 511.toCondition())
        assertEquals(Weather.Condition.Rain, 520.toCondition())
        assertEquals(Weather.Condition.Rain, 521.toCondition())
        assertEquals(Weather.Condition.Rain, 522.toCondition())
        assertEquals(Weather.Condition.Rain, 531.toCondition())
        assertEquals(Weather.Condition.Snow, 600.toCondition())
        assertEquals(Weather.Condition.Snow, 601.toCondition())
        assertEquals(Weather.Condition.Snow, 602.toCondition())
        assertEquals(Weather.Condition.Snow, 611.toCondition())
        assertEquals(Weather.Condition.Snow, 612.toCondition())
        assertEquals(Weather.Condition.Snow, 613.toCondition())
        assertEquals(Weather.Condition.Snow, 615.toCondition())
        assertEquals(Weather.Condition.Snow, 616.toCondition())
        assertEquals(Weather.Condition.Snow, 620.toCondition())
        assertEquals(Weather.Condition.Snow, 621.toCondition())
        assertEquals(Weather.Condition.Snow, 622.toCondition())
        assertEquals(Weather.Condition.Mist, 701.toCondition())
        assertEquals(Weather.Condition.Smoke, 711.toCondition())
        assertEquals(Weather.Condition.Haze, 721.toCondition())
        assertEquals(Weather.Condition.Other, 731.toCondition())
        assertEquals(Weather.Condition.Fog, 741.toCondition())
        assertEquals(Weather.Condition.Other, 751.toCondition())
        assertEquals(Weather.Condition.Other, 761.toCondition())
        assertEquals(Weather.Condition.Other, 762.toCondition())
        assertEquals(Weather.Condition.Other, 771.toCondition())
        assertEquals(Weather.Condition.Tornado, 781.toCondition())
        assertEquals(Weather.Condition.Clear, 800.toCondition())
        assertEquals(Weather.Condition.Cloudy, 801.toCondition())
        assertEquals(Weather.Condition.Cloudy, 802.toCondition())
        assertEquals(Weather.Condition.Cloudy, 803.toCondition())
        assertEquals(Weather.Condition.Cloudy, 804.toCondition())
    }

    @Test
    fun `Verify that mapping between data model and domain model is correct`() {
        val mockForecast: Forecast = mockk {
            every { name } returns "Piracicaba"
            every { main } returns mockk {
                every { temp } returns 294.817
                every { tempMin } returns 291.483
                every { tempMax } returns 299.817
                every { feelsLike } returns 297.039
                every { humidity } returns 70
            }
            every { weather } returns listOf(mockk {
                every { id } returns 800
            })
        }

        val weather = mockForecast.toWeather()
        assertEquals("Piracicaba", weather.name)
        assertEquals(Weather.Condition.Clear, weather.condition)
        assertEquals(71.0, weather.temperature, 0.1)
        assertEquals(65.0, weather.minTemperature, 0.1)
        assertEquals(80.0, weather.maxTemperature, 0.1)
        assertEquals(75.0, weather.feelsLikeTemperature, 0.1)
        assertEquals(70, weather.humidity)
    }
}