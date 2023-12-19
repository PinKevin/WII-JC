package com.android.wii

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.wii.screens.Dashboard
import com.android.wii.screens.LoginScreen
import com.android.wii.screens.OrderDetail
import com.android.wii.screens.Orders
import com.android.wii.screens.Profile

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("login") { LoginScreen(navController) }
        composable("home") { Dashboard(navController) }
        composable("profile") { Profile(navController) }
        composable("orders") { Orders(navController) }
        composable("orderDetail/{orderId}") { backStackEntry ->
            val orderId = backStackEntry.arguments?.getString("orderId")
            OrderDetail(navController, orderId) }
    }
}