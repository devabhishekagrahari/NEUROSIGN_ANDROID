package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items

import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorViewModel

@Composable
fun HobbyPredictorQuestionsView(){
    val viewModel = HobbyPredictorViewModel()
    val questions = viewModel.hobbyPredictorQuestionList.collectAsState().value
    LazyColumn(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .background(Color.White)) {
        items(questions){ item->
            Text(text = item)
        }
    }
}