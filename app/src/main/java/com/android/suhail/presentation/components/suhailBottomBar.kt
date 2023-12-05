package com.android.suhail.presentation.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.android.suhail.presentation.features.dashboard.DashboardModel

@Composable
fun BottomBar(
    modifier: Modifier = Modifier,
    screens: List<DashboardModel.DashboardRoutes>,
    navController: NavController,
) {
    BottomNavigation {
        val backStackEntry = navController.currentBackStackEntryAsState()
        screens.forEach {
                screens ->
            val currentRoute = backStackEntry.value?.destination?.route;
            val selected = currentRoute == screens.route
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = screens.icon,
                        contentDescription = "",
                        tint = if (selected) Color.White else Color.Black
                    )
                },
                selected = selected,
                label = {
                    Text(
                        stringResource(id = screens.title), // Label
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 8.sp,
                        color = Color.White
                    )
                },

                onClick = {

                    if (currentRoute != screens.route) {
                        navController.navigate(screens.route)
                    }
                }

            )
        }

    }

}