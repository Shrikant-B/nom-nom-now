package com.shrikant.badwaik.nomnomnow.view.ui.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.shrikant.badwaik.nomnomnow.view.theme.NomNomNowTheme
import com.shrikant.badwaik.nomnomnow.view.ui.dashboard.layout.DashboardView

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NomNomNowTheme {
                DashboardView()
            }
        }
    }
}