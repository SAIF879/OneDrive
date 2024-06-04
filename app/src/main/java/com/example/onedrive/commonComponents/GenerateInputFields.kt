package com.example.onedrive.commonComponents

import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Transparent
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
@Composable
fun GenerateFillUpBox(
    detailText : MutableState<String>,
    placeHolder : String,
    modifier: Modifier = Modifier,
    keyboardType: KeyboardType = KeyboardType.Text,
    imeAction: ImeAction = ImeAction.Next,
    onAction: KeyboardActions = KeyboardActions.Default,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    enabled: Boolean = true,
    trailingIcon: ImageVector? = null,
    onClick : () -> Unit = {},
    onClickTrailingIcon: () -> Unit ={},

    ){
    Column() {
        Box(
            modifier = modifier
                .fillMaxWidth().clickable { onClick.invoke() }
                .height(80.dp).padding(20.dp , 10.dp)
                .border(1.dp, Gray, shape = RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
        ) {
            TextField(
                value = detailText.value,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 2.dp)
                    .align(Alignment.Center),
                onValueChange = { detailText.value = it },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Transparent,
                    unfocusedContainerColor = Transparent,
                    disabledContainerColor = Transparent,
                    focusedIndicatorColor = Transparent,
                    unfocusedIndicatorColor = Transparent,
                    cursorColor = Black,
                    focusedTextColor = Black,
                    unfocusedTextColor = Black,
                    disabledIndicatorColor = Transparent ,
                    disabledTextColor = Black,
                    focusedPlaceholderColor = Black,
                    unfocusedPlaceholderColor = Black,
                    disabledTrailingIconColor = Gray,
                    disabledLabelColor = Transparent,
                    focusedLabelColor = Transparent,
                    errorIndicatorColor = Transparent,
                    disabledPlaceholderColor = Black


                ),
                placeholder = {
                    Text(
                        text = placeHolder,
                        fontFamily = FontFamily.Default,
                        fontSize = 16.sp
                    )
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = keyboardType,
                    imeAction = imeAction
                ),
                visualTransformation = visualTransformation,
                keyboardActions = onAction,
                singleLine = true,
                textStyle = TextStyle(
                    fontFamily = FontFamily.Default,
                    fontSize = 16.sp
                ),
                trailingIcon = {
                    trailingIcon?.let {
                        Icon(imageVector = it, contentDescription = "icon",
                            modifier = Modifier.clickable(interactionSource = remember {
                                MutableInteractionSource()
                            }, indication = LocalIndication.current) {
                                onClickTrailingIcon?.invoke()
                            }
                            ,
                        )
                    }
                },
                enabled=enabled
            )
        }
    }
}