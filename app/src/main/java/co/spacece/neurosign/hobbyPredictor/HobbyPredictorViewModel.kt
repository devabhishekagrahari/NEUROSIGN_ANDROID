package co.spacece.neurosign.hobbyPredictor

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class HobbyPredictorViewModel:ViewModel(){

    private val _hobbyPredictorQuestionList = MutableStateFlow(listOf("SDFDS","SFDF","SFDFDs"))
    val hobbyPredictorQuestionList = _hobbyPredictorQuestionList.asStateFlow()


}