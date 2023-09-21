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
import org.junit.Assert.assertSame
import org.junit.Assert.assertTrue

class WeatherRepoImplTest {
    @Test
    fun `ui`() = runTest {
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
    fun `uii`() = runTest {
        val mockOpenWeatherRestApi: OpenWeatherRestApi = mockk()
        coEvery { mockOpenWeatherRestApi.search(any()) } throws Throwable()

        val repo = WeatherRepoImpl(mockOpenWeatherRestApi)
        val result = repo.searchCity("London")
        assertSame(Result.Unknown, result)
    }

//    @Test
//    fun `uiui`() = runTest {
//        val mockOpenWeatherRestApi: OpenWeatherRestApi = mockk()
//        coEvery { mockOpenWeatherRestApi.search(any()) } returns mockk<Forecast> {
//            every {  }
//        }
//
//        val repo = WeatherRepoImpl(mockOpenWeatherRestApi)
//        val result = repo.searchCity("London")
//        assertTrue(result is Result.Success)
//    }
}