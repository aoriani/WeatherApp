package io.aoriani.weather.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.aoriani.weather.domain.WeatherRepo
import io.aoriani.weather.ui.screens.detail.DetailScreen
import io.aoriani.weather.ui.screens.master.MasterScreen

@Composable
internal fun Navigation(repo: WeatherRepo) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "master") {
        composable("master") {
            MasterScreen()
        }

        composable(
            route = "detail/{id}",
            arguments = listOf(navArgument("id") { type = NavType.LongType })
        ) { navBackStackEntry ->
            val id = navBackStackEntry.arguments?.getLong("id") ?: 0L
            DetailScreen()
        }
    }
}