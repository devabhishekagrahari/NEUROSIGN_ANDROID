package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun HobbyPredictorScreen(){
    Scaffold(modifier = Modifier.fillMaxSize()){paddingValues ->
        HobbyPredictorScreenView()
    }

}