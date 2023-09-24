package io.aoriani.weather.ui.screens.detail.models

import androidx.compose.ui.test.junit4.createComposeRule
import io.aoriani.weather.domain.models.Weather
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class)
class TemperatureModelKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `Verify that temperature Model maps correct`() {

        val weather = Weather(
            id = 1L,
            name = "San Bruno",
            condition = Weather.Condition.Clear,
            temperature = 69.0,
            feelsLikeTemperature = 65.5,
            minTemperature = 61.2,
            maxTemperature = 73.4,
            humidity = 33
        )

        val temperatureModel = weather.toTemperatureModel()

        composeTestRule.setContent {
            assertEquals("69.0°F", temperatureModel.current())
            assertEquals("65.5°F", temperatureModel.feelsLike())
            assertEquals("61.2°F", temperatureModel.min())
            assertEquals("73.4°F", temperatureModel.max())
        }
    }
}