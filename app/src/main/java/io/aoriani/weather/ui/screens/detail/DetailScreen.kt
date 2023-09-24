package io.aoriani.weather.ui.screens.detail

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.TestTags
import io.aoriani.weather.ui.screens.detail.components.DetailContent
import io.aoriani.weather.ui.theme.WeatherAppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    viewModel: DetailViewModel,
    navigateUp: () -> Unit = {}
) {
    val weather by viewModel.weather
    val scrollBehavior =
        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            LargeTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        text = weather?.name.orEmpty(),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = navigateUp, modifier = Modifier.testTag(TestTags.navigateUpButton)) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->
        if (weather != null) {
            DetailContent(
                weather = weather!!,
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .padding(innerPadding)
            )
        }
    }
}


@Preview("Detail Screen", showBackground = true, showSystemUi = true)
@Composable
fun DetailScreenPreview() {
    WeatherAppTheme {
        DetailScreen(viewModel = object : DetailViewModel {
            override val weather: State<Weather> = remember {
                mutableStateOf(
                    Weather(
                        id = 1L,
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

        })
    }
}