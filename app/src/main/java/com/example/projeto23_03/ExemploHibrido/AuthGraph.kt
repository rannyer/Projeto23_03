package com.example.projeto23_03.ExemploHibrido

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.projeto23_03.LoginScreen

@Composable
fun AuthGraph(
    onLoginSuccess: () -> Unit,
){
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") {
            LoginScreen(onLoginSuccess = onLoginSuccess)
        }
        composable("register"){
            RegisterScreen()
        }
    }
}