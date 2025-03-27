package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.spacece.neurosign.AppTopBar
import kotlinx.serialization.Serializable


@Composable
fun HobbyPredictorScreen(){
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = { AppTopBar(title = "Hobby Predictor") }
    ){paddingValues ->
        HobbyPredictorScreenView()
    }

}

@Serializable
object ScreenB