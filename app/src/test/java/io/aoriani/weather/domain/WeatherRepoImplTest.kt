package io.aoriani.weather.domain

import io.aoriani.weather.data.OpenWeatherRestApi
import io.aoriani.weather.data.models.Forecast
import io.ktor.client.plugins.ClientRequestException
import io.ktor.http.HttpStatusCode
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Test
import io.aoriani.weather.domain.models.Result
import io.mockk.coVerify
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue

class WeatherRepoImplTest {
    @Test
    fun `When city query is not found, search city returns not found`() = runTest {
        val mockNotFoundException: ClientRequestException = mockk {
            every { response } returns mockk {
                every { status } returns HttpStatusCode.NotFound
            }
        }
        val mockOpenWeatherRestApi: OpenWeatherRestApi = mockk()
        coEvery { mockOpenWeatherRestApi.search(any()) } throws mockNotFoundException

        val repo = WeatherRepoImpl(mockOpenWeatherRestApi)
        val result = repo.searchCity("London")
        assertSame(Result.NotFound, result)
    }

    @Test
    fun `When city query faces other issues, search city returns unknown`() = runTest {
        val mockOpenWeatherRestApi: OpenWeatherRestApi = mockk()
        coEvery { mockOpenWeatherRestApi.search(any()) } throws Throwable()

        val repo = WeatherRepoImpl(mockOpenWeatherRestApi)
        val result = repo.searchCity("London")
        assertSame(Result.Unknown, result)
    }

    @Test
    fun `When city query success it returns weather, subsequent calls returns cached value`() = runTest {
        val mockOpenWeatherRestApi: OpenWeatherRestApi = mockk()
        coEvery { mockOpenWeatherRestApi.search(any()) } returns mockk<Forecast> {
            every { id } returns 989
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

        val repo = WeatherRepoImpl(mockOpenWeatherRestApi)
        val result = repo.searchCity("Piracicaba")
        assertTrue(result is Result.Success)

        val result2 = repo.searchCity("piracicaba")
        assertTrue(result2 is Result.Success)

        // API is called once because result is cached
        coVerify(exactly = 1) { mockOpenWeatherRestApi.search(any())}
    }
}