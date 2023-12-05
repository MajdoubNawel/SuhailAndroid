package com.android.suhail.suhailApp

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023. All rights reserved.
 */
sealed class AppRoutes (var route: String) {
 object Authentification : AppRoutes("Authentification")
 object Dashboard : AppRoutes("Dashboard")
}