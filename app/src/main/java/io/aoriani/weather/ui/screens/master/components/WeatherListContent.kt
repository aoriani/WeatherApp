package io.aoriani.weather.ui.screens.master.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.master.models.WeatherModel
import io.aoriani.weather.ui.theme.WeatherAppTheme

@Composable
fun WeatherListContent(
    weathers: List<WeatherModel>,
    innerPadding: PaddingValues,
    showWeatherDetails: (Long) -> Unit
) {
    LazyColumn(modifier = Modifier.padding(innerPadding)) {
        items(items = weathers, key = { it.id }) { weather ->
            WeatherListItem(
                model = weather,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 16.dp),
                onClick = { showWeatherDetails(weather.id) })
        }
    }
}

@Preview(name = "Weather List", showBackground = true)
@Composable
fun WeatherListPreview() {
    WeatherAppTheme {
        WeatherListContent(weathers = listOf(
            WeatherModel(
                id = 1,
                city = "San Bruno",
                temp = 71.0,
                condition = Weather.Condition.Clear
            ),
            WeatherModel(
                id = 2,
                city = "Pacifica",
                temp = 68.0,
                condition = Weather.Condition.Rain
            ),
            WeatherModel(
                id = 3,
                city = "Daly City",
                temp = 70.5,
                condition = Weather.Condition.Fog
            ),
            WeatherModel(
                id = 4,
                city = "Colma",
                temp = 69.5,
                condition = Weather.Condition.Snow
            ),
        ), innerPadding = PaddingValues(0.dp), showWeatherDetails = {})
    }
}
