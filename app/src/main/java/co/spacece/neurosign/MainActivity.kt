package co.spacece.neurosign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.Navigation.AppNavigation
import co.spacece.neurosign.ui.theme.NeuroSignTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NeuroSignTheme{
                    //Navigation()
                val navController = rememberNavController()
                AppNavigation(navController)
                }
            }
        }
    }