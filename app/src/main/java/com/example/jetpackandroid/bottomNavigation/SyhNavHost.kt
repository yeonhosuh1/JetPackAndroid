package com.example.jetpackandroid.bottomNavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpackandroid.feature.ChatScreen
import com.example.jetpackandroid.feature.HomeScreen
import com.example.jetpackandroid.feature.MyPageScreen
import com.example.jetpackandroid.feature.posts.PostsRoute

@Composable
fun SyhNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }
        composable(route = BottomBarScreen.Chat.route){
            ChatScreen()
        }
        composable(route = BottomBarScreen.Posts.route){
            PostsRoute()
        }
        composable(route = BottomBarScreen.MyPage.route){
            MyPageScreen()
        }
    }
}