package com.example.jetpackandroid

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.jetpackandroid.screen.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //MyApp()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp() {
    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    selected = true,
                    onClick = { /* 처리할 작업 */ },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
                    label = { Text(text = stringResource(R.string.first_page_name)) }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /* 처리할 작업 */ },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Message") },
                    label = { Text(text = stringResource(R.string.second_page_name)) }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /* 처리할 작업 */ },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Profile") },
                    label = { Text(text = stringResource(R.string.third_page_name)) }
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /* 처리할 작업 */ },
                    icon = { Icon(Icons.Default.Home, contentDescription = "Settings") },
                    label = { Text(text = stringResource(R.string.fourth_page_name)) }
                )
            }
        }
    ) {
        Home()
    }
}
