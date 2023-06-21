package com.example.jetpackandroid.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.jetpackandroid.R
import com.example.jetpackandroid.feature.Chat
import com.example.jetpackandroid.feature.MyPage
import com.example.jetpackandroid.feature.Posts
import com.example.jetpackandroid.feature.homeScreen

@Composable
fun SyhNavHost(
    startDestination: String = R.string.first_page_name.toString(),
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
    ){
        composable(route = R.string.first_page_name.toString()) {
            homeScreen()
        }
        composable(route = R.string.second_page_name.toString()) {
            Chat()
        }
        composable(route = R.string.third_page_name.toString()) {
            Posts()
        }
        composable(route = R.string.fourth_page_name.toString()) {
            MyPage()
        }
        /*chatScreen(
            onTopicClick = navController::navigateToTopic,
            onShowSnackbar = onShowSnackbar,
        )
        postScreen(
            onBackClick = navController::popBackStack,
            onInterestsClick = { appState.navigateToTopLevelDestination(INTERESTS) },
            onTopicClick = navController::navigateToTopic,
        )
        myPageGraph(
            onTopicClick = { topicId ->
                navController.navigateToTopic(topicId)
            },
            nestedGraphs = {
                topicScreen(
                    onBackClick = navController::popBackStack,
                    onTopicClick = {},
                )
            },
        )*/
    }
}


