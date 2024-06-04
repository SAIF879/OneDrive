package com.example.onedrive.mainflow.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.onedrive.commonComponents.GenerateFillUpBox
import com.example.onedrive.commonComponents.GenerateFunctionalButton


@Composable
fun HomeScreen(navController: NavController){

    val intersectionAmount = remember {
        mutableStateOf("0")
    }

    val unionAmount = remember {
        mutableStateOf("0")
    }

    val highestNumber = remember {
        mutableStateOf("0")
    }



    Box(modifier = Modifier.fillMaxSize() ){

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            GenerateFillUpBox(detailText = intersectionAmount, placeHolder ="" )
            GenerateFillUpBox(detailText = unionAmount, placeHolder ="" )
            GenerateFillUpBox(detailText = highestNumber, placeHolder ="" )
            GenerateFunctionalButton(
                text = "Calculate",
                horizontalPadding = 20,
                verticalPadding = 10,
                isEnabled = true
            )
            
        }


    }

}