package com.example.textfieldjetpackcompose.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.textfieldjetpackcompose.R


val CairoFont = FontFamily(
    Font(R.font.cairo_regular),
    Font(R.font.cairo_semi_bold, weight = FontWeight.SemiBold),
)


val cairoFontSemiBoldPlatinum16 =
    TextStyle(
        fontFamily = CairoFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = ColorBLack // لون الحقل تبع ال TextField
    )


val cairoFontNormalGray14 =
    TextStyle(
        fontFamily = CairoFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = ColorGraniteGray
    )


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)