package com.example.textfieldjetpackcompose.widget
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.textfieldjetpackcompose.ui.theme.Colorb
import com.example.textfieldjetpackcompose.ui.theme.cairoFontNormalGray14
import com.example.textfieldjetpackcompose.ui.theme.cairoFontSemiBoldPlatinum16
import com.example.textfieldjetpackcompose.util.TextFieldType

@Composable
fun AuthenticationTextFields(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    @StringRes hint: Int,
    type: TextFieldType
) {
    CustomTextField(
        text = text,
        onValueChange = onValueChange,
        modifier = modifier,
        color = Colorb,
        textStyle = cairoFontSemiBoldPlatinum16,
        hint = hint,
        hintTextStyle = cairoFontNormalGray14,
        cornerRadius = 10.dp,
        type = type

    )
}