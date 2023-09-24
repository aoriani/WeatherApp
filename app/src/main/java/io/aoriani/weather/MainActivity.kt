package io.aoriani.weather

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import io.aoriani.weather.data.OpenWeatherRestApiImpl
import io.aoriani.weather.data.createHttpClient
import io.aoriani.weather.domain.WeatherRepoImpl
import io.aoriani.weather.ui.screens.detail.DetailScreen
import io.aoriani.weather.ui.screens.detail.DetailViewModel
import io.aoriani.weather.ui.screens.detail.DetailViewModelImpl
import io.aoriani.weather.ui.screens.master.MasterScreen
import io.aoriani.weather.ui.screens.master.MasterViewModel
import io.aoriani.weather.ui.screens.master.MasterViewModelImpl
import io.aoriani.weather.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val repo =
            WeatherRepoImpl(restApi = OpenWeatherRestApiImpl(httpClient = createHttpClient()))
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "master") {
                composable("master") {
                    val viewModel: MasterViewModel = viewModel(factory = MasterViewModelImpl.Factory(repo))
                    MasterScreen(viewModel = viewModel, showWeatherDetails = {
                        cityId -> navController.navigate("detail/$cityId")
                    })
                }

                composable(
                    "detail/{id}",
                    arguments = listOf(navArgument("id") { type = NavType.LongType })
                ) { navBackStackEntry ->
                    val id = navBackStackEntry.arguments?.getLong("id") ?: 0L
                    val viewModel: DetailViewModel = viewModel(factory = DetailViewModelImpl.Factory(id, repo))
                    DetailScreen(viewModel = viewModel, navigateUp = {
                        navController.popBackStack()
                    })

                }
            }
        }
    }
}
