package io.aoriani.weather.ui.screens.master

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import io.aoriani.weather.R
import io.aoriani.weather.ui.screens.master.components.EmptyContent
import io.aoriani.weather.ui.screens.master.components.ErrorContent
import io.aoriani.weather.ui.screens.master.components.LoadingContent
import io.aoriani.weather.ui.screens.master.components.WeatherListContent
import io.aoriani.weather.ui.screens.master.models.MasterScreenState

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MasterScreen(
    viewModel: MasterViewModel,
    showWeatherDetails: (Long) -> Unit = {}
) {
    val scrollBehavior =
        TopAppBarDefaults.exitUntilCollapsedScrollBehavior(rememberTopAppBarState())

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                ),
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                scrollBehavior = scrollBehavior
            )
        }
    ) { innerPadding ->

        val state by viewModel.state
        when (state) {
            is MasterScreenState.Loading -> LoadingContent(innerPadding = innerPadding)
            is MasterScreenState.Loaded -> WeatherListContent(
                (state as MasterScreenState.Loaded).weathers,
                innerPadding,
                showWeatherDetails
            )
            is MasterScreenState.NotFound -> EmptyContent(innerPadding = innerPadding)
            is MasterScreenState.Error -> ErrorContent(
                innerPadding = innerPadding,
                onRetryAgainClicked = { viewModel.fetchCities() })
        }
    }
}

