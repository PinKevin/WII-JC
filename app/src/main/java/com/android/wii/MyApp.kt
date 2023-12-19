package com.android.wii

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.room.Room
import com.android.wii.data.AppDatabase
import com.android.wii.data.dao.MejaDao
import com.android.wii.data.dao.MenuDao
import com.android.wii.data.dao.WarungDao
import com.android.wii.data.repository.AppRepository
import com.android.wii.screens.Dashboard
import com.android.wii.screens.LoginScreen
import com.android.wii.screens.OrderDetail

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "dashboard") {
        composable("login") { LoginScreen(navController) }
        composable("dashboard") { Dashboard(navController) }
        composable("orderDetail/{orderId}") { backStackEntry ->
            val orderId = backStackEntry.arguments?.getString("orderId")
            OrderDetail(navController, orderId) }
    }
}