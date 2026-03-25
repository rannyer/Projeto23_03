package com.example.projeto23_03.ExemploAppState

sealed class AppDestinationState {
    data object Loading : AppDestinationState()
    data object Unauthenticated : AppDestinationState()
    data object Authenticated : AppDestinationState()
}