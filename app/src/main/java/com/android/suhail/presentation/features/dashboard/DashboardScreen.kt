package com.android.suhail.presentation.features.dashboard

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.DrawerValue
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material.Scaffold
import com.android.suhail.R
import com.android.suhail.presentation.components.BottomBar
import com.android.suhail.presentation.features.departures.DeparturesScreen
import com.android.suhail.presentation.features.happiness.HappinessScreen
import com.android.suhail.presentation.features.home.HomeScreen
import com.android.suhail.presentation.features.nearby.NearbyScreen
import com.android.suhail.presentation.features.plan.PlanScreen
import com.android.suhail.presentation.features.settings.SettingsScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

/**
 * Created by nawelmajdoub on 05/12/2023 .
 * Copyright (c) 2023 ZETA-BOX. All rights reserved.
 */
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DashboardScreen() {
 val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
 val scope = rememberCoroutineScope()
 val navController = rememberNavController()

 androidx.compose.material.Scaffold(
  scaffoldState = scaffoldState,

  drawerGesturesEnabled = true,

  drawerContent = {
   Drawer(
    item = DashboardModel().screensInDashboardFromDrawerNav,
    navController = navController,
    scope = scope,
    scaffoldState = scaffoldState
   )
  },

  topBar = {
   TopAppBar(
    title = { Text(text = stringResource(id = R.string.suhail_application)) }, navigationIcon = {
     IconButton(onClick = {
      scope.launch { scaffoldState.drawerState.open() }
     })
     {
      Icon(imageVector = Icons.Default.Menu, contentDescription = "")
     }
    }
   )
  },

  bottomBar = {
   BottomBar(
    screens = DashboardModel().screensInDashboardFromBottomNav,
    navController = navController,
   )
  },
  content = {
   Navigation(dashboardNavController = navController)
  }
 )
}
@Composable
fun Navigation(dashboardNavController: NavHostController){
 NavHost(
  navController = dashboardNavController,
  startDestination = DashboardModel.DashboardRoutes.Home.route
 ) {
  composable(route = DashboardModel.DashboardRoutes.Home.route) { HomeScreen() }
  composable(route = DashboardModel.DashboardRoutes.Plan.route) { PlanScreen() }
  composable(route = DashboardModel.DashboardRoutes.Nearby.route) { NearbyScreen() }
  composable(route = DashboardModel.DashboardRoutes.Departures.route) { DeparturesScreen() }
  composable(route = DashboardModel.DashboardRoutes.Happiness.route) { HappinessScreen() }

  composable(route = DashboardModel.ConnectedDashboardRoutes.Profile.route) { HomeScreen() }
  composable(route = DashboardModel.ConnectedDashboardRoutes.Settings.route) { SettingsScreen() }
 }
}
@Composable
fun Drawer(
 item: List<DashboardModel.ConnectedDashboardRoutes>,
 navController: NavController,
 scaffoldState: ScaffoldState,
 scope: CoroutineScope
) {
 Column {
  Surface(
   modifier = Modifier
    .fillMaxWidth(1f)
    .padding(10.dp)
  ) {
   Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.Center,
    verticalAlignment = Alignment.CenterVertically
   ) {
    Text(text = "I", fontSize = 28.sp, fontWeight = FontWeight.Bold)
    Spacer(modifier = Modifier.width(7.dp))
    Icon(
     imageVector = Icons.Filled.Favorite,
     contentDescription = "",
     tint = Color.Red,
     modifier = Modifier.height(40.dp)
    )
    Spacer(modifier = Modifier.width(7.dp))
    Text("Jetpack Compose", fontSize = 28.sp, fontWeight = FontWeight.Bold)
   }
  }

  Spacer(modifier = Modifier.height(10.dp))

  item.forEach { item ->
   Row(
    verticalAlignment = Alignment.CenterVertically,
    modifier = Modifier
     .fillMaxWidth()
     .clickable(onClick = {
      navController.navigate(item.route)
      // Close nav drawer
      scope.launch {
       scaffoldState.drawerState.close()
      }
      // Close drawer
     })
     .height(45.dp)

     .padding(start = 5.dp)
   ) {
    Icon(imageVector = item.icon, contentDescription = "")
    Spacer(modifier = Modifier.width(1.dp))
    Text(
     text = stringResource(id = item.title),
     fontSize = 16.sp,
     color = Color.Black
    )
   }
  }
  Spacer(modifier = Modifier.weight(1f))
  Spacer(modifier = Modifier.height(30.dp))
 }


}
@Preview
@Composable
fun PreviewMainScreen() {
DashboardScreen()
}