package io.aoriani.weather.ui.screens.detail.components

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import io.aoriani.weather.domain.models.Weather
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class DetailContentKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `Verify that detail content is set correctly`() {
        composeTestRule.setContent {
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

        composeTestRule.onNodeWithText("33%", substring = true).assertExists()
    }
}