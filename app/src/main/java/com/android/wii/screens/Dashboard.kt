package com.android.wii.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                colors = topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                ),
                title = {
                    Text(
                        text = "WII",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        textAlign = TextAlign.Center
                    )
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .padding(10.dp)
        ) {
           items((1..50).toList()) { index ->
               Card(
                   modifier = Modifier
                       .fillParentMaxWidth()
                       .padding(8.dp)
                       .clickable { navController.navigate("orderDetail") }
               ) {
                   Text(text = "Pesanan $index", modifier = Modifier.padding(16.dp))
                   Text(text = "4 ayam bali", modifier = Modifier.padding(start = (16.dp)))
                   Text(text = "2 ayam bali krispi", modifier = Modifier.padding(start = (16.dp)))
                   Text(text = "1 nasi goreng derva", modifier = Modifier.padding(start = (16.dp)))
                   Text(text = "7 es teh", modifier = Modifier.padding(start = (16.dp), bottom = (18.dp)))

                   Row(
                       modifier = Modifier
                           .fillMaxWidth()
                           .padding(top = (16.dp)),
                   ) {
                       Button(
                           onClick = { navController.navigate("orderDetail") },
                           modifier = Modifier
                               .padding(
                                   start = (16.dp),
                                   bottom = (16.dp)
                               ),
                           colors = ButtonDefaults.buttonColors(
                               containerColor = MaterialTheme.colorScheme.background,
                               contentColor = MaterialTheme.colorScheme.onBackground
                           )
                       ) {
                           Text(text = "Detail")
                       }
                       Button(
                           onClick = { println("Cek") },
                           modifier = Modifier.padding(
                               start = (10.dp),
                               bottom = (16.dp)
                           )
                       ) {
                           Text(text = "Selesai")
                       }
                   }
               }
           }
        }
    }
}