package com.shrikant.badwaik.nomnomnow.view.ui.dashboard.layout

import com.shrikant.badwaik.expensemanager.R

sealed class DashboardBottomNavItem(val label: String, val icon: Int, val route: String) {
    data object Home : DashboardBottomNavItem(
        "Home", R.drawable.ic_outline_home_24, "home"
    )

    data object Search : DashboardBottomNavItem(
        "Search", R.drawable.ic_search_24, "search"
    )

    data object Saved : DashboardBottomNavItem(
        "Saved", R.drawable.baseline_bookmarks_24, "saved"
    )
}