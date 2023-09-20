package io.aoriani.weather.data

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

fun createHttpClient(engine: HttpClientEngine = OkHttp.create()): HttpClient = HttpClient(engine) {
    expectSuccess = true
    install(ContentNegotiation) {
        json(Json {
            ignoreUnknownKeys = true
        })
    }
}