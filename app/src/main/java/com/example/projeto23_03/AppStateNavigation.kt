package com.example.projeto23_03

import androidx.compose.foundation.layout.Spacer
import androidx.compose.runtime.Composable

@Composable
fun AppStateNavigation(
    isLoggedIn: Boolean,
    isLoading: Boolean,
    onLoginSuccess: () -> Unit,
    onLogout: () -> Unit
) {
    when {
        isLoading -> SplashScreen()
        isLoggedIn -> HomeScreen(onLogout = onLogout)
        else -> LoginScreen(onLoginSuccess = onLoginSuccess)
    }
}