package com.shrikant.badwaik.nomnomnow.view.ui.dashboard.layout

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun DashboardView() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            NavigationBar(Modifier.fillMaxWidth()) {

            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = DashboardBottomNavItem.Home.route,
            modifier = Modifier.padding(paddingValues)
        ) {
            composable(DashboardBottomNavItem.Home.route) { HomeScreen() }
            composable(DashboardBottomNavItem.Search.route) { SearchScreen() }
            composable(DashboardBottomNavItem.Saved.route) { SavedScreen() }
        }
    }
}

@Composable
fun HomeScreen() {
    // Home screen composable
}

@Composable
fun SearchScreen() {
    // Search screen composable
}

@Composable
fun SavedScreen() {
    // Profile screen composable
}