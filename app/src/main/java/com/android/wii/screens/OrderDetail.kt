package com.android.wii.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.android.wii.component.BottomBar
import com.android.wii.component.TopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderDetail(navController: NavController) {
    Scaffold(
        topBar = {
            TopBar(title = "Pesanan X")
        },
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) {innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(10.dp)
        ) {
            Text(text = "4 ayam bali", modifier = Modifier.padding(start = (16.dp)))
            Text(text = "2 ayam bali krispi", modifier = Modifier.padding(start = (16.dp)))
            Text(text = "1 nasi goreng derva", modifier = Modifier.padding(start = (16.dp)))
            Text(text = "7 es teh", modifier = Modifier.padding(start = (16.dp), bottom = (18.dp)))
        }
    }
}