package com.example.jetpackandroid.feature.posts.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val postsRoute = "posts_route"

fun NavController.navigateToBookmarks(navOptions: NavOptions? = null) {
    this.navigate(postsRoute, navOptions)
}

fun NavGraphBuilder.postScreen(
    onTopicClick: (String) -> Unit,
){
    composable(route = postsRoute) {
        //PostsRoute(onTopicClick, onShowSnackbar)
    }
}