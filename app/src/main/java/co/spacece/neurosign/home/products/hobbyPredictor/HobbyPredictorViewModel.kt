package co.spacece.neurosign.home.products.hobbyPredictor

import androidx.lifecycle.ViewModel
import co.spacece.neurosign.R
import co.spacece.neurosign.home.products.hobbyPredictor.ui.Questions
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow


data class HobbyPredictorQuestionAnswerModel(
    val question:String,
    val answer:String
)

class HobbyPredictorViewModel(
):ViewModel(){

    private val _hpResultActivitySuggestions = MutableStateFlow<List<OARVViewDataModel>>(
        listOf(
        OARVViewDataModel(
            description = "Description - ", content = " Inflate a balloon and carry out different games with kids such as having kids keep it in the air for as long as possible by tapping it and many more.", materialRequired = "Materials Required - ", mrContent="Balloon", heading="Balloon Games", imageId= R.drawable.demo_photo_for_hp_results),
            OARVViewDataModel(
                description = "Description - ", content = " Inflate a balloon and carry out different games with kids such as having kids keep it in the air for as long as possible by tapping it and many more.", materialRequired = "Materials Required - ", mrContent="Balloon", heading="Balloon Games", imageId= R.drawable.demo_photo_for_hp_results),
            OARVViewDataModel(
                description = "Description - ", content = " Inflate a balloon and carry out different games with kids such as having kids keep it in the air for as long as possible by tapping it and many more.", materialRequired = "Materials Required - ", mrContent="Balloon", heading="Balloon Games", imageId= R.drawable.demo_photo_for_hp_results),
            OARVViewDataModel(
                description = "Description - ", content = " Inflate a balloon and carry out different games with kids such as having kids keep it in the air for as long as possible by tapping it and many more.", materialRequired = "Materials Required - ", mrContent="Balloon", heading="Balloon Games", imageId= R.drawable.demo_photo_for_hp_results),
            OARVViewDataModel(
                description = "Description - ", content = " Inflate a balloon and carry out different games with kids such as having kids keep it in the air for as long as possible by tapping it and many more.", materialRequired = "Materials Required - ", mrContent="Balloon", heading="Balloon Games", imageId= R.drawable.demo_photo_for_hp_results)

        ))
    val hpbResultActivitySuggestions = _hpResultActivitySuggestions.asStateFlow()

    private val _hobbyPredictorQuestionAnswerList = MutableStateFlow(
        listOf(
            HobbyPredictorQuestionAnswerModel(Questions.One.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Two.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Three.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Four.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Five.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Six.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Seven.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Eight.question, ""),
            HobbyPredictorQuestionAnswerModel(Questions.Nine.question,""),
            HobbyPredictorQuestionAnswerModel(Questions.Ten.question,""),
            )
    )
    val hobbyPredictorQuestionAnswerList = _hobbyPredictorQuestionAnswerList.asStateFlow()

    fun setHobbyPredictorQuestionAnswerListAnswer( hobbyQuestion:String,hobbyAnswer:String){
        _hobbyPredictorQuestionAnswerList.value=_hobbyPredictorQuestionAnswerList.value.map {
            if(it.question==hobbyQuestion){
                it.copy(answer = hobbyAnswer)
            }else{
                it
            }
        }
    }
    fun addInIntAnswer(hobbyQuestion:String){
        _hobbyPredictorQuestionAnswerList.value=_hobbyPredictorQuestionAnswerList.value.map {
            if(it.question==hobbyQuestion){
                it.copy(answer = if(it.answer=="") "1" else (it.answer.toInt()+1).toString())
            }else{
                it
            }
        }
    }
    fun subtractFromIntAnswer(hobbyQuestion:String){
        _hobbyPredictorQuestionAnswerList.value=_hobbyPredictorQuestionAnswerList.value.map {
            if(it.question==hobbyQuestion){
                it.copy(answer = if(it.answer==""||it.answer.toInt()==1) "" else (it.answer.toInt()-1).toString())
            }else{
                it
            }
        }
    }
}