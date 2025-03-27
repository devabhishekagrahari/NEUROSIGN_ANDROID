package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorViewModel


@Composable
fun HobbyPredictorScreenView( paddingValues: PaddingValues,viewModel: HobbyPredictorViewModel){
    Column(modifier = Modifier.padding(paddingValues)) {
        HobbyPredictorQuestionsView(viewModel = viewModel)
        PredictHobbyButton()
    }
    }