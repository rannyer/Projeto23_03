package com.example.projeto23_03.ExemploStateHosting

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun CounterRoute(){
    var count by remember { mutableStateOf(0) }
    var count2 by remember { mutableStateOf(value = 0) }

    Column() {
        CounterScreen(
            count = count,
            onIncrement = { count++},
            type = "Somar"
        )
        CounterScreen(
            count = count2,
            onIncrement = { count --},
            type = "Diminuir"
        )
    }
}