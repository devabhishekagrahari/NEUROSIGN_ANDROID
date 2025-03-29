package co.spacece.neurosign.Home.Products.StoryTelling

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar

@Composable
fun StoryGeneratorScreen(navController: NavController) {
    Column {

        Text(text = "Welcome to AI Story Generator!", modifier = Modifier.padding(16.dp))
    }
}