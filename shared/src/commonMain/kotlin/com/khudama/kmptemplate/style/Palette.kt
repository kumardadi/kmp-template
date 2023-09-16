package com.khudama.kmptemplate.style

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProvideTextStyle
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

object TemplateColors {
    val ToastBackground = Color(23, 23, 23)
    val TranslucentBlack = Color(0, 0, 0, 60)
    val Transparent = Color.Transparent

    val background = Color(0xFFFFFFFF)
    val onBackground = Color(0xFF19191C)

    val fullScreenImageBackground = Color(0xFF19191C)

    val uiLightBlack = Color(25, 25, 28, 180)
    val noteBlockBackground = Color(0xFFF3F3F4)

    fun buttonBackground(isHover: Boolean) = if (isHover) TranslucentBlack else Transparent
}

@Composable
fun TemplateTheme(content: @Composable () -> Unit) {
    isSystemInDarkTheme() // todo check and change colors
    MaterialTheme(
        colorScheme = MaterialTheme.colorScheme.copy(
            background = TemplateColors.background,
            onBackground = TemplateColors.onBackground
        )
    ) {
        ProvideTextStyle(LocalTextStyle.current.copy(letterSpacing = 0.sp)) {
            content()
        }
    }
}
