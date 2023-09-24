package io.aoriani.weather.ui.screens.common.models

import androidx.compose.ui.test.junit4.createComposeRule
import io.aoriani.weather.domain.models.Weather
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ConditionIconKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `Verify that mapping between Condion and icons works correctly`() {
        composeTestRule.setContent {
            assertEquals("Outlined.Thunderstorm", Weather.Condition.Thunderstorm.icon.name)
            assertEquals("rainy_light", Weather.Condition.Drizzle.icon.name)
            assertEquals("rainy", Weather.Condition.Rain.icon.name)
            assertEquals("weather_snowy", Weather.Condition.Snow.icon.name)
            assertEquals("mist", Weather.Condition.Mist.icon.name)
            assertEquals("Outlined.Air", Weather.Condition.Smoke.icon.name)
            assertEquals("Outlined.Dehaze", Weather.Condition.Haze.icon.name)
            assertEquals("tornado", Weather.Condition.Tornado.icon.name)
            assertEquals("clear_day", Weather.Condition.Clear.icon.name)
            assertEquals("partly_cloudy_day", Weather.Condition.Cloudy.icon.name)
            assertEquals("local_florist", Weather.Condition.Other.icon.name)
        }
    }
}