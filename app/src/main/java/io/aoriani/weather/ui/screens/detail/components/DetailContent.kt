package io.aoriani.weather.ui.screens.detail.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.WaterDrop
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.R
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.common.models.icon
import io.aoriani.weather.ui.screens.detail.models.toTemperatureModel
import io.aoriani.weather.ui.theme.WeatherAppTheme

@Composable
fun DetailContent(weather: Weather, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = modifier.padding(horizontal = 16.dp, vertical = 32.dp)) {
        Icon(
            imageVector = weather.condition.icon,
            contentDescription = weather.name,
            modifier = Modifier.size(300.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        TemperatureModule(temperatureModel = weather.toTemperatureModel())
        Spacer(modifier = Modifier.height(16.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                Icons.Outlined.WaterDrop,
                contentDescription = stringResource(id = R.string.humidity)
            )
            Text(text = stringResource(id = R.string.humidity))
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = stringResource(id = R.string.humdity_value, weather.humidity))
        }

    }
}

@Preview("Detail Content", showBackground = true)
@Composable
fun DetailContentPreview() {
    WeatherAppTheme {
        DetailContent(
            Weather(
                id = 1,
                name = "San Bruno",
                condition = Weather.Condition.Clear,
                temperature = 69.0,
                feelsLikeTemperature = 65.5,
                minTemperature = 61.2,
                maxTemperature = 73.4,
                humidity = 33
            )
        )
    }
}