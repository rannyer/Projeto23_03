package com.example.projeto23_03

import androidx.compose.runtime.Composable
import androidx.compose.runtime.*


@Composable
fun App(){
    var isLoggedIn by remember { mutableStateOf(false) }


    AppNavigation(
        isLoggedIn = isLoggedIn,
        onLoginSuccess = { isLoggedIn = true },
        onLogout = { isLoggedIn = false }
    )
}