package co.spacece.neurosign.home.products.hobbyPredictor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.spacece.neurosign.ui.theme.Background


@Composable
fun HobbyPredictorScreenView( paddingValues: PaddingValues){
    Column(modifier = Modifier
        .padding(paddingValues)
        .background(Background)
        .verticalScroll(rememberScrollState())) {
        HobbyPredictorQuestionsView()
        PredictHobbyButton()
    }
    }