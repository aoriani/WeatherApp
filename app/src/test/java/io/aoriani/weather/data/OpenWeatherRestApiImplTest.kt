package io.aoriani.weather.data

import io.ktor.client.engine.mock.MockEngine
import io.ktor.client.engine.mock.respond
import io.ktor.client.plugins.ClientRequestException
import io.ktor.http.HttpHeaders
import io.ktor.http.HttpStatusCode
import io.ktor.http.headersOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Assert.fail
import org.junit.Test
import java.lang.IllegalArgumentException

class OpenWeatherRestApiImplTest {

    @Test
    fun `When city query is empty the call must fail`() = runTest {
        val mockEngine = MockEngine { _ -> respond("") }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))

        try {
            api.search("  ")
            fail()
        } catch (ignore: IllegalArgumentException) {

        }
    }

    @Test
    fun `When list of the city code is empty the call must fail`() = runTest {
        val mockEngine = MockEngine { _ -> respond("") }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))

        try {
            api.forecasts(emptyList())
            fail()
        } catch (ignore: IllegalArgumentException) {

        }
    }

    @Test
    fun `When the city query succeeds it returns a forecast`() = runTest {
        val mockEngine = MockEngine { _ ->
            respond(
                content = """{"coord":{"lon":2.3488,"lat":48.8534},"weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],"base":"stations","main":{"temp":297.53,"feels_like":297.43,"temp_min":296.14,"temp_max":298.43,"pressure":1003,"humidity":54},"visibility":10000,"wind":{"speed":9.26,"deg":190},"clouds":{"all":0},"dt":1695227586,"sys":{"type":2,"id":2041230,"country":"FR","sunrise":1695188018,"sunset":1695232493},"timezone":7200,"id":2988507,"name":"Paris","cod":200}""",
                status = HttpStatusCode.OK,
                headers = headersOf(HttpHeaders.ContentType, "application/json")
            )
        }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))
        val forecast = api.search("Paris")
        assertEquals("Paris", forecast.name)
    }

    @Test
    fun `When the city forecast is not found, ClientRequestException is throw`() = runTest {
        val mockEngine = MockEngine { _ ->
            respond(
                content = "",
                status = HttpStatusCode.NotFound,
            )
        }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))
        try {
            api.search("Paris")
            fail()
        } catch (cre: ClientRequestException) {
            assertEquals(HttpStatusCode.NotFound, cre.response.status)
        }
    }

    @Test
    fun `When query for a list of city ids succeeds it returns a forecasts`() = runTest {
        val mockEngine = MockEngine { _ ->
            respond(
                content = """{"cnt":3,"list":[{"coord":{"lon":37.6156,"lat":55.7522},"sys":{"country":"RU","timezone":10800,"sunrise":1695179396,"sunset":1695224191},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"main":{"temp":293.49,"feels_like":292.73,"temp_min":293.23,"temp_max":293.96,"pressure":1016,"sea_level":1016,"grnd_level":998,"humidity":44},"visibility":10000,"wind":{"speed":4.26,"deg":220},"clouds":{"all":88},"dt":1695225959,"id":524901,"name":"Moscow"},{"coord":{"lon":30.5167,"lat":50.4333},"sys":{"country":"UA","timezone":10800,"sunrise":1695181221,"sunset":1695225773},"weather":[{"id":804,"main":"Clouds","description":"overcast clouds","icon":"04n"}],"main":{"temp":293.12,"feels_like":293.31,"temp_min":291.82,"temp_max":293.55,"pressure":1005,"humidity":82},"visibility":10000,"wind":{"speed":2.35,"deg":263},"clouds":{"all":100},"dt":1695226146,"id":703448,"name":"Kyiv"},{"coord":{"lon":-0.1257,"lat":51.5085},"sys":{"country":"GB","timezone":3600,"sunrise":1695188562,"sunset":1695233137},"weather":[{"id":501,"main":"Rain","description":"moderate rain","icon":"10d"}],"main":{"temp":290.26,"feels_like":290.45,"temp_min":289.47,"temp_max":291.13,"pressure":995,"humidity":93},"visibility":10000,"wind":{"speed":6.69,"deg":200},"clouds":{"all":75},"dt":1695226159,"id":2643743,"name":"London"}]}""",
                status = HttpStatusCode.OK,
                headers = headersOf(HttpHeaders.ContentType, "application/json")
            )
        }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))
        val forecasts = api.forecasts(listOf(524901, 703448, 2643743))
        assertEquals(3, forecasts.cnt)
        assertEquals(3, forecasts.list.count())

    }

    @Test
    fun `When no city code is found, ClientRequestException is throw`() = runTest {
        val mockEngine = MockEngine { _ ->
            respond(
                content = """{"cod":"404","message":"No data: 404006"}""",
                status = HttpStatusCode.NotFound,
                headers = headersOf(HttpHeaders.ContentType, "application/json")
            )
        }
        val api = OpenWeatherRestApiImpl(createHttpClient(mockEngine))
        try {
            api.forecasts(listOf(1))
            fail()
        } catch (cre: ClientRequestException) {
            assertEquals(HttpStatusCode.NotFound, cre.response.status)
        }
    }
}