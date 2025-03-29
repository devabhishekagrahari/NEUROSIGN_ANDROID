package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorViewModel


@Composable
fun HobbyPredictorScreenView( )
{
    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())) {
        HobbyPredictorQuestionsView()
        PredictHobbyButton()
    }
}