package co.spacece.neurosign.Navigation

import ContactUsScreen
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import co.spacece.neurosign.Home.About.AboutUsScreen
import co.spacece.neurosign.Home.HomeScreen
import co.spacece.neurosign.Home.Splash.SplashScreen
import co.spacece.neurosign.home.products.OurProductsScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("products") { OurProductsScreen() }
        composable("about") { AboutUsScreen() }
        composable("contact") { ContactUsScreen() }
    }
}
