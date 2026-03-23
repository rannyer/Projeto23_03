package com.example.projeto23_03

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.*
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.navDeepLink


@Composable
fun AppNavigation() {

    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {

        navigation(
            route = "auth",
            startDestination = "login"
        ) {
            composable("login") {
                LoginScreen(onLoginSuccess = {
                    navController.navigate("main") {
                        popUpTo("auth") {
                            inclusive = true
                        }
                    }
                })
            }

            composable("register") {
                RegisterScreen()
            }
        }
        navigation(
            route = "main",
            startDestination = "home"

        ) {
            composable("home") {
                ListScreen(
                    navController = navController
                )
            }
        }

        navigation(
            route = "details",
            startDestination = "details/{id}"
        ) {
            composable(
                "details/{id}",
                arguments = listOf(navArgument("id") { type = NavType.IntType }),
                deepLinks = listOf(
                    navDeepLink {
                        uriPattern = "myapp://details/{id}"
                    }
                )

            ) { backStackEntry ->
                val id = backStackEntry.arguments?.getInt("id") ?: 0
                DetailsScreen(id)
            }



        }


    }
}
@Composable
fun HomeScreen(onItemClick: (id: Int) -> Unit) {
    TODO("Not yet implemented")
}

@Composable
fun RegisterScreen() {
    TODO("Not yet implemented")
}


@Composable
fun LoginScreen(onLoginSuccess: () -> Unit) {
    TODO("Not yet implemented")
}
