package com.example.jetpackandroid

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Notifications
import  androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = Icons.Default.Home
    )
    object Chat: BottomBarScreen(
        route = "chat",
        title = "Chat",
        icon = Icons.Default.Notifications
    )
    object Posts: BottomBarScreen(
        route = "posts",
        title = "Posts",
        icon = Icons.Default.List
    )
    object MyPage: BottomBarScreen(
        route = "myPage",
        title = "MyPage",
        icon = Icons.Default.AccountBox
    )
}
