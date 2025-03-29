package co.spacece.neurosign.Navigation

import ContactUsScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.Home.About.AboutUsScreen
import co.spacece.neurosign.Home.HomeScreen
import co.spacece.neurosign.Home.Menu.DrawerContent
import co.spacece.neurosign.Home.Products.Assessment.BeginAssessment
import co.spacece.neurosign.Home.Products.Assessment.EarlyAssessmentScreen
import co.spacece.neurosign.Home.Products.Assessment.LearningDisorderDetection
import co.spacece.neurosign.Home.Products.Assessment.WelcomeAssessment
import co.spacece.neurosign.Home.Products.SignLanguage.SignLanguageScreen
import co.spacece.neurosign.Home.Products.StoryTelling.StoryGeneratorScreen
import co.spacece.neurosign.Home.Splash.SplashScreen
import co.spacece.neurosign.hobbyPredictor.ui.HobbyPredictorScreen
import co.spacece.neurosign.home.products.OurProductsScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun AppNavigation(navController: NavHostController, scope: CoroutineScope, drawerState: DrawerState) {
    //val innerNavController = rememberNavController()
    val currentRoute = navController.currentBackStackEntryFlow.collectAsState(initial = navController.currentBackStackEntry).value?.destination?.route

    val showTopBar = currentRoute !in listOf("splash")
    val showBottomBar = currentRoute in listOf("products", "about", "contact")

    ModalNavigationDrawer(
        drawerState = drawerState,
        scrimColor = Color.Transparent, // Prevents overlay color on background
        drawerContent = {
            ModalDrawerSheet(modifier = Modifier.background(Color.White)) {
                DrawerContent(
                    drawerState = drawerState,
                    scope = scope,
                    onItemClick = { route ->
                        navController.navigate(route)
                    }
                )
            }
        },
        gesturesEnabled = drawerState.isOpen
    ) {
        Scaffold(
            topBar = {
                if (showTopBar) {
                    AppTopBar(title = getScreenTitle(currentRoute)) {
                        scope.launch { drawerState.open() }
                    }
                }
            },
            bottomBar = {
                if (showBottomBar) {
                    BottomNavigation(navController)
                }
            }
        ) { paddingValues ->
            NavHost(
                navController = navController,
                startDestination = "splash",
                modifier = Modifier.padding(paddingValues)
            ) {
                composable("splash") { SplashScreen(navController) }
                composable("products") { OurProductsScreen(navController) }
                composable("about") { AboutUsScreen() }
                composable("contact") { ContactUsScreen() }
                composable("hobby_predictor") { HobbyPredictorScreen(navController) }
                composable("early_assessment") { EarlyAssessmentScreen(navController) }
                composable("sign_language") { SignLanguageScreen(navController) }
                composable("story_generator") { StoryGeneratorScreen(navController) }
                composable("learn_detection") { LearningDisorderDetection(navController) }
                composable("begin_assessment") { BeginAssessment(navController, scope, drawerState) }
                composable("welcome") { WelcomeAssessment(navController) }
            }
        }
    }
}

// Function to get dynamic title for top bar
fun getScreenTitle(route: String?): String {
    return when (route) {
        "products" -> "Our Products"
        "about" -> "About Us"
        "contact" -> "Contact Us"
        "hobby_predictor" -> "Hobby Predictor"
        "early_assessment" -> "Early Childhood Assessment"
        "sign_language" -> "Sign Language Translator"
        "story_generator" -> "AI Story Generator"
        "learn_detection" -> "Learning Disorder Detection"
        "begin_assessment" -> "Begin Assessment"
        else -> "NeuroSign"
    }
}
