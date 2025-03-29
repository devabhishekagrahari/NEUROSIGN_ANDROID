package co.spacece.neurosign.home.products.hobbyPredictor.ui.questionsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.appendInlineContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import co.spacece.neurosign.R
import co.spacece.neurosign.home.products.hobbyPredictor.HobbyPredictorQuestionAnswerModel
import co.spacece.neurosign.home.products.hobbyPredictor.HobbyPredictorViewModel
import co.spacece.neurosign.home.products.hobbyPredictor.ui.Questions
import co.spacece.neurosign.ui.theme.Light

@Composable
fun HobbyPredictorQuestionsView(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .shadow(4.dp, shape = MaterialTheme.shapes.medium)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp)
    ) {

        val viewModel = viewModel<HobbyPredictorViewModel>()
        val hobbyPredictorQuestionsAnswerList=viewModel.hobbyPredictorQuestionAnswerList.collectAsState()
        //text
        Text(text = "Enter Your Child Details", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.height(24.dp))

        //one
        TextWithAsterisk(text = Questions.One.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.One.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.One.question,
                it
            )
        }
        Spacer(modifier = Modifier.height(24.dp))

        //two
        TextWithAsterisk(text = Questions.Two.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)){
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Two.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Two.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Two.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Two.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //three
        TextWithAsterisk(text = Questions.Three.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)){
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Three.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Three.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Three.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Three.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Four
        TextWithAsterisk(text = Questions.Four.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)){
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Four.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Four.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Four.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Four.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Five
        TextWithAsterisk(text = Questions.Five.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Five.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.Five.question,
                if(it!=""){
                    if(it.toInt()>6 || it.toInt()==0) "6"
                    else it
                }
                else it
            )
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Six
        TextWithAsterisk(text = Questions.Six.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp))
        {
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Six.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Six.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Six.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Six.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Seven
        TextWithAsterisk(text = Questions.Seven.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp))
        {
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Seven.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Seven.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Seven.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Seven.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Eight
        TextWithAsterisk(text = Questions.Eight.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)) {
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Eight.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Eight.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.5F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Eight.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Eight.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        //Nine
        TextWithAsterisk(text = Questions.Nine.question)
        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp))
        {
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.36F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Nine.question }!!.answer==R.string.yes.toString(),
                    onClick = { viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Nine.question,
                        R.string.yes.toString()
                    ) })
                Text(text = "Yes")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.36F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Nine.question }!!.answer==R.string.no.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Nine.question,
                        R.string.no.toString()
                    ) })
                Text(text = "No")
            }
            Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.weight(0.36F)){
                RadioButton(
                    selected = hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Two.question }!!.answer==R.string.maybe.toString(),
                    onClick = {  viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                        Questions.Two.question,
                        R.string.maybe.toString()
                    ) })
                Text(text = "Maybe")
            }
        }

        //ten
        TextWithAsterisk(text = Questions.Ten.question)
        CustomNumberInputField(hobbyPredictorQuestionsAnswerList.value.find { it.question == Questions.Ten.question }!!,viewModel){
            viewModel.setHobbyPredictorQuestionAnswerListAnswer(
                Questions.Ten.question,
                if(it!=""){
                    if(it.toInt()>6 || it.toInt()==0) "6"
                    else it
                }
                else it
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
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
                .clickable {
                    if (questionAnswer.answer != "") {
                        viewModel.subtractFromIntAnswer(questionAnswer.question)
                    }
                }
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