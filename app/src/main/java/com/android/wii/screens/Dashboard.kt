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
import com.android.wii.component.TopBar

@Composable
fun Dashboard(navController: NavController) {
    var isHomeButtonActive by remember { mutableStateOf(true) }

    Scaffold(
        topBar = {
            TopBar(title = "WII")
        },
        bottomBar = {
            BottomBar(navController = navController)
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
                       .clickable {
                           navController.navigate("orderDetail")
                           isHomeButtonActive = false
                       }
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