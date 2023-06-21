package com.example.jetpackandroid

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "home" ){

    }
}