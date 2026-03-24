package com.example.projeto23_03

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController


@Composable
fun AppNavigation(
    onLogout: () -> Unit,
    onLoginSuccess: () -> Unit,
    isLoggedIn: Boolean
) {
    val navController = rememberNavController()
    val starDestination = if (isLoggedIn) "main_graph" else "auth_graph"

    NavHost(
        navController = navController,
        startDestination = starDestination
    ) {
        navigation(
            route = "auth_graph",
            startDestination = "login"
        ) {
            composable("login") {
                LoginScreen(onLoginSuccess = onLoginSuccess)
            }
        }
        navigation(
            startDestination = "home",
            route = "main_graph"
        ) {
            composable("home") {
                HomeScreen(onLogout = onLogout)
            }

        }
    }
}

