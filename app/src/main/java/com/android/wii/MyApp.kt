package com.android.wii

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.wii.screens.Dashboard
import com.android.wii.screens.LoginScreen

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "dashboard") {
        composable("login") { LoginScreen(navController) }
        composable("dashboard") { Dashboard() }
    }
}