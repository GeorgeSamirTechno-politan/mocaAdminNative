package com.technopolitan.mocaadmin.ui.theme

import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.technopolitan.mocaadmin.R

val GTFont = FontFamily(
    Font(R.font.gt_light, FontWeight.Light),
    Font(R.font.gt_regular, FontWeight.Normal),
    Font(R.font.gt_meduim, FontWeight.Medium),
    Font(R.font.gt_bold, FontWeight.Bold),
    Font(R.font.gt_oblique, FontWeight.SemiBold),
    Font(R.font.gt_ultra_bold, FontWeight.SemiBold)
)

// Set of Material typography styles to start with
val Typography = Typography(
//    defaultFontFamily = GTFont
)

val Typography.regularStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_regular),
        fontSize = 16.sp
    )

val Typography.mediumStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_meduim),
        fontSize = 16.sp
    )

val Typography.lightStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_light),
        fontSize = 16.sp
    )

val Typography.obliqueStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_oblique),
        fontSize = 16.sp
    )

val Typography.ultraBold: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_ultra_bold),
        fontSize = 16.sp
    )

val Typography.boldStyle: TextStyle
    @Composable
    get() = TextStyle(
        fontStyle = FontStyle(R.font.gt_bold),
        fontSize = 16.sp
    )

