package com.example.textfieldjetpackcompose.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfieldjetpackcompose.R
import com.example.textfieldjetpackcompose.ui.theme.ColorGunmetal
import com.example.textfieldjetpackcompose.util.TextFieldType
import com.example.textfieldjetpackcompose.widget.AuthenticationTextFields

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TestTextFieldScreen(){

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }


    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = ColorGunmetal)
    ) {
        AuthenticationTextFields(text = email, onValueChange = { email = it}, modifier =  Modifier.fillMaxWidth(0.85f) , hint = R.string.email , type = TextFieldType.Email )
        Spacer(modifier = Modifier.height(20.dp))
        AuthenticationTextFields(text = password, onValueChange = {  password = it } , modifier = Modifier.fillMaxWidth(0.85f), hint = R.string.password, type = TextFieldType.Password )
         OutlinedTextField(value = email, onValueChange ={ email = it},
                 label = {
             Text(text = "Round corner" , color = Color.Red)
         },
             shape = RoundedCornerShape(25.dp),

             modifier = Modifier
                 .fillMaxWidth()
                 .padding(horizontal = 20.dp)
                 .padding(top = 10.dp),
             colors = TextFieldDefaults.outlinedTextFieldColors(
                 unfocusedBorderColor = Color.Yellow,
                 containerColor = Color.Green,  //Here you can change the background
                 focusedBorderColor = Color.Yellow ,
                 textColor = Color.Red),
//             colors = TextFieldDefaults.textFieldColors(
//                 textColor = Color.Red,
//                 disabledTextColor = Color.Transparent,
//                 containerColor = Color.Green,
//                 focusedIndicatorColor = Color.Transparent,
//                 unfocusedIndicatorColor = Color.Red,
//                 disabledIndicatorColor = Color.Transparent
//             ),
         )


    }
}


@Composable
@Preview
fun TestTextFieldScreenPreview() {

    TestTextFieldScreen()
}