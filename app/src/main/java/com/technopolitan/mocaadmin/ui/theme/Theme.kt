package com.technopolitan.mocaadmin.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = accentColor,
    primaryVariant = yellowColor,
    secondary = lightRedColor,
    background = whiteColor,
    onError = redColor,
    error = redColor,
    onBackground = whiteColor,
)

private val LightColorPalette = lightColors(
    primary = accentColor,
    primaryVariant = yellowColor,
    secondary = lightRedColor,
    background = whiteColor,
    onError = redColor,
    error = redColor,
    onBackground = whiteColor,
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun MocaAdminTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
//        typography = Typography,
        shapes = Shapes,
        content = content
    )
}