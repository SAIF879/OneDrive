package com.example.onedrive.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.onedrive.mainflow.home.HomeScreen


fun NavGraphBuilder.homeNavGraph(navController: NavController){
    navigation(route = NavGraphs.HOME , startDestination = HomeScreens.HomeScreen.route ){
        composable(route = HomeScreens.HomeScreen.route){
            HomeScreen(navController = navController)
        }
    }
}
sealed class HomeScreens(val route:String){
    data object HomeScreen : HomeScreens(route = "home_screen")
}