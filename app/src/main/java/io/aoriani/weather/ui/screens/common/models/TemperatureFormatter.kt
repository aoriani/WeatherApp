package io.aoriani.weather.ui.screens.common.models

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import io.aoriani.weather.R

@Composable
fun Double.formatAsFahrenheit() = stringResource(id = R.string.temp_in_f, this)