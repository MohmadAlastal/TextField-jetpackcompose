package com.example.textfieldjetpackcompose.widget

import android.widget.NumberPicker.OnValueChangeListener
import androidx.annotation.StringRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.textfieldjetpackcompose.R
import com.example.textfieldjetpackcompose.ui.theme.Colororing
import com.example.textfieldjetpackcompose.util.TextFieldType


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    text: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    color: Color,
    cornerRadius: Dp = 0.dp,
    textStyle: TextStyle,
    @StringRes hint: Int,
    hintTextStyle: TextStyle,
    type: TextFieldType

) {


    var passwordVisible by remember {
        mutableStateOf(true)
    }

    var trailingId =
        when (type) {               // بشوف ال TextField  اذا نوعه كلمة سر بظهر الايقونة
            TextFieldType.Password -> R.drawable.ic_visibility_on
            else -> null
        }


    if (trailingId != null) {   //   اذا كان TextField ظاهر النص فيه بظهر ايقونة اخفاء النص و العكس صحيح
        trailingId =
            if (passwordVisible) R.drawable.ic_visibility_off else R.drawable.ic_visibility_on
    }


    TextField(
        value = text,
        onValueChange = onValueChange,
        shape = RoundedCornerShape(cornerRadius),
       // modifier = modifier.background(color = color , shape = RoundedCornerShape(cornerRadius)),
        modifier = modifier,

        textStyle = textStyle,
        label = {
            Text(         //hintText
                text = stringResource(id = hint),
                style = hintTextStyle,
                softWrap = true
            )
        },
        colors = TextFieldDefaults.textFieldColors(   // لازالة الخط الي تحت فيtextField وتغيير لون مؤشر الكلام
            cursorColor = Color.Red, // المؤشر تبع النص
            unfocusedIndicatorColor = Color.Transparent, //الخط الي تحت النص انه يضل ظاهر
            disabledIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent, //الخط الي تحت النص
            containerColor = color,

            ),
        visualTransformation = if (type == TextFieldType.Password) { //اخفاء النص حسب الايقونة
            if (passwordVisible) PasswordVisualTransformation() else VisualTransformation.None
        } else VisualTransformation.None,
        trailingIcon = {         // الايقونة الي اخر ال TextField
            if (trailingId != null) {     // معناها انه TextField هوا من نوع password
                Icon(
                    painter = painterResource(id = trailingId),
                    contentDescription = "password",
                    tint = Colororing,
                    modifier = Modifier.clickable {
                        passwordVisible = !passwordVisible
                    }
                )
            }
        }
    )
}
