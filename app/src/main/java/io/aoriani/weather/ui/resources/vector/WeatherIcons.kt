package io.aoriani.weather.ui.resources.vector

import android.graphics.Path.FillType
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Air
import androidx.compose.material.icons.outlined.Dehaze
import androidx.compose.material.icons.outlined.Thunderstorm
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

object WeatherIcons {
    val Rainy: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "rainy",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(23.208f, 36.458f)
                        quadToRelative(-0.458f, 0.25f, -1f, 0.063f)
                        quadToRelative(-0.541f, -0.188f, -0.791f, -0.646f)
                        lineToRelative(-2.75f, -5.5f)
                        quadToRelative(-0.25f, -0.5f, -0.084f, -1.042f)
                        quadToRelative(0.167f, -0.541f, 0.667f, -0.791f)
                        quadToRelative(0.5f, -0.209f, 1.021f, -0.042f)
                        quadToRelative(0.521f, 0.167f, 0.771f, 0.667f)
                        lineToRelative(2.75f, 5.5f)
                        quadToRelative(0.25f, 0.5f, 0.083f, 1.021f)
                        quadToRelative(-0.167f, 0.52f, -0.667f, 0.77f)
                        close()
                        moveToRelative(10f, 0f)
                        quadToRelative(-0.458f, 0.209f, -1f, 0.042f)
                        quadToRelative(-0.541f, -0.167f, -0.791f, -0.667f)
                        lineToRelative(-2.75f, -5.5f)
                        quadToRelative(-0.25f, -0.5f, -0.084f, -1.021f)
                        quadToRelative(0.167f, -0.52f, 0.667f, -0.77f)
                        reflectiveQuadToRelative(1.021f, -0.063f)
                        quadToRelative(0.521f, 0.188f, 0.771f, 0.646f)
                        lineToRelative(2.75f, 5.5f)
                        quadToRelative(0.25f, 0.5f, 0.083f, 1.042f)
                        quadToRelative(-0.167f, 0.541f, -0.667f, 0.791f)
                        close()
                        moveToRelative(-20f, 0f)
                        quadToRelative(-0.458f, 0.209f, -1f, 0.042f)
                        quadToRelative(-0.541f, -0.167f, -0.791f, -0.625f)
                        lineToRelative(-2.75f, -5.5f)
                        quadToRelative(-0.25f, -0.5f, -0.063f, -1.042f)
                        quadToRelative(0.188f, -0.541f, 0.688f, -0.791f)
                        quadToRelative(0.458f, -0.209f, 1f, -0.042f)
                        quadToRelative(0.541f, 0.167f, 0.791f, 0.625f)
                        lineToRelative(2.75f, 5.542f)
                        quadToRelative(0.25f, 0.5f, 0.063f, 1.021f)
                        quadToRelative(-0.188f, 0.52f, -0.688f, 0.77f)
                        close()
                        moveToRelative(-1f, -10.416f)
                        quadToRelative(-3.625f, 0f, -6.208f, -2.584f)
                        quadToRelative(-2.583f, -2.583f, -2.583f, -6.25f)
                        quadToRelative(0f, -3.291f, 2.312f, -5.875f)
                        quadTo(8.042f, 8.75f, 11.5f, 8.458f)
                        quadToRelative(1.333f, -2.333f, 3.562f, -3.708f)
                        quadTo(17.292f, 3.375f, 20f, 3.375f)
                        quadToRelative(3.75f, 0f, 6.375f, 2.396f)
                        reflectiveQuadToRelative(3.208f, 5.979f)
                        quadToRelative(3.125f, 0.167f, 5.084f, 2.25f)
                        quadToRelative(1.958f, 2.083f, 1.958f, 4.875f)
                        quadToRelative(0f, 2.958f, -2.104f, 5.063f)
                        quadToRelative(-2.104f, 2.104f, -5.063f, 2.104f)
                        close()
                        moveToRelative(0f, -2.667f)
                        horizontalLineToRelative(17.25f)
                        quadToRelative(1.875f, 0f, 3.188f, -1.313f)
                        quadToRelative(1.312f, -1.312f, 1.312f, -3.187f)
                        quadToRelative(0f, -1.875f, -1.312f, -3.187f)
                        quadToRelative(-1.313f, -1.313f, -3.188f, -1.313f)
                        horizontalLineToRelative(-2.416f)
                        verticalLineToRelative(-1.333f)
                        quadToRelative(0f, -2.917f, -2.063f, -4.959f)
                        quadTo(22.917f, 6.042f, 20f, 6.042f)
                        quadToRelative(-2.125f, 0f, -3.875f, 1.125f)
                        reflectiveQuadToRelative(-2.583f, 3.083f)
                        lineToRelative(-0.334f, 0.792f)
                        horizontalLineToRelative(-1.083f)
                        quadToRelative(-2.542f, 0.083f, -4.313f, 1.875f)
                        quadToRelative(-1.77f, 1.791f, -1.77f, 4.291f)
                        quadToRelative(0f, 2.584f, 1.812f, 4.375f)
                        quadToRelative(1.813f, 1.792f, 4.354f, 1.792f)
                        close()
                        moveTo(20f, 14.708f)
                        close()
                    }
                }.build()
            }
        }

    val Thunderstorm: ImageVector inline get() = Icons.Outlined.Thunderstorm

    val Snow: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "weather_snowy",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(10.833f, 31.292f)
                        quadToRelative(-0.708f, 0f, -1.208f, -0.5f)
                        reflectiveQuadToRelative(-0.5f, -1.209f)
                        quadToRelative(0f, -0.708f, 0.5f, -1.229f)
                        quadToRelative(0.5f, -0.521f, 1.208f, -0.521f)
                        quadToRelative(0.709f, 0f, 1.229f, 0.521f)
                        quadToRelative(0.521f, 0.521f, 0.521f, 1.229f)
                        quadToRelative(0f, 0.709f, -0.521f, 1.209f)
                        quadToRelative(-0.52f, 0.5f, -1.229f, 0.5f)
                        close()
                        moveToRelative(5f, 5.291f)
                        quadToRelative(-0.708f, 0f, -1.208f, -0.5f)
                        reflectiveQuadToRelative(-0.5f, -1.208f)
                        quadToRelative(0f, -0.75f, 0.5f, -1.25f)
                        reflectiveQuadToRelative(1.208f, -0.5f)
                        quadToRelative(0.709f, 0f, 1.229f, 0.521f)
                        quadToRelative(0.521f, 0.521f, 0.521f, 1.229f)
                        quadToRelative(0f, 0.708f, -0.521f, 1.208f)
                        quadToRelative(-0.52f, 0.5f, -1.229f, 0.5f)
                        close()
                        moveToRelative(5f, -5.291f)
                        quadToRelative(-0.708f, 0f, -1.208f, -0.5f)
                        reflectiveQuadToRelative(-0.5f, -1.209f)
                        quadToRelative(0f, -0.708f, 0.5f, -1.229f)
                        quadToRelative(0.5f, -0.521f, 1.208f, -0.521f)
                        quadToRelative(0.709f, 0f, 1.229f, 0.521f)
                        quadToRelative(0.521f, 0.521f, 0.521f, 1.229f)
                        quadToRelative(0f, 0.709f, -0.521f, 1.209f)
                        quadToRelative(-0.52f, 0.5f, -1.229f, 0.5f)
                        close()
                        moveToRelative(10f, 0f)
                        quadToRelative(-0.708f, 0f, -1.208f, -0.5f)
                        reflectiveQuadToRelative(-0.5f, -1.209f)
                        quadToRelative(0f, -0.708f, 0.5f, -1.229f)
                        quadToRelative(0.5f, -0.521f, 1.208f, -0.521f)
                        quadToRelative(0.709f, 0f, 1.229f, 0.521f)
                        quadToRelative(0.521f, 0.521f, 0.521f, 1.229f)
                        quadToRelative(0f, 0.709f, -0.521f, 1.209f)
                        quadToRelative(-0.52f, 0.5f, -1.229f, 0.5f)
                        close()
                        moveToRelative(-5f, 5.291f)
                        quadToRelative(-0.708f, 0f, -1.208f, -0.5f)
                        reflectiveQuadToRelative(-0.5f, -1.208f)
                        quadToRelative(0f, -0.75f, 0.5f, -1.25f)
                        reflectiveQuadToRelative(1.208f, -0.5f)
                        quadToRelative(0.709f, 0f, 1.229f, 0.521f)
                        quadToRelative(0.521f, 0.521f, 0.521f, 1.229f)
                        quadToRelative(0f, 0.708f, -0.521f, 1.208f)
                        quadToRelative(-0.52f, 0.5f, -1.229f, 0.5f)
                        close()
                        moveTo(12.208f, 24.375f)
                        quadToRelative(-3.625f, 0f, -6.208f, -2.583f)
                        quadToRelative(-2.583f, -2.584f, -2.583f, -6.25f)
                        quadToRelative(0f, -3.292f, 2.312f, -5.875f)
                        quadTo(8.042f, 7.083f, 11.5f, 6.792f)
                        quadToRelative(1.333f, -2.334f, 3.562f, -3.709f)
                        quadTo(17.292f, 1.708f, 20f, 1.708f)
                        quadToRelative(3.75f, 0f, 6.375f, 2.396f)
                        reflectiveQuadToRelative(3.208f, 5.979f)
                        quadToRelative(3.125f, 0.167f, 5.084f, 2.25f)
                        quadToRelative(1.958f, 2.084f, 1.958f, 4.875f)
                        quadToRelative(0f, 2.959f, -2.104f, 5.063f)
                        quadToRelative(-2.104f, 2.104f, -5.063f, 2.104f)
                        close()
                        moveToRelative(0f, -2.667f)
                        horizontalLineToRelative(17.25f)
                        quadToRelative(1.875f, 0f, 3.188f, -1.312f)
                        quadToRelative(1.312f, -1.313f, 1.312f, -3.188f)
                        quadToRelative(0f, -1.875f, -1.312f, -3.187f)
                        quadToRelative(-1.313f, -1.313f, -3.188f, -1.313f)
                        horizontalLineToRelative(-2.416f)
                        verticalLineToRelative(-1.333f)
                        quadToRelative(0f, -2.917f, -2.063f, -4.958f)
                        quadTo(22.917f, 4.375f, 20f, 4.375f)
                        quadToRelative(-2.125f, 0f, -3.875f, 1.125f)
                        reflectiveQuadToRelative(-2.583f, 3.083f)
                        lineToRelative(-0.334f, 0.792f)
                        horizontalLineToRelative(-1.083f)
                        quadToRelative(-2.542f, 0.083f, -4.313f, 1.875f)
                        quadToRelative(-1.77f, 1.792f, -1.77f, 4.292f)
                        quadToRelative(0f, 2.583f, 1.812f, 4.375f)
                        quadToRelative(1.813f, 1.791f, 4.354f, 1.791f)
                        close()
                        moveTo(20f, 13.042f)
                        close()
                    }
                }.build()
            }
        }

    val Haze: ImageVector inline get() = Icons.Outlined.Dehaze

    val Fog: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "foggy",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(30f, 31.458f)
                        quadToRelative(-0.625f, 0f, -1.042f, -0.416f)
                        quadToRelative(-0.416f, -0.417f, -0.416f, -1.042f)
                        reflectiveQuadToRelative(0.416f, -1.042f)
                        quadToRelative(0.417f, -0.416f, 1.042f, -0.416f)
                        reflectiveQuadToRelative(1.042f, 0.416f)
                        quadToRelative(0.416f, 0.417f, 0.416f, 1.042f)
                        reflectiveQuadToRelative(-0.416f, 1.042f)
                        quadToRelative(-0.417f, 0.416f, -1.042f, 0.416f)
                        close()
                        moveToRelative(-18.333f, 5.167f)
                        quadToRelative(-0.625f, 0f, -1.042f, -0.437f)
                        quadToRelative(-0.417f, -0.438f, -0.417f, -1.063f)
                        quadToRelative(0f, -0.583f, 0.417f, -1.021f)
                        quadToRelative(0.417f, -0.437f, 1.042f, -0.437f)
                        reflectiveQuadToRelative(1.041f, 0.416f)
                        quadToRelative(0.417f, 0.417f, 0.417f, 1.042f)
                        reflectiveQuadToRelative(-0.417f, 1.063f)
                        quadToRelative(-0.416f, 0.437f, -1.041f, 0.437f)
                        close()
                        moveTo(10f, 31.458f)
                        quadToRelative(-0.625f, 0f, -1.042f, -0.416f)
                        quadToRelative(-0.416f, -0.417f, -0.416f, -1.042f)
                        reflectiveQuadToRelative(0.416f, -1.042f)
                        quadToRelative(0.417f, -0.416f, 1.042f, -0.416f)
                        horizontalLineToRelative(15f)
                        quadToRelative(0.625f, 0f, 1.042f, 0.416f)
                        quadToRelative(0.416f, 0.417f, 0.416f, 1.042f)
                        reflectiveQuadToRelative(-0.416f, 1.042f)
                        quadToRelative(-0.417f, 0.416f, -1.042f, 0.416f)
                        close()
                        moveToRelative(6.667f, 5.167f)
                        quadToRelative(-0.625f, 0f, -1.042f, -0.437f)
                        quadToRelative(-0.417f, -0.438f, -0.417f, -1.063f)
                        quadToRelative(0f, -0.583f, 0.417f, -1.021f)
                        quadToRelative(0.417f, -0.437f, 1.042f, -0.437f)
                        horizontalLineToRelative(11.666f)
                        quadToRelative(0.625f, 0f, 1.042f, 0.416f)
                        quadToRelative(0.417f, 0.417f, 0.417f, 1.042f)
                        reflectiveQuadToRelative(-0.417f, 1.063f)
                        quadToRelative(-0.417f, 0.437f, -1.042f, 0.437f)
                        close()
                        moveToRelative(-4.459f, -10.583f)
                        quadToRelative(-3.625f, 0f, -6.208f, -2.584f)
                        quadToRelative(-2.583f, -2.583f, -2.583f, -6.25f)
                        quadToRelative(0f, -3.291f, 2.312f, -5.875f)
                        quadTo(8.042f, 8.75f, 11.5f, 8.458f)
                        quadToRelative(1.333f, -2.333f, 3.562f, -3.708f)
                        quadTo(17.292f, 3.375f, 20f, 3.375f)
                        quadToRelative(3.75f, 0f, 6.375f, 2.396f)
                        reflectiveQuadToRelative(3.208f, 5.979f)
                        quadToRelative(3.125f, 0.167f, 5.084f, 2.25f)
                        quadToRelative(1.958f, 2.083f, 1.958f, 4.875f)
                        quadToRelative(0f, 2.958f, -2.104f, 5.063f)
                        quadToRelative(-2.104f, 2.104f, -5.063f, 2.104f)
                        close()
                        moveToRelative(0f, -2.667f)
                        horizontalLineToRelative(17.25f)
                        quadToRelative(1.875f, 0f, 3.188f, -1.313f)
                        quadToRelative(1.312f, -1.312f, 1.312f, -3.187f)
                        quadToRelative(0f, -1.875f, -1.312f, -3.187f)
                        quadToRelative(-1.313f, -1.313f, -3.188f, -1.313f)
                        horizontalLineToRelative(-2.416f)
                        verticalLineToRelative(-1.333f)
                        quadToRelative(0f, -2.917f, -2.063f, -4.959f)
                        quadTo(22.917f, 6.042f, 20f, 6.042f)
                        quadToRelative(-2.125f, 0f, -3.875f, 1.125f)
                        reflectiveQuadToRelative(-2.583f, 3.083f)
                        lineToRelative(-0.292f, 0.792f)
                        horizontalLineToRelative(-1.125f)
                        quadToRelative(-2.542f, 0.083f, -4.313f, 1.875f)
                        quadToRelative(-1.77f, 1.791f, -1.77f, 4.291f)
                        quadToRelative(0f, 2.584f, 1.812f, 4.375f)
                        quadToRelative(1.813f, 1.792f, 4.354f, 1.792f)
                        close()
                        moveTo(20f, 14.708f)
                        close()
                    }
                }.build()
            }
        }

    val Tornado: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "tornado",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(6.375f, 5.042f)
                        horizontalLineToRelative(27.292f)
                        quadToRelative(1.541f, 0f, 2.271f, 1.333f)
                        quadToRelative(0.729f, 1.333f, 0.02f, 2.667f)
                        lineTo(22.292f, 32.583f)
                        quadToRelative(-0.792f, 1.292f, -2.313f, 1.292f)
                        quadToRelative(-1.521f, 0f, -2.271f, -1.292f)
                        lineTo(4.083f, 9.042f)
                        quadToRelative(-0.75f, -1.334f, -0.021f, -2.667f)
                        quadToRelative(0.73f, -1.333f, 2.313f, -1.333f)
                        close()
                        moveToRelative(0f, 2.666f)
                        lineToRelative(3.458f, 5.959f)
                        horizontalLineToRelative(20.334f)
                        lineToRelative(3.5f, -5.959f)
                        horizontalLineTo(6.375f)
                        close()
                        moveToRelative(5f, 8.584f)
                        lineTo(14.667f, 22f)
                        horizontalLineToRelative(10.708f)
                        lineToRelative(3.292f, -5.708f)
                        close()
                        moveToRelative(4.833f, 8.333f)
                        lineTo(20f, 31.25f)
                        lineToRelative(3.833f, -6.625f)
                        close()
                    }
                }.build()
            }
        }

    val Clear: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "clear_day",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(20f, 7.958f)
                        quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                        reflectiveQuadToRelative(-0.375f, -0.916f)
                        verticalLineTo(3.042f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                        quadToRelative(0.375f, -0.396f, 0.917f, -0.396f)
                        reflectiveQuadToRelative(0.938f, 0.396f)
                        quadToRelative(0.395f, 0.396f, 0.395f, 0.938f)
                        verticalLineToRelative(3.625f)
                        quadToRelative(0f, 0.541f, -0.395f, 0.916f)
                        quadToRelative(-0.396f, 0.375f, -0.938f, 0.375f)
                        close()
                        moveToRelative(8.5f, 3.542f)
                        quadToRelative(-0.417f, -0.375f, -0.396f, -0.917f)
                        quadToRelative(0.021f, -0.541f, 0.396f, -0.916f)
                        lineToRelative(2.542f, -2.584f)
                        quadToRelative(0.375f, -0.375f, 0.916f, -0.375f)
                        quadToRelative(0.542f, 0f, 0.959f, 0.375f)
                        quadToRelative(0.375f, 0.375f, 0.375f, 0.917f)
                        reflectiveQuadToRelative(-0.375f, 0.917f)
                        lineTo(30.333f, 11.5f)
                        quadToRelative(-0.375f, 0.375f, -0.916f, 0.375f)
                        quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                        close()
                        moveToRelative(4.833f, 9.792f)
                        quadToRelative(-0.541f, 0f, -0.916f, -0.375f)
                        reflectiveQuadTo(32.042f, 20f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                        quadToRelative(0.375f, -0.395f, 0.916f, -0.395f)
                        horizontalLineToRelative(3.625f)
                        quadToRelative(0.542f, 0f, 0.938f, 0.395f)
                        quadToRelative(0.396f, 0.396f, 0.396f, 0.938f)
                        quadToRelative(0f, 0.542f, -0.396f, 0.917f)
                        reflectiveQuadToRelative(-0.938f, 0.375f)
                        close()
                        moveTo(20f, 38.25f)
                        quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                        reflectiveQuadToRelative(-0.375f, -0.917f)
                        verticalLineToRelative(-3.625f)
                        quadToRelative(0f, -0.541f, 0.375f, -0.937f)
                        reflectiveQuadTo(20f, 32f)
                        quadToRelative(0.542f, 0f, 0.938f, 0.396f)
                        quadToRelative(0.395f, 0.396f, 0.395f, 0.937f)
                        verticalLineToRelative(3.625f)
                        quadToRelative(0f, 0.542f, -0.395f, 0.917f)
                        quadToRelative(-0.396f, 0.375f, -0.938f, 0.375f)
                        close()
                        moveTo(9.667f, 11.5f)
                        lineTo(7.083f, 8.958f)
                        quadToRelative(-0.375f, -0.375f, -0.375f, -0.916f)
                        quadToRelative(0f, -0.542f, 0.417f, -0.959f)
                        quadToRelative(0.375f, -0.375f, 0.896f, -0.375f)
                        reflectiveQuadToRelative(0.896f, 0.375f)
                        lineTo(11.5f, 9.667f)
                        quadToRelative(0.375f, 0.375f, 0.396f, 0.916f)
                        quadToRelative(0.021f, 0.542f, -0.396f, 0.917f)
                        quadToRelative(-0.417f, 0.375f, -0.938f, 0.375f)
                        quadToRelative(-0.52f, 0f, -0.895f, -0.375f)
                        close()
                        moveToRelative(21.375f, 21.417f)
                        lineTo(28.5f, 30.333f)
                        quadToRelative(-0.375f, -0.375f, -0.375f, -0.916f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.917f)
                        reflectiveQuadToRelative(0.917f, -0.375f)
                        quadToRelative(0.541f, 0f, 0.916f, 0.375f)
                        lineToRelative(2.625f, 2.542f)
                        quadToRelative(0.375f, 0.375f, 0.375f, 0.916f)
                        quadToRelative(0f, 0.542f, -0.416f, 0.959f)
                        quadToRelative(-0.375f, 0.375f, -0.917f, 0.395f)
                        quadToRelative(-0.542f, 0.021f, -0.958f, -0.395f)
                        close()
                        moveToRelative(-28f, -11.625f)
                        quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                        reflectiveQuadTo(1.75f, 20f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                        quadToRelative(0.375f, -0.395f, 0.917f, -0.395f)
                        horizontalLineToRelative(3.625f)
                        quadToRelative(0.541f, 0f, 0.937f, 0.395f)
                        quadTo(8f, 19.458f, 8f, 20f)
                        quadToRelative(0f, 0.542f, -0.396f, 0.917f)
                        reflectiveQuadToRelative(-0.937f, 0.375f)
                        close()
                        moveToRelative(4.041f, 11.625f)
                        quadToRelative(-0.375f, -0.375f, -0.375f, -0.917f)
                        reflectiveQuadToRelative(0.375f, -0.917f)
                        lineTo(9.667f, 28.5f)
                        quadToRelative(0.375f, -0.375f, 0.916f, -0.375f)
                        quadToRelative(0.542f, 0f, 0.917f, 0.375f)
                        quadToRelative(0.375f, 0.417f, 0.375f, 0.938f)
                        quadToRelative(0f, 0.52f, -0.375f, 0.937f)
                        lineToRelative(-2.542f, 2.542f)
                        quadToRelative(-0.375f, 0.375f, -0.937f, 0.375f)
                        quadToRelative(-0.563f, 0f, -0.938f, -0.375f)
                        close()
                        moveToRelative(12.917f, -3f)
                        quadToRelative(-4.125f, 0f, -7.021f, -2.896f)
                        reflectiveQuadTo(10.083f, 20f)
                        quadToRelative(0f, -4.125f, 2.896f, -7.042f)
                        quadToRelative(2.896f, -2.916f, 7.021f, -2.916f)
                        reflectiveQuadToRelative(7.042f, 2.916f)
                        quadToRelative(2.916f, 2.917f, 2.916f, 7.042f)
                        reflectiveQuadToRelative(-2.916f, 7.021f)
                        quadTo(24.125f, 29.917f, 20f, 29.917f)
                        close()
                        moveToRelative(0f, -2.625f)
                        quadToRelative(3.042f, 0f, 5.167f, -2.125f)
                        reflectiveQuadTo(27.292f, 20f)
                        quadToRelative(0f, -3.042f, -2.125f, -5.167f)
                        reflectiveQuadTo(20f, 12.708f)
                        quadToRelative(-3.042f, 0f, -5.167f, 2.125f)
                        reflectiveQuadTo(12.708f, 20f)
                        quadToRelative(0f, 3.042f, 2.125f, 5.167f)
                        reflectiveQuadTo(20f, 27.292f)
                        close()
                    }
                }.build()
            }
        }

    val Cloudy: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "partly_cloudy_day",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(20f, 7.958f)
                        quadToRelative(-0.542f, 0f, -0.917f, -0.375f)
                        reflectiveQuadToRelative(-0.375f, -0.916f)
                        verticalLineTo(3.042f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                        quadToRelative(0.375f, -0.396f, 0.917f, -0.396f)
                        reflectiveQuadToRelative(0.938f, 0.396f)
                        quadToRelative(0.395f, 0.396f, 0.395f, 0.938f)
                        verticalLineToRelative(3.625f)
                        quadToRelative(0f, 0.541f, -0.395f, 0.916f)
                        quadToRelative(-0.396f, 0.375f, -0.938f, 0.375f)
                        close()
                        moveToRelative(8.5f, 3.542f)
                        quadToRelative(-0.375f, -0.417f, -0.375f, -0.937f)
                        quadToRelative(0f, -0.521f, 0.375f, -0.938f)
                        lineToRelative(2.542f, -2.542f)
                        quadToRelative(0.416f, -0.416f, 0.937f, -0.395f)
                        quadToRelative(0.521f, 0.02f, 0.938f, 0.395f)
                        quadToRelative(0.375f, 0.417f, 0.375f, 0.938f)
                        quadToRelative(0f, 0.521f, -0.375f, 0.896f)
                        lineTo(30.333f, 11.5f)
                        quadToRelative(-0.416f, 0.375f, -0.916f, 0.375f)
                        reflectiveQuadTo(28.5f, 11.5f)
                        close()
                        moveToRelative(4.833f, 9.792f)
                        quadToRelative(-0.541f, 0f, -0.916f, -0.375f)
                        reflectiveQuadTo(32.042f, 20f)
                        quadToRelative(0f, -0.542f, 0.375f, -0.938f)
                        quadToRelative(0.375f, -0.395f, 0.916f, -0.395f)
                        horizontalLineToRelative(3.625f)
                        quadToRelative(0.542f, 0f, 0.938f, 0.395f)
                        quadToRelative(0.396f, 0.396f, 0.396f, 0.938f)
                        quadToRelative(0f, 0.542f, -0.396f, 0.917f)
                        reflectiveQuadToRelative(-0.938f, 0.375f)
                        close()
                        moveToRelative(-2.291f, 11.625f)
                        lineToRelative(-2.5f, -2.542f)
                        quadToRelative(-0.417f, -0.417f, -0.417f, -0.937f)
                        quadToRelative(0f, -0.521f, 0.417f, -0.938f)
                        quadToRelative(0.375f, -0.375f, 0.916f, -0.375f)
                        quadToRelative(0.542f, 0f, 0.917f, 0.375f)
                        lineToRelative(2.542f, 2.542f)
                        quadToRelative(0.458f, 0.416f, 0.437f, 0.937f)
                        quadToRelative(-0.021f, 0.521f, -0.437f, 0.938f)
                        quadToRelative(-0.375f, 0.375f, -0.896f, 0.395f)
                        quadToRelative(-0.521f, 0.021f, -0.979f, -0.395f)
                        close()
                        moveTo(9.667f, 11.5f)
                        lineTo(7.083f, 8.917f)
                        quadToRelative(-0.375f, -0.375f, -0.375f, -0.896f)
                        reflectiveQuadToRelative(0.375f, -0.938f)
                        quadTo(7.5f, 6.708f, 8f, 6.688f)
                        quadToRelative(0.5f, -0.021f, 0.958f, 0.395f)
                        lineTo(11.5f, 9.667f)
                        quadToRelative(0.375f, 0.416f, 0.375f, 0.916f)
                        reflectiveQuadToRelative(-0.375f, 0.917f)
                        quadToRelative(-0.417f, 0.375f, -0.917f, 0.375f)
                        reflectiveQuadToRelative(-0.916f, -0.375f)
                        close()
                        moveTo(10f, 34.917f)
                        quadToRelative(-3.458f, 0f, -5.854f, -2.396f)
                        reflectiveQuadTo(1.75f, 26.667f)
                        quadToRelative(0f, -3.417f, 2.417f, -5.855f)
                        quadTo(6.583f, 18.375f, 10f, 18.375f)
                        horizontalLineTo(10.208f)
                        quadToRelative(0.584f, -3.583f, 3.334f, -5.958f)
                        reflectiveQuadTo(20f, 10.042f)
                        quadToRelative(4.125f, 0f, 7.042f, 2.916f)
                        quadToRelative(2.916f, 2.917f, 2.916f, 7.042f)
                        quadToRelative(0f, 3.167f, -1.854f, 5.75f)
                        reflectiveQuadToRelative(-4.896f, 3.625f)
                        quadToRelative(-0.166f, 2.167f, -1.833f, 3.854f)
                        quadToRelative(-1.667f, 1.688f, -3.875f, 1.688f)
                        close()
                        moveToRelative(0f, -2.625f)
                        horizontalLineToRelative(7.5f)
                        quadToRelative(1.375f, 0f, 2.25f, -0.875f)
                        reflectiveQuadToRelative(0.875f, -2.25f)
                        quadToRelative(0f, -1.375f, -0.875f, -2.271f)
                        quadTo(18.875f, 26f, 17.542f, 26f)
                        horizontalLineToRelative(-1.875f)
                        lineToRelative(-0.75f, -1.75f)
                        quadToRelative(-0.625f, -1.5f, -1.959f, -2.354f)
                        quadToRelative(-1.333f, -0.854f, -2.958f, -0.854f)
                        quadToRelative(-2.292f, 0f, -3.958f, 1.666f)
                        quadToRelative(-1.667f, 1.667f, -1.667f, 3.959f)
                        quadToRelative(0f, 2.375f, 1.625f, 4f)
                        reflectiveQuadToRelative(4f, 1.625f)
                        close()
                        moveToRelative(12.708f, -5.542f)
                        quadToRelative(2.084f, -0.833f, 3.334f, -2.688f)
                        quadToRelative(1.25f, -1.854f, 1.25f, -4.062f)
                        quadToRelative(0f, -3.042f, -2.125f, -5.167f)
                        reflectiveQuadTo(20f, 12.708f)
                        quadToRelative(-2.667f, 0f, -4.729f, 1.75f)
                        quadToRelative(-2.063f, 1.75f, -2.438f, 4.417f)
                        quadToRelative(1.542f, 0.708f, 2.729f, 1.854f)
                        quadToRelative(1.188f, 1.146f, 1.813f, 2.646f)
                        quadToRelative(1.667f, 0f, 3.125f, 0.979f)
                        reflectiveQuadToRelative(2.208f, 2.396f)
                        close()
                    }
                }.build()
            }
        }

    val Smoke: ImageVector inline get() = Icons.Outlined.Air

    val Other: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "local_florist",
                    defaultWidth = 40.0.dp,
                    defaultHeight = 40.0.dp,
                    viewportWidth = 40.0f,
                    viewportHeight = 40.0f
                ).apply {
                    path(
                        fill = SolidColor(Color.Black),
                        fillAlpha = 1f,
                        stroke = null,
                        strokeAlpha = 1f,
                        strokeLineWidth = 1.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 1f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(20f, 36.5f)
                        quadToRelative(0f, -5.25f, 3.625f, -9.417f)
                        quadToRelative(3.625f, -4.166f, 8.667f, -5.125f)
                        quadToRelative(0.541f, -0.125f, 0.979f, 0.042f)
                        quadToRelative(0.437f, 0.167f, 0.729f, 0.5f)
                        quadToRelative(0.333f, 0.292f, 0.5f, 0.729f)
                        quadToRelative(0.167f, 0.438f, 0.042f, 0.979f)
                        quadToRelative(-0.959f, 5.042f, -5.146f, 8.667f)
                        quadTo(25.208f, 36.5f, 20f, 36.5f)
                        close()
                        moveToRelative(3.25f, -3.25f)
                        quadToRelative(3.083f, -1f, 5.208f, -3.125f)
                        reflectiveQuadToRelative(3.125f, -5.208f)
                        quadToRelative(-3.083f, 1f, -5.208f, 3.125f)
                        reflectiveQuadTo(23.25f, 33.25f)
                        close()
                        moveTo(20f, 36.5f)
                        quadToRelative(0f, -5.25f, -3.625f, -9.417f)
                        quadToRelative(-3.625f, -4.166f, -8.667f, -5.125f)
                        quadToRelative(-0.5f, -0.125f, -0.937f, 0.042f)
                        quadToRelative(-0.438f, 0.167f, -0.771f, 0.5f)
                        quadToRelative(-0.333f, 0.292f, -0.479f, 0.729f)
                        quadToRelative(-0.146f, 0.438f, -0.063f, 0.979f)
                        quadToRelative(0.959f, 5.042f, 5.146f, 8.667f)
                        quadTo(14.792f, 36.5f, 20f, 36.5f)
                        close()
                        moveToRelative(-3.25f, -3.25f)
                        quadToRelative(-3.083f, -1f, -5.208f, -3.125f)
                        reflectiveQuadToRelative(-3.125f, -5.208f)
                        quadToRelative(3.083f, 1f, 5.208f, 3.125f)
                        reflectiveQuadToRelative(3.125f, 5.208f)
                        close()
                        moveToRelative(8.833f, -14.75f)
                        quadToRelative(0.917f, 0f, 1.605f, -0.646f)
                        quadToRelative(0.687f, -0.646f, 0.687f, -1.562f)
                        quadToRelative(0f, -0.709f, -0.375f, -1.229f)
                        quadToRelative(-0.375f, -0.521f, -1f, -0.813f)
                        lineToRelative(-1.875f, -0.917f)
                        quadToRelative(-0.167f, 1.125f, -0.667f, 2.021f)
                        quadToRelative(-0.5f, 0.896f, -1.333f, 1.563f)
                        lineToRelative(1.708f, 1.208f)
                        quadToRelative(0.25f, 0.208f, 0.563f, 0.292f)
                        quadToRelative(0.312f, 0.083f, 0.687f, 0.083f)
                        close()
                        moveToRelative(-0.958f, -5.708f)
                        lineToRelative(1.875f, -0.917f)
                        quadToRelative(0.625f, -0.333f, 0.979f, -0.875f)
                        reflectiveQuadToRelative(0.354f, -1.167f)
                        quadToRelative(0f, -0.916f, -0.645f, -1.583f)
                        quadToRelative(-0.646f, -0.667f, -1.605f, -0.667f)
                        quadToRelative(-0.375f, 0f, -0.687f, 0.105f)
                        quadToRelative(-0.313f, 0.104f, -0.604f, 0.312f)
                        lineToRelative(-1.75f, 1.208f)
                        quadToRelative(0.875f, 0.667f, 1.396f, 1.521f)
                        quadToRelative(0.52f, 0.854f, 0.687f, 2.063f)
                        close()
                        moveTo(18f, 8.875f)
                        quadToRelative(0.542f, -0.25f, 1.062f, -0.375f)
                        quadToRelative(0.521f, -0.125f, 0.938f, -0.125f)
                        quadToRelative(0.417f, 0f, 0.938f, 0.125f)
                        quadToRelative(0.52f, 0.125f, 1.062f, 0.375f)
                        lineToRelative(0.292f, -2.5f)
                        quadToRelative(0.083f, -0.833f, -0.667f, -1.417f)
                        quadToRelative(-0.75f, -0.583f, -1.625f, -0.583f)
                        reflectiveQuadToRelative(-1.625f, 0.583f)
                        quadToRelative(-0.75f, 0.584f, -0.625f, 1.417f)
                        close()
                        moveToRelative(2f, 6.167f)
                        quadToRelative(0.833f, 0f, 1.438f, -0.584f)
                        quadToRelative(0.604f, -0.583f, 0.604f, -1.416f)
                        quadToRelative(0f, -0.834f, -0.584f, -1.417f)
                        quadToRelative(-0.583f, -0.583f, -1.458f, -0.583f)
                        quadToRelative(-0.833f, 0f, -1.417f, 0.583f)
                        quadToRelative(-0.583f, 0.583f, -0.583f, 1.417f)
                        quadToRelative(0f, 0.833f, 0.583f, 1.416f)
                        quadToRelative(0.584f, 0.584f, 1.417f, 0.584f)
                        close()
                        moveToRelative(0f, 6.666f)
                        quadToRelative(0.875f, 0f, 1.625f, -0.562f)
                        quadToRelative(0.75f, -0.563f, 0.667f, -1.438f)
                        lineToRelative(-0.292f, -2.5f)
                        quadToRelative(-0.542f, 0.25f, -1.062f, 0.375f)
                        quadToRelative(-0.521f, 0.125f, -0.938f, 0.125f)
                        quadToRelative(-0.417f, 0f, -0.938f, -0.125f)
                        quadToRelative(-0.52f, -0.125f, -1.062f, -0.375f)
                        lineToRelative(-0.25f, 2.5f)
                        quadToRelative(-0.125f, 0.834f, 0.625f, 1.417f)
                        quadToRelative(0.75f, 0.583f, 1.625f, 0.583f)
                        close()
                        moveToRelative(-4.625f, -8.916f)
                        quadToRelative(0.167f, -1.209f, 0.667f, -2.063f)
                        quadToRelative(0.5f, -0.854f, 1.333f, -1.521f)
                        lineTo(15.708f, 8f)
                        quadToRelative(-0.291f, -0.208f, -0.604f, -0.312f)
                        quadToRelative(-0.312f, -0.105f, -0.687f, -0.105f)
                        quadToRelative(-0.917f, 0f, -1.584f, 0.667f)
                        quadToRelative(-0.666f, 0.667f, -0.666f, 1.583f)
                        quadToRelative(0f, 0.667f, 0.354f, 1.188f)
                        quadToRelative(0.354f, 0.521f, 0.979f, 0.854f)
                        close()
                        moveToRelative(-0.958f, 5.666f)
                        quadToRelative(0.375f, 0f, 0.687f, -0.083f)
                        quadToRelative(0.313f, -0.083f, 0.604f, -0.292f)
                        lineToRelative(1.792f, -1.166f)
                        quadToRelative(-0.958f, -0.667f, -1.458f, -1.542f)
                        reflectiveQuadToRelative(-0.667f, -2.042f)
                        lineToRelative(-1.875f, 0.917f)
                        quadToRelative(-0.625f, 0.333f, -0.958f, 0.854f)
                        quadToRelative(-0.334f, 0.521f, -0.334f, 1.188f)
                        quadToRelative(0f, 0.916f, 0.625f, 1.541f)
                        quadToRelative(0.625f, 0.625f, 1.584f, 0.625f)
                        close()
                        moveTo(20f, 24.375f)
                        quadToRelative(-1.542f, 0f, -2.792f, -0.896f)
                        quadToRelative(-1.25f, -0.896f, -1.791f, -2.354f)
                        quadToRelative(-0.25f, 0f, -0.5f, 0.021f)
                        reflectiveQuadToRelative(-0.5f, 0.021f)
                        quadToRelative(-2f, 0f, -3.438f, -1.438f)
                        quadToRelative(-1.437f, -1.437f, -1.437f, -3.479f)
                        quadToRelative(0f, -0.833f, 0.312f, -1.646f)
                        quadToRelative(0.313f, -0.812f, 0.938f, -1.562f)
                        quadToRelative(-0.584f, -0.709f, -0.896f, -1.542f)
                        quadToRelative(-0.313f, -0.833f, -0.313f, -1.625f)
                        quadToRelative(0f, -2.042f, 1.417f, -3.5f)
                        quadToRelative(1.417f, -1.458f, 3.417f, -1.458f)
                        quadToRelative(0.25f, 0f, 0.5f, 0.021f)
                        quadToRelative(0.25f, 0.02f, 0.5f, 0.02f)
                        quadToRelative(0.541f, -1.416f, 1.791f, -2.333f)
                        quadToRelative(1.25f, -0.917f, 2.792f, -0.917f)
                        quadToRelative(1.542f, 0f, 2.792f, 0.917f)
                        quadToRelative(1.25f, 0.917f, 1.833f, 2.333f)
                        quadToRelative(0.208f, 0f, 0.458f, -0.02f)
                        quadToRelative(0.25f, -0.021f, 0.5f, -0.021f)
                        quadToRelative(2f, 0f, 3.438f, 1.458f)
                        quadToRelative(1.437f, 1.458f, 1.437f, 3.458f)
                        quadToRelative(0f, 0.834f, -0.312f, 1.646f)
                        quadToRelative(-0.313f, 0.813f, -0.938f, 1.563f)
                        quadToRelative(0.584f, 0.75f, 0.917f, 1.562f)
                        quadToRelative(0.333f, 0.813f, 0.333f, 1.646f)
                        quadToRelative(0f, 2.042f, -1.437f, 3.479f)
                        quadToRelative(-1.438f, 1.438f, -3.438f, 1.438f)
                        quadToRelative(-0.25f, 0f, -0.5f, -0.021f)
                        reflectiveQuadToRelative(-0.458f, -0.021f)
                        quadToRelative(-0.583f, 1.458f, -1.833f, 2.354f)
                        quadToRelative(-1.25f, 0.896f, -2.792f, 0.896f)
                        close()
                        moveToRelative(0f, -16f)
                        close()
                        moveToRelative(2.542f, 0.833f)
                        close()
                        moveToRelative(0.083f, 7.709f)
                        close()
                        moveTo(20f, 17.708f)
                        close()
                        moveToRelative(-2.5f, -0.791f)
                        close()
                        moveToRelative(-0.125f, -7.709f)
                        close()
                        moveTo(16.75f, 33.25f)
                        close()
                        moveToRelative(6.5f, 0f)
                        close()
                    }
                }.build()
            }
        }

    val Mist: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "mist", defaultWidth =
                    48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 960.0f, viewportHeight =
                    960.0f
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(160.0f, 750.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(160.0f, 690.0f)
                        horizontalLineToRelative(400.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(560.0f, 750.0f)
                        lineTo(160.0f, 750.0f)
                        close()
                        moveTo(720.0f, 750.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(720.0f, 690.0f)
                        horizontalLineToRelative(80.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(800.0f, 750.0f)
                        horizontalLineToRelative(-80.0f)
                        close()
                        moveTo(160.0f, 590.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(160.0f, 530.0f)
                        horizontalLineToRelative(80.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(240.0f, 590.0f)
                        horizontalLineToRelative(-80.0f)
                        close()
                        moveTo(400.0f, 590.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(400.0f, 530.0f)
                        horizontalLineToRelative(400.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(800.0f, 590.0f)
                        lineTo(400.0f, 590.0f)
                        close()
                        moveTo(160.0f, 430.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(160.0f, 370.0f)
                        horizontalLineToRelative(440.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(600.0f, 430.0f)
                        lineTo(160.0f, 430.0f)
                        close()
                        moveTo(760.0f, 430.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(760.0f, 370.0f)
                        horizontalLineToRelative(40.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(800.0f, 430.0f)
                        horizontalLineToRelative(-40.0f)
                        close()
                        moveTo(160.0f, 270.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(160.0f, 210.0f)
                        horizontalLineToRelative(200.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(360.0f, 270.0f)
                        lineTo(160.0f, 270.0f)
                        close()
                        moveTo(520.0f, 270.0f)
                        quadToRelative(-12.75f, 0.0f, -21.375f, -8.675f)
                        quadToRelative(-8.625f, -8.676f, -8.625f, -21.5f)
                        quadToRelative(0.0f, -12.825f, 8.625f, -21.325f)
                        reflectiveQuadTo(520.0f, 210.0f)
                        horizontalLineToRelative(280.0f)
                        quadToRelative(12.75f, 0.0f, 21.375f, 8.675f)
                        quadToRelative(8.625f, 8.676f, 8.625f, 21.5f)
                        quadToRelative(0.0f, 12.825f, -8.625f, 21.325f)
                        reflectiveQuadTo(800.0f, 270.0f)
                        lineTo(520.0f, 270.0f)
                        close()
                    }
                }
                    .build()
            }
        }

    val Drizzle: ImageVector
        @Composable
        get() {
            return remember {
                ImageVector.Builder(
                    name = "rainy_light",
                    defaultWidth = 48.0.dp, defaultHeight = 48.0.dp, viewportWidth = 960.0f,
                    viewportHeight = 960.0f
                ).apply {
                    path(
                        fill = SolidColor(Color(0xFF000000)),
                        stroke = null,
                        strokeLineWidth = 0.0f,
                        strokeLineCap = StrokeCap.Butt,
                        strokeLineJoin = StrokeJoin.Miter,
                        strokeLineMiter = 4.0f,
                        pathFillType = PathFillType.NonZero
                    ) {
                        moveTo(193.0f, 467.0f)
                        quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                        reflectiveQuadToRelative(-17.0f, -15.0f)
                        lineTo(53.0f, 254.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                        reflectiveQuadTo(66.0f, 213.0f)
                        quadToRelative(11.0f, -5.0f, 23.5f, -1.5f)
                        reflectiveQuadTo(107.0f, 226.0f)
                        lineToRelative(100.0f, 200.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 23.5f)
                        reflectiveQuadTo(193.0f, 467.0f)
                        close()
                        moveTo(333.0f, 747.0f)
                        quadToRelative(-11.0f, 6.0f, -22.5f, 1.5f)
                        reflectiveQuadTo(293.0f, 733.0f)
                        lineToRelative(-80.0f, -160.0f)
                        quadToRelative(-5.0f, -11.0f, -1.0f, -22.5f)
                        reflectiveQuadToRelative(15.0f, -17.5f)
                        quadToRelative(11.0f, -5.0f, 22.5f, -1.5f)
                        reflectiveQuadTo(267.0f, 546.0f)
                        lineToRelative(80.0f, 160.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 23.0f)
                        reflectiveQuadToRelative(-15.0f, 18.0f)
                        close()
                        moveTo(415.0f, 547.0f)
                        quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                        reflectiveQuadToRelative(-17.0f, -15.0f)
                        lineTo(235.0f, 254.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -23.5f)
                        reflectiveQuadTo(248.0f, 213.0f)
                        quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                        reflectiveQuadToRelative(18.0f, 14.5f)
                        lineToRelative(140.0f, 280.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 23.5f)
                        reflectiveQuadTo(415.0f, 547.0f)
                        close()
                        moveTo(502.0f, 347.0f)
                        quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                        reflectiveQuadToRelative(-18.0f, -15.0f)
                        lineToRelative(-39.0f, -81.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -22.5f)
                        reflectiveQuadTo(435.0f, 213.0f)
                        quadToRelative(11.0f, -5.0f, 22.5f, -1.5f)
                        reflectiveQuadTo(475.0f, 226.0f)
                        lineToRelative(40.0f, 80.0f)
                        quadToRelative(5.0f, 11.0f, 1.5f, 23.0f)
                        reflectiveQuadTo(502.0f, 347.0f)
                        close()
                        moveTo(525.0f, 746.0f)
                        quadToRelative(-11.0f, 6.0f, -22.5f, 2.0f)
                        reflectiveQuadTo(485.0f, 733.0f)
                        lineToRelative(-40.0f, -80.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -22.5f)
                        reflectiveQuadTo(458.0f, 613.0f)
                        quadToRelative(11.0f, -5.0f, 23.0f, -1.0f)
                        reflectiveQuadToRelative(18.0f, 15.0f)
                        lineToRelative(40.0f, 79.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 22.5f)
                        reflectiveQuadTo(525.0f, 746.0f)
                        close()
                        moveTo(712.0f, 746.0f)
                        quadToRelative(-11.0f, 6.0f, -23.0f, 2.0f)
                        reflectiveQuadToRelative(-18.0f, -15.0f)
                        lineTo(531.0f, 453.0f)
                        quadToRelative(-5.0f, -11.0f, -1.0f, -22.5f)
                        reflectiveQuadToRelative(15.0f, -17.5f)
                        quadToRelative(11.0f, -5.0f, 22.5f, -1.5f)
                        reflectiveQuadTo(585.0f, 426.0f)
                        lineToRelative(140.0f, 280.0f)
                        quadToRelative(5.0f, 11.0f, 1.5f, 22.5f)
                        reflectiveQuadTo(712.0f, 746.0f)
                        close()
                        moveTo(773.0f, 507.0f)
                        quadToRelative(-11.0f, 6.0f, -22.5f, 1.5f)
                        reflectiveQuadTo(733.0f, 493.0f)
                        lineTo(613.0f, 253.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -22.5f)
                        reflectiveQuadTo(626.0f, 213.0f)
                        quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                        reflectiveQuadToRelative(18.0f, 14.5f)
                        lineToRelative(120.0f, 240.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 23.5f)
                        reflectiveQuadTo(773.0f, 507.0f)
                        close()
                        moveTo(893.0f, 747.0f)
                        quadToRelative(-11.0f, 6.0f, -22.5f, 1.5f)
                        reflectiveQuadTo(853.0f, 733.0f)
                        lineToRelative(-60.0f, -120.0f)
                        quadToRelative(-5.0f, -11.0f, -1.5f, -22.5f)
                        reflectiveQuadTo(806.0f, 573.0f)
                        quadToRelative(11.0f, -5.0f, 23.0f, -1.5f)
                        reflectiveQuadToRelative(18.0f, 14.5f)
                        lineToRelative(60.0f, 120.0f)
                        quadToRelative(5.0f, 11.0f, 1.0f, 23.5f)
                        reflectiveQuadTo(893.0f, 747.0f)
                        close()
                    }
                }
                    .build()
            }
        }
}
