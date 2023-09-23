package io.aoriani.weather.ui.screens.common.models

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.resources.vector.WeatherIcons
import io.aoriani.weather.ui.theme.WeatherAppTheme

val Weather.Condition.icon: ImageVector
    @Composable get() = when (this) {
        Weather.Condition.Thunderstorm -> WeatherIcons.Thunderstorm
        Weather.Condition.Drizzle -> WeatherIcons.Drizzle
        Weather.Condition.Rain -> WeatherIcons.Rainy
        Weather.Condition.Snow -> WeatherIcons.Snow
        Weather.Condition.Mist -> WeatherIcons.Mist
        Weather.Condition.Smoke -> WeatherIcons.Smoke
        Weather.Condition.Haze -> WeatherIcons.Haze
        Weather.Condition.Fog -> WeatherIcons.Fog
        Weather.Condition.Tornado -> WeatherIcons.Tornado
        Weather.Condition.Clear -> WeatherIcons.Clear
        Weather.Condition.Cloudy -> WeatherIcons.Cloudy
        Weather.Condition.Other -> WeatherIcons.Other
    }

@OptIn(ExperimentalLayoutApi::class)
@Preview(name = "Weather Icons", showBackground = true)
@Composable
fun WeatherIconsPreview() {
    WeatherAppTheme {
        FlowRow(modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Weather.Condition.entries.forEach {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Icon(it.icon, contentDescription = it.name, modifier = Modifier.size(48.dp))
                    Text(text = it.name)
                }

            }
        }
            
    }
}
