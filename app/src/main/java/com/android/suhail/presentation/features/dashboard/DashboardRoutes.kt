package com.android.suhail.presentation.features.dashboard

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector
import com.android.suhail.R

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
class DashboardModel {
 sealed class DashboardRoutes(var route: String, val title: Int, val icon: ImageVector) {
  object Home : DashboardRoutes(route = "Home", R.string.home, Icons.Filled.Home)
  object Plan : DashboardRoutes(route = "Plan",   R.string.plan, Icons.Filled.Home)
  object Nearby : DashboardRoutes(route = "Nearby",   R.string.nearby, Icons.Filled.Home)
  object Departures : DashboardRoutes(route = "Departures",  R.string.departures, Icons.Filled.Home)
  object Happiness : DashboardRoutes(route = "Happiness",   R.string.happiness, Icons.Filled.Home)
 }
 val screensInDashboardFromBottomNav = listOf(
  DashboardRoutes.Home,DashboardRoutes.Plan,DashboardRoutes.Nearby,DashboardRoutes.Departures,DashboardRoutes.Happiness,
 )
 sealed class ConnectedDashboardRoutes(var route: String, val title: Int, val icon: ImageVector) {
  object Profile : ConnectedDashboardRoutes(route = "Profile", R.string.profile, Icons.Filled.AccountCircle)
  object Settings : ConnectedDashboardRoutes(route = "Settings",   R.string.settings, Icons.Filled.Settings)
 }
 val screensInDashboardFromDrawerNav = listOf(
  ConnectedDashboardRoutes.Profile,ConnectedDashboardRoutes.Settings,
 )
}