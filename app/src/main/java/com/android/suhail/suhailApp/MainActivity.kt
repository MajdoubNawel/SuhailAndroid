package com.android.suhail.suhailApp

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.android.suhail.base.activity.BaseActivity
import com.android.suhail.presentation.features.authentification.AuthentificationScreen
import com.android.suhail.presentation.features.dashboard.DashboardScreen

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023. All rights reserved.
 */
class MainActivity : BaseActivity() {
    @Composable
    override fun ActivityLayout() {
        val navController = rememberNavController()
        MaterialTheme {
            NavHost(
                navController = navController,
                startDestination = AppRoutes.Dashboard.route
            ) {

                // Authentication
                composable(route = AppRoutes.Authentification.route) {
                    AuthentificationScreen()
                }

                composable(route = AppRoutes.Dashboard.route) {
                    DashboardScreen()
                }
            }
        }
    }
}