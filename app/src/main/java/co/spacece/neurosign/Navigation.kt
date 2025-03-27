package co.spacece.neurosign

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorViewModel
import co.spacece.neurosign.hobbyPredictor.ui.HobbyPredictorScreen
import co.spacece.neurosign.hobbyPredictor.ui.ScreenB
import co.spacece.neurosign.home.products.ProductsScreen
import co.spacece.neurosign.home.products.ScreenA


@Composable
fun Navigation( navController:NavHostController = rememberNavController()) {

        NavHost(
            navController = navController,
            startDestination = ScreenB,
            modifier = Modifier.padding()
        ) {
            composable<ScreenA> {
                ProductsScreen()
            }
            composable<ScreenB>{
                HobbyPredictorScreen(HobbyPredictorViewModel())
            }
        }
}
