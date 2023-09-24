package io.aoriani.weather.ui.screens.detail.components

import androidx.compose.ui.test.assertAny
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onChildren
import androidx.compose.ui.test.onNodeWithTag
import io.aoriani.weather.ui.TestTags
import io.aoriani.weather.ui.screens.detail.models.TemperatureModel
import io.aoriani.weather.ui.theme.WeatherAppTheme
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class TemperatureModuleKtTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `Verify that temperature gauges are set correctly`() {
        composeTestRule.setContent {
            WeatherAppTheme {
                TemperatureModule(
                    temperatureModel = TemperatureModel(
                        current = 71.5,
                        feelsLike = 68.0,
                        min = 55.9,
                        max = 79.0
                    )
                )
            }
        }

        composeTestRule.onNodeWithTag(TestTags.tempGauge).onChildren()
            .assertAny(hasText("71.5", substring = true))
        composeTestRule.onNodeWithTag(TestTags.feelsLikeGauge).onChildren()
            .assertAny(hasText("68.0", substring = true))
        composeTestRule.onNodeWithTag(TestTags.minTempGauge).onChildren()
            .assertAny(hasText("55.9", substring = true))
        composeTestRule.onNodeWithTag(TestTags.maxTempGauge).onChildren()
            .assertAny(hasText("79.0", substring = true))
    }
}