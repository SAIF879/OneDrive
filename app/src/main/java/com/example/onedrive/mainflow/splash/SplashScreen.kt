package com.example.onedrive.mainflow.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.onedrive.navigation.NavGraphs
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


@Composable
fun SplashScreen(navController: NavController) {
    val coroutineScope = rememberCoroutineScope()
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            StyledText(mainText = "OneClick", styledText ="Drive" )
            splashNavigation(coroutineScope , navController)
        }
    }
}

fun splashNavigation(coroutineScope: CoroutineScope, navController: NavController) {
    coroutineScope.launch {
        delay(1500)
        navController.navigate(NavGraphs.HOME)
    }
}

@Composable
fun StyledText(
    mainText: String,
    styledText: String,
    mainTextStyle: SpanStyle = SpanStyle(
        color = Color.Black,
        fontSize = 16.sp
    ),
    styledTextStyle: SpanStyle = SpanStyle(
        color = Color.Red,
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold
    )
) {
    val annotatedString = buildAnnotatedString {
        withStyle(style = mainTextStyle) {
            append(mainText.substringBefore(styledText))
        }
        withStyle(style = styledTextStyle) {
            append(styledText)
        }
    }

    Text(text = annotatedString)
}
