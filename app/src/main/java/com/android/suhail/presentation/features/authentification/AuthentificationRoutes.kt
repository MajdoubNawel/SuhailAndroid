package com.android.suhail.presentation.features.authentification


/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023. All rights reserved.
 */
sealed class AuthentificationRoutes(var route: String) {
    object SignIn : AuthentificationRoutes(route = "SignIn")
    object SignUp : AuthentificationRoutes(route = "SignUp")
    object ForgotPassword: AuthentificationRoutes(route = "Forgot Password")
    object ConnectWithUAEPass:AuthentificationRoutes(route = "ConnectWithPass")
}