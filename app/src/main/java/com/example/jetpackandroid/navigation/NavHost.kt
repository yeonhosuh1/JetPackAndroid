package com.example.jetpackandroid.navigation

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackandroid.R
import com.example.jetpackandroid.screen.Home

@Composable
fun SyhNavHost(
    startDestination: String = R.string.first_page_name.toString(),
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ){
        composable(R.string.second_page_name.toString()) {
            //Chat(/*...*/)
        }
        composable(R.string.third_page_name.toString()) {
            //Posts(/*...*/)
        }
        composable(R.string.fourth_page_name.toString()) {
            //MyPage(/*...*/)
        }
    }
}

