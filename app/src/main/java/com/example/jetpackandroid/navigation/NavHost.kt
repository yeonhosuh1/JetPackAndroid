package com.example.jetpackandroid.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackandroid.R

@Composable
fun NiaNavHost(
    startDestination: String = R.string.first_page_name.toString(),
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ){
        composable(R.string.first_page_name.toString()) {
            //Home(/*...*/)
        }
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