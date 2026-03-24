package com.example.projeto23_03

import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import kotlinx.coroutines.delay


@Composable
fun App(){
    var isLoggedIn by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(3000) // Simula um carregamento de 3 segundos
        isLoading = false
    }

    AppStateNavigation(
        isLoading   = isLoading,
        isLoggedIn = isLoggedIn,
        onLoginSuccess = { isLoggedIn = true },
        onLogout = { isLoggedIn = false }
    )
}