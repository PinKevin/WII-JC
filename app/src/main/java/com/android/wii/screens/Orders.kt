package com.android.wii.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.android.wii.component.BottomBar
import com.android.wii.component.OrderCard
import com.android.wii.component.TopBar

@Composable
fun Orders(navController: NavController) {

    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        },
//        containerColor = MaterialTheme.colorScheme.primaryContainer,
        floatingActionButton = {
            ExtendedFloatingActionButton(
                onClick = { navController.navigate("order") },
                modifier = Modifier.padding(bottom = 8.dp),
                shape = MaterialTheme.shapes.large,
                containerColor = MaterialTheme.colorScheme.primary,
            ) {
                Icon(
                    imageVector = Icons.Filled.Add,
                    contentDescription = "Add"
                )
                Text(text = "Buat Pesanan", modifier = Modifier.padding(start = 8.dp))
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
        ) {
           items((1..50).toList()) { item ->
               OrderCard(navController = navController, data = item)
           }
        }
    }
}