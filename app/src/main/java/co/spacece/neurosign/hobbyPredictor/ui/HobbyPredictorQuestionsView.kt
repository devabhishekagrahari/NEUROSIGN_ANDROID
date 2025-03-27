package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorQuestionAnswerModel
import co.spacece.neurosign.hobbyPredictor.HobbyPredictorViewModel
import co.spacece.neurosign.ui.theme.Light

@Composable
fun HobbyPredictorQuestionsView(
     viewModel:HobbyPredictorViewModel
){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp)
    ) {


        val hobbyPredictorQuestionsAnswerList=viewModel.hobbyPredictorQuestionAnswerList.collectAsState()



        Text(text = "Enter Your Child Details", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)

        TextWithAsterisk(text = Questions.One.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.One.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.One.question,
                it
            )
        }
        TextWithAsterisk(text = Questions.Two.question)
        TextWithAsterisk(text = Questions.Three.question)
        TextWithAsterisk(text = Questions.Four.question)
        TextWithAsterisk(text = Questions.Five.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Five.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.Five.question,
                it
            )
        }
        TextWithAsterisk(text = Questions.Six.question)
        TextWithAsterisk(text = Questions.Seven.question)
        TextWithAsterisk(text = Questions.Eight.question)
        TextWithAsterisk(text = Questions.Nine.question)
        TextWithAsterisk(text = Questions.Ten.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Ten.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.Ten.question,
                it
            )
        }
    }
}

@Composable
fun TextWithAsterisk( text:String){
    val inlineContent=InlineTextContent(placeholder = Placeholder( width = 12.sp,
        height = 12.sp,
        placeholderVerticalAlign = PlaceholderVerticalAlign.TextTop)){
        Text(text = "*", color = Color.Red, fontSize = 16.sp, fontWeight = FontWeight.Medium)
    }

    val annotatedString = buildAnnotatedString {
        append(text)
        appendInlineContent("abstric", "[*]")
    }
    Text(annotatedString,inlineContent = mapOf(Pair("abstric",inlineContent)))
}

@Composable
fun CustomNumberInputField(
    questionAnswer: HobbyPredictorQuestionAnswerModel,
    viewModel: HobbyPredictorViewModel,
    onValueChange: (String) -> Unit

){

    Row (horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically
    , modifier = Modifier
            .fillMaxWidth()
            .border(
                1.dp, Light,
                RoundedCornerShape(4.dp)
            )
            .padding(12.dp)){
        BasicTextField(keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),value =   questionAnswer.answer, onValueChange =
        onValueChange, singleLine = true)

        Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically) {
            Box(modifier = Modifier
                .clickable { if(questionAnswer.answer!="") { viewModel.subtractFromIntAnswer(questionAnswer.question)} }
                .size(14.dp, 2.dp)
                .background(Color.Red))
            Box (contentAlignment = Alignment.Center, modifier = Modifier
                .padding(start = 26.dp)
                .clickable { viewModel.addInIntAnswer(questionAnswer.question) }
                ){
                Box(modifier = Modifier
                    .size(14.dp, 2.dp)
                    .background(Color.Green))
                Box(modifier = Modifier

                    .size(2.dp, 14.dp)
                    .background(Color.Green))

            }
        }

    }
    

}