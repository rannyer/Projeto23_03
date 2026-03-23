package com.example.projeto23_03

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DetailsScreen(id:Int){
    Column(
        modifier = Modifier.padding(16.dp)
            .fillMaxSize()

    ) {
        Text(
            "Detalhes do Usuário",
            style = MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.padding(16.dp))
        Text(
            "ID do Usuário: $id",
            style = MaterialTheme.typography.bodyLarge
        )

    }












}