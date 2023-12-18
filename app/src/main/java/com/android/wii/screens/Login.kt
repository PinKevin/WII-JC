package com.android.wii.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Selamat datang di WII App"
            )
            Text(
                text = "Login terlebih dahulu",
                modifier = Modifier.padding(bottom = (20.dp))
            )
            TextField(
                value = email,
                onValueChange = {email = it},
                label = {Text("Email")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            )
            TextField(
                value = password,
                onValueChange = {password = it},
                label = {Text("Password")},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                visualTransformation = PasswordVisualTransformation()
            )
            Button(
                onClick = { loginButtonHandler(email, password, navController, scope, snackbarHostState) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
            ) {
                Text(text = "Login")
            }
        }
    }
}

private fun loginButtonHandler(
    email: String,
    password: String,
    navController: NavController,
    coroutineScope: CoroutineScope,
    snackbarHostState: SnackbarHostState
) {
    if (email == "email" && password == "email") {
        navController.navigate("dashboard")
    } else {
        coroutineScope.launch {
            snackbarHostState.showSnackbar(
                message = "Login gagal",
                duration = SnackbarDuration.Short
            )
        }
    }
}

