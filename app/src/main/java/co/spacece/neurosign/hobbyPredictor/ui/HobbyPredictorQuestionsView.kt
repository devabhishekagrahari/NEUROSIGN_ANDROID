package co.spacece.neurosign.hobbyPredictor.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.foundation.text.appendInlineContent

import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.text.PlaceholderVerticalAlign
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HobbyPredictorQuestionsView(){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp)
    ) {
        Text(text = "Enter Your Child Details", fontSize = 24.sp, fontWeight = FontWeight.SemiBold)
        TextWithAsterisk(text = "Child's Age ")
        TextWithAsterisk(text = "Has your child taken Part in any fun learning competitions like quizzes, or Olympiads? ")
        TextWithAsterisk(text = "Has your child received any prizes or certificates for learning? ")
        TextWithAsterisk(text = "Does your child enjoy going to school and learning new things? ")
        TextWithAsterisk(text = "How easily does your child understand and remember new things? (Rate from 1 to 6) ")
        TextWithAsterisk(text = "Does your child enjoy sports and dream of becoming really good at it? ")
        TextWithAsterisk(text = "Does your child love drawing and making colorful pictures? ")
        TextWithAsterisk(text = "Has your child won any prizes for art or drawing? ")
        TextWithAsterisk(text = "How much time does your child spend on art and craft each day? (Rate from 1 to 6) ")

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