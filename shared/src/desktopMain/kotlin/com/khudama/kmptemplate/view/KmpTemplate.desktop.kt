package com.khudama.kmptemplate.view

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*
import com.khudama.kmptemplate.*
import com.khudama.kmptemplate.style.TemplateTheme

@Composable
fun ApplicationScope.TemplateDesktop() {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Kmp Template",
        state = WindowState(
            position = WindowPosition.Aligned(Alignment.Center),
            size = DpSize(720.dp, 450.dp)
        )
    ) {
        TemplateTheme {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                TemplateCommon()
            }
        }
    }
}