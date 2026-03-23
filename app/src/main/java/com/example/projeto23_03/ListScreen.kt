package com.example.projeto23_03

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

data class User(
    val id: Int,
    val name: String,
    val email: String
)

@Composable
fun ListScreen(navController: NavController){
    val user  = listOf(
        User(1, "João Java", "joao@java.com"),
        User(2, "Maria Python", "maria@python.com"),
        User(3, "Carlos C++", "carlos@cmaismais.com"),
        User(4, "Ana JavaScript", "ana@javascript.com")
    )

    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize()
    ) {
        Text(
            "Lista de Usuários",
            style = MaterialTheme.typography.headlineSmall
        )
        user.forEach { user ->
            Text(
                text = "${user.name} - ${user.email}",
                style = MaterialTheme.typography.bodyLarge,
                color = Color.Blue,
                modifier = Modifier.padding(vertical = 8.dp)
                    .clickable {
                        navController.navigate("details/${user.id}")
                    }
            )
        }
    }
}







