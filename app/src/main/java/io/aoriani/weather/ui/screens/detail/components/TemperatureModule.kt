package io.aoriani.weather.ui.screens.detail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.Thermostat
import androidx.compose.material.icons.filled.Waves
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.R
import io.aoriani.weather.ui.TestTags
import io.aoriani.weather.ui.screens.detail.models.TemperatureModel
import io.aoriani.weather.ui.theme.DarkRed
import io.aoriani.weather.ui.theme.DarkSkyBlue
import io.aoriani.weather.ui.theme.WeatherAppTheme

@Composable
internal fun Gauge(icon: ImageVector, iconTint: Color, label: String, temp: String, modifier: Modifier = Modifier) {
    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Start, modifier = modifier) {
        Icon(icon, contentDescription = null, tint = iconTint)
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = label,
            style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(text = temp, style = MaterialTheme.typography.bodyLarge)
    }
}

@Preview(name = "Temperature Gauge", showBackground = true)
@Composable
fun GaugePreview() {
    WeatherAppTheme {
        Gauge(icon = Icons.Default.Thermostat, iconTint = Color.Blue, label = "Max", temp = "56°F")
    }
}

@Composable
fun TemperatureModule(temperatureModel: TemperatureModel, modifier: Modifier = Modifier) {
    Card {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(all = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column {
                Gauge(
                    icon = Icons.Default.Thermostat,
                    iconTint = Color.DarkGray,
                    label = stringResource(id = R.string.temp),
                    temp = temperatureModel.current(),
                    modifier = Modifier.testTag(TestTags.tempGauge)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Gauge(
                    icon = Icons.Default.ArrowDropDown,
                    iconTint = DarkSkyBlue,
                    label = stringResource(id = R.string.min),
                    temp = temperatureModel.min(),
                    modifier = Modifier.testTag(TestTags.minTempGauge)
                )

            }
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Gauge(
                    icon = Icons.Default.Waves,
                    iconTint = Color.DarkGray,
                    label = stringResource(id = R.string.feels_like),
                    temp = temperatureModel.feelsLike(),
                    modifier = Modifier.testTag(TestTags.feelsLikeGauge)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Gauge(
                    icon = Icons.Default.ArrowDropUp,
                    iconTint = DarkRed,
                    label = stringResource(id = R.string.max),
                    temp = temperatureModel.max(),
                    modifier = Modifier.testTag(TestTags.maxTempGauge)
                )
            }

        }
    }
}


@Preview(name = "Temperature Module", showBackground = true)
@Composable
fun TemperatureModulePreview() {
    WeatherAppTheme {
        TemperatureModule(
            temperatureModel = TemperatureModel(
                current = 71.5,
                feelsLike = 68.0,
                min = 55.9,
                max = 79.0
            )
        )
    }
}
