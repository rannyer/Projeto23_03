package com.example.projeto23_03.ExemploHibrido

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun App2(){
    var isLoogedIn by remember { mutableStateOf(false) }


    if(isLoogedIn){
        MainGraph { isLoogedIn = false }
    }else{
        AuthGraph { isLoogedIn = true }
    }
}