package com.example.projeto23_03.ExemploViewModel

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.projeto23_03.AppStateNavigation

@Composable
fun App3() {


    val appViewModel: AppViewModel = viewModel()

    AppStateNavigation(
        isLoading = appViewModel.isLoading,
        isLoggedIn = appViewModel.isLoggedIn,
        onLoginSuccess = {appViewModel.login()},
        onLogout = {appViewModel.loggout()}
    )
}