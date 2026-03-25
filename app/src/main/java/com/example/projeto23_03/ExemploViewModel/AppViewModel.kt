package com.example.projeto23_03.ExemploViewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel


class AppViewModel : ViewModel() {

    var isLoading by mutableStateOf(true)
        private set

    var isLoggedIn by mutableStateOf(false)
        private set

    fun finishLoading(){
        isLoading = false
    }

    fun login(){
        isLoggedIn = true
    }
    fun loggout(){
        isLoggedIn = false
    }








}