package com.android.wii.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.ListItemDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OrderCard(navController: NavController, data: Any) {
    var isHomeButtonActive by remember { mutableStateOf(true) }

    ListItem(
        colors = ListItemDefaults.colors(
            containerColor = MaterialTheme.colorScheme.inverseOnSurface,
            headlineColor = MaterialTheme.colorScheme.primary
        ),
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 16.dp)
            .background(
                color = MaterialTheme.colorScheme.inverseOnSurface,
                shape = MaterialTheme.shapes.large
            )
            .padding(5.dp)
            .fillMaxWidth()
            .clickable { navController.navigate("orderDetail/$data" )
        },
        headlineContent = { Text("Pesanan #$data") },
        supportingContent = { Text("Meja $data") },
        leadingContent = {
            Icon(
                Icons.Filled.ShoppingCart,
                contentDescription = "Localized description",
            )
        }
    )
}
