package com.example.projeto23_03.ExemploStateHosting

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun CounterScreen(
    count: Int,
    onIncrement: () -> Unit,
    type: String
) {
    Column {
        Text("Count: $count")
        Button(onClick = {onIncrement}) {
            Text(type)
        }
    }

}