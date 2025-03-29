package co.spacece.neurosign.Home.Products.SignLanguage

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar

@Composable
fun SignLanguageScreen(navController: NavController) {
    Column {

        Text(text = "Welcome to Sign-Language Translator!", modifier = Modifier.padding(16.dp))
    }
}