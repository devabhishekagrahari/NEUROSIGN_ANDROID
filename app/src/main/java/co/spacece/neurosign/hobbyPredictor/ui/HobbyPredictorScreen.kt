package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.Navigation.BottomNavigation
import kotlinx.serialization.Serializable


@Composable
fun HobbyPredictorScreen(navController: NavHostController) {
    HobbyPredictorScreenView()
}
@Serializable
object ScreenB