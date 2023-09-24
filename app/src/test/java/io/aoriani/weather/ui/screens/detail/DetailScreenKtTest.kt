package io.aoriani.weather.ui.screens.detail

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.test.assertAny
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onChildren
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import io.aoriani.weather.domain.models.Weather
import io.aoriani.weather.ui.TestTags
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class DetailScreenKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    private val fakeWeather = Weather(
        id = 1,
        name = "San Bruno",
        condition = Weather.Condition.Clear,
        temperature = 69.0,
        feelsLikeTemperature = 65.5,
        minTemperature = 61.2,
        maxTemperature = 73.4,
        humidity = 33
    )

    @Test
    fun `Verify that detail screen is setup correctly`() {
        var navigateUpWasTapped = false
        composeTestRule.setContent {
            DetailScreen(
                viewModel = object : DetailViewModel {
                    override val weather: State<Weather?> = mutableStateOf(fakeWeather)
                },
                navigateUp = { navigateUpWasTapped = true }
            )
        }

        composeTestRule.onNodeWithText("San Bruno").assertIsDisplayed()

        composeTestRule.onNodeWithTag(TestTags.tempGauge).onChildren()
            .assertAny(hasText("69.0°F", substring = true))
        composeTestRule.onNodeWithTag(TestTags.feelsLikeGauge).onChildren()
            .assertAny(hasText("65.5°F", substring = true))
        composeTestRule.onNodeWithTag(TestTags.minTempGauge).onChildren()
            .assertAny(hasText("61.2°F", substring = true))
        composeTestRule.onNodeWithTag(TestTags.maxTempGauge).onChildren()
            .assertAny(hasText("73.4°F", substring = true))

        composeTestRule.onNodeWithText("33%").assertExists()

        composeTestRule.onNodeWithTag(TestTags.navigateUpButton).performClick()
        assertTrue(navigateUpWasTapped)

    }
}

