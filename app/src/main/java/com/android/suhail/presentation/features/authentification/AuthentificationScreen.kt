package com.android.suhail.presentation.features.authentification

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.suhail.presentation.features.authentification.connectwithpass.ConnectWithUAEPassScreen
import com.android.suhail.presentation.features.authentification.forgotpassword.ForgotPasswordScreen
import com.android.suhail.presentation.features.authentification.signIn.signInScreen
import com.android.suhail.presentation.features.authentification.signUp.signUpScreen

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023. All rights reserved.
 */
@Composable
fun AuthentificationScreen() {
 val authentificationNavController = rememberNavController()
 MaterialTheme {
  NavHost(
   navController = authentificationNavController,
   startDestination = AuthentificationRoutes.SignUp.route
  ) {
   composable(route = AuthentificationRoutes.SignUp.route) {
    signUpScreen(
     authentificationNavController
    )
   }
   composable(route = AuthentificationRoutes.SignIn.route) {
    signInScreen(
     authentificationNavController
    )
   }
   composable(route = AuthentificationRoutes.ForgotPassword.route) {
    ForgotPasswordScreen(
     authentificationNavController
    )
   }
   composable(route = AuthentificationRoutes.ConnectWithUAEPass.route) {
    ConnectWithUAEPassScreen(
     authentificationNavController
    )
   }
  }
 }
}