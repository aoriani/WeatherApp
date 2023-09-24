package io.aoriani.weather.ui.screens.common.models

import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class TemperatureFormatterKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `Verify that temperatures are formatted correctly`() {
        var formmattedTemp = ""
        composeTestRule.setContent {
            formmattedTemp = 75.9.formatAsFahrenheit()
        }

        assertEquals("75.9°F", formmattedTemp)
    }
}