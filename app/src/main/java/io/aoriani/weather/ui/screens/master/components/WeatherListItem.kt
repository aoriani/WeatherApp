package io.aoriani.weather.ui.screens.master.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.screens.master.models.WeatherModel
import io.aoriani.weather.ui.theme.WeatherAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WeatherListItem(
    model: WeatherModel,
    modifier: Modifier = Modifier,
    onClick: (Long) -> Unit = {}
) {
    Card(onClick = { onClick(model.id) }, modifier = modifier) {
        Row(modifier = Modifier.padding(16.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(model.conditionIcon, contentDescription = model.condition.name, modifier = Modifier.size(48.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Column(modifier = Modifier.weight(1f)) {
                Text(text = model.city, style = MaterialTheme.typography.titleMedium)
                Text(
                    text = model.temperature,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.align(Alignment.End)
                )
            }
        }
    }
}

@Preview(name = "List item", showBackground = true)
@Composable
fun WeatherListItemPreview() {
    WeatherAppTheme {
        WeatherListItem(
            model = WeatherModel(
                id = 900L,
                city = "San Bruno",
                temp = 71.5,
                condition = Weather.Condition.Rain
            )
        )
    }
}
