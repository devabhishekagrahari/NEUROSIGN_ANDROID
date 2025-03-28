package co.spacece.neurosign.Navigation

import ContactUsScreen
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import co.spacece.neurosign.Home.About.AboutUsScreen
import co.spacece.neurosign.Home.HomeScreen
import co.spacece.neurosign.Home.Products.Assessment.EarlyAssessmentScreen
import co.spacece.neurosign.Home.Products.HobbyPredictor.HobbyPredictorScreen
import co.spacece.neurosign.Home.Products.SignLanguage.SignLanguageScreen
import co.spacece.neurosign.Home.Products.StoryTelling.StoryGeneratorScreen
import co.spacece.neurosign.Home.Splash.SplashScreen
import co.spacece.neurosign.home.products.OurProductsScreen

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("products") { OurProductsScreen(navController) }
        composable("about") { AboutUsScreen() }
        composable("contact") { ContactUsScreen() }
        composable("hobby_predictor") { HobbyPredictorScreen(navController) }
        composable("early_assessment") { EarlyAssessmentScreen(navController) }
        composable("sign_language") { SignLanguageScreen(navController) }
        composable("story_generator") { StoryGeneratorScreen(navController) }
    }
}
