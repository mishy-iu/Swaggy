package com.mitchelle.swaggy.ui.screens.auth

import android.widget.Toast
import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.mitchelle.swaggy.R
import com.mitchelle.swaggy.navigation.ROUT_DASHBOARD2
import com.mitchelle.swaggy.navigation.ROUT_HOME
import com.mitchelle.swaggy.navigation.ROUT_REGISTER
import com.mitchelle.swaggy.viewmodel.AuthViewModel

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun LoginScreen(
    authViewModel: AuthViewModel,
    navController: NavController,
    onLoginSuccess: () -> Unit
) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    val context = LocalContext.current

    // Observe login logic
    LaunchedEffect(authViewModel) {
        authViewModel.loggedInUser = { user ->
            if (user == null) {
                Toast.makeText(context, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            } else {
                if (user.role == "Buyer") {
                    navController.navigate(ROUT_DASHBOARD2)
                } else {
                    navController.navigate(ROUT_HOME)
                }
            }
        }
    }

    // Animate scale for login button
    val scale = remember { Animatable(0.9f) }
    LaunchedEffect(Unit) {
        scale.animateTo(
            targetValue = 1f,
            animationSpec = tween(durationMillis = 800, easing = EaseOutBack)
        )
    }

    // Background Gradient
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    listOf(Color(0xFF17F5D5), Color(0xFFCFDEF3))
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Welcome Text Animation
            AnimatedVisibility(
                visible = true,
                enter = fadeIn(animationSpec = tween(1000)) + slideInVertically(initialOffsetY = { -40 }),
                exit = fadeOut(animationSpec = tween(1000))
            ) {
                Text(
                    text = "Welcome Dear User!",
                    fontSize = 36.sp,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A237E)
                )
            }

            Spacer(modifier = Modifier.height(36.dp))

            // Email Input Animation
            AnimatedVisibility(
                visible = true,
                enter = slideInHorizontally(initialOffsetX = { -200 }) + fadeIn(tween(700))
            ) {
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text("Email") },
                    leadingIcon = { Icon(Icons.Filled.Email, contentDescription = null) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0x40FFFFFF), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.Black),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF1E88E5),
                        unfocusedBorderColor = Color.Gray,
                        cursorColor = Color(0xFF1E88E5)
                    )
                )
            }

            Spacer(modifier = Modifier.height(12.dp))

            // Password Input Animation
            AnimatedVisibility(
                visible = true,
                enter = slideInHorizontally(initialOffsetX = { 200 }) + fadeIn(tween(700))
            ) {
                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text("Password") },
                    leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = null) },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color(0x40FFFFFF), RoundedCornerShape(12.dp)),
                    shape = RoundedCornerShape(12.dp),
                    textStyle = MaterialTheme.typography.bodyLarge.copy(color = Color.Black),
                    trailingIcon = {
                        val icon = if (passwordVisible)
                            painterResource(R.drawable.passwordshow)
                        else
                            painterResource(R.drawable.passwordhide)
                        IconButton(onClick = { passwordVisible = !passwordVisible }) {
                            Icon(icon, contentDescription = null)
                        }
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(0xFF1E88E5),
                        unfocusedBorderColor = Color.Gray,
                        cursorColor = Color(0xFF1E88E5)
                    )
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Animated Login Button
            Box(
                modifier = Modifier
                    .scale(scale.value)
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(Color(0xFF00C6FF), Color(0xFF00FFAE))
                        ),
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        if (email.isBlank() || password.isBlank()) {
                            Toast.makeText(context, "Please enter email and password", Toast.LENGTH_SHORT).show()
                        } else {
                            authViewModel.loginUser(email, password)
                        }
                    },
                    modifier = Modifier.fillMaxSize(),
                    colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                    shape = RoundedCornerShape(12.dp),
                    elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp)
                ) {
                    Text("Login", color = Color.White, fontWeight = FontWeight.Bold)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Register Button
            TextButton(onClick = { navController.navigate(ROUT_REGISTER) }) {
                Text(
                    "Don't have an account? Register",
                    color = Color(0xFF1A727E),
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }
}
