package io.aoriani.weather.ui.screens.master.models

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.vector.ImageVector
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.common.models.formatAsFahrenheit
import io.aoriani.weather.ui.screens.common.models.icon

@Immutable
class WeatherModel(
    val id: Long,
    val city: String,
    private val temp: Double,
    val condition: Weather.Condition
) {
    val temperature: String @Composable get() = temp.formatAsFahrenheit()
    val conditionIcon: ImageVector @Composable get() = condition.icon
}

fun Weather.toWeatherModel() = WeatherModel(
    id = this.id,
    city = this.name,
    temp = this.temperature,
    condition = this.condition
)
