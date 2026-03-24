package com.example.projeto23_03.ExemploHibrido

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto23_03.HomeScreen

@Composable
fun MainGraph(
    onLoggout: () -> Unit
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(onLogout = onLoggout)
        }
        composable("profile") {
            ProfileScreen()
        }





    }


}