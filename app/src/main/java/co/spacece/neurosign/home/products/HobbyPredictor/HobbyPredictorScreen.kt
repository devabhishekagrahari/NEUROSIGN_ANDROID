package co.spacece.neurosign.Home.Products.HobbyPredictor

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar

@Composable
fun HobbyPredictorScreen(navController: NavController){
    Column {
        AppTopBar(title = "Hobby Predictor") {
            navController.popBackStack() // Handles back navigation
        }
        // Rest of the screen content
        Text(text = "Welcome to the Hobby Predictor!", modifier = Modifier.padding(16.dp))
    }
}