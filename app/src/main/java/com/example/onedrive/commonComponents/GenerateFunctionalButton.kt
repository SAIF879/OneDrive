package com.example.onedrive.commonComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun GenerateFunctionalButton(
    text: String,
    horizontalPadding: Int,
    verticalPadding: Int,
    isEnabled: Boolean,
    modifier: Modifier = Modifier,
    height : Int = 72,
    onClick: () -> Unit = {}
) {
    Button(
        onClick = { onClick.invoke() },
        modifier = modifier
            .fillMaxWidth()
            .height(height.dp)
            .padding(horizontalPadding.dp, verticalPadding.dp),


        colors = ButtonDefaults.buttonColors(containerColor = Color.Red  , disabledContainerColor = Color.Transparent,  ),
        shape = RoundedCornerShape(10.dp),
        enabled = isEnabled
    ) {

        if (isEnabled){
            Text(text = text , color = Color.Black)
        }
    }
}
