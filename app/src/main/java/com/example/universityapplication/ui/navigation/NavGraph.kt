package com.example.universityapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.universityapplication.ui.screen.HomeScreen
import com.example.universityapplication.ui.screen.OnboardScreen
import kotlinx.serialization.Serializable

@Serializable
object Onboard

@Serializable
object Menu

@Serializable
object Home

@Composable
fun NavGraph(modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Onboard, modifier = modifier) {
        composable<Onboard> {
            OnboardScreen(navController)
        }
        composable<Home> {
            HomeScreen(navController)
        }
        composable<Menu> {

        }
    }
}