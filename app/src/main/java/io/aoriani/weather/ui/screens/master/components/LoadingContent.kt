package io.aoriani.weather.ui.screens.master.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.aoriani.weather.ui.theme.WeatherAppTheme

@Composable
fun LoadingContent(innerPadding: PaddingValues) {
    Box(modifier = Modifier.fillMaxSize().padding(innerPadding), contentAlignment = Alignment.Center) {
        CircularProgressIndicator(strokeWidth = 10.dp, modifier = Modifier.size(200.dp))
    }
}

@Preview(name = "Loading Content", showBackground = true)
@Composable
fun LoadingContentPreview() {
    WeatherAppTheme {
        LoadingContent(innerPadding = PaddingValues(0.dp))
    }
}