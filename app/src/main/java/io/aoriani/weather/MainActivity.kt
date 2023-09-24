package io.aoriani.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.aoriani.weather.data.OpenWeatherRestApiImpl
import io.aoriani.weather.data.createHttpClient
import io.aoriani.weather.domain.WeatherRepoImpl
import io.aoriani.weather.ui.navigation.Navigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val repo = WeatherRepoImpl(
            restApi = OpenWeatherRestApiImpl(httpClient = createHttpClient()))
        super.onCreate(savedInstanceState)
        setContent {
            Navigation(repo)
        }
    }
}
