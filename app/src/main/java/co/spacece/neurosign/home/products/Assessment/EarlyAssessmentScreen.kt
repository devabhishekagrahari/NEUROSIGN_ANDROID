package co.spacece.neurosign.Home.Products.Assessment

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar

@Composable
fun EarlyAssessmentScreen(navController: NavController) {
    Column {
        AppTopBar(title = "Early Childhood Assessment") {
            navController.popBackStack()
        }
        Text(text = "Welcome to Early Childhood Assessment!", modifier = Modifier.padding(16.dp))
    }
}
