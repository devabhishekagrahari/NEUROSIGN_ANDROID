package co.spacece.neurosign.home.products.hobbyPredictor.ui.questionsScreen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.Navigation.BottomNavigation
import kotlinx.serialization.Serializable


@Composable
fun HobbyPredictorQuestionScreen(navController: NavHostController) {
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = { AppTopBar(title = "Hobby Predictor"){
            navController.popBackStack()
        } },
        bottomBar = { BottomNavigation(navController = navController)}
    ){paddingValues ->
        HobbyPredictorScreenView(paddingValues,navController)
    }

}
