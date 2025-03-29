package co.spacece.neurosign.home.products.hobbyPredictor.ui.resultScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import co.spacece.neurosign.ui.theme.Background

@Composable
fun HobbyPredictorResultView( paddingValues: PaddingValues){
    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)
        .background(Background)
    ) {
        item {
            ResultHeadingView()
        }
        item {
            FirstActivityRecommendationView()
        }
        item {
            OtherActivitiesRecommendationView()
        }
    }
}