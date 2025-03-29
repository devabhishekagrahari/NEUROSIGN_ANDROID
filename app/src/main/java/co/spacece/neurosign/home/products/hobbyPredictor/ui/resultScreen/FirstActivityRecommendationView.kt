package co.spacece.neurosign.home.products.hobbyPredictor.ui.resultScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.spacece.neurosign.R
import co.spacece.neurosign.ui.theme.Dark
import co.spacece.neurosign.ui.theme.Medium
import co.spacece.neurosign.ui.theme.Primary

@Composable
fun FirstActivityRecommendationView() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .shadow(4.dp, shape = MaterialTheme.shapes.medium)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp),
    ) {
        FARVHeading()
        Spacer(modifier = Modifier.height(20.dp))

        FARTitle()
        Spacer(modifier = Modifier.height(16.dp))

        FARImage()
        Spacer(modifier = Modifier.height(16.dp))

        FARDescription()
        Spacer(modifier = Modifier.height(16.dp))

        FARMaterialRequired()
    }
}

@Composable
fun FARDescription() {
    val description = "Description - "
    val content = "This is a test sentence to check how the text wraps properly when the sentence is long enough to shift to the next line."

        Text(
            text = buildAnnotatedString {
                withStyle(style = SpanStyle(color = Primary, fontWeight = FontWeight.W600)) {
                    append(description)
                }
                append(content)},

            fontSize =20.sp,
            color = Medium
        )
}

@Composable
fun FARImage() {
    Image(
        painter = painterResource(R.drawable.demo_photo_for_hp_results),
        contentDescription = "hobbyResultsRecommendationImages",
        contentScale = ContentScale.Fit
    )
}

@Composable
fun FARMaterialRequired() {
    val description = "Materials Required - "
    val content = "None"

    Text(
        text = buildAnnotatedString {
            withStyle(style = SpanStyle(color = Primary, fontWeight = FontWeight.W600)) {
                append(description)
            }
            append(content)},

        fontSize =20.sp,
        color = Medium
    )
}

@Composable
fun FARTitle() {
    Row {
        Text(
            text = "Title - ",
            fontSize =24.sp,
            color = Primary,
            fontWeight = FontWeight.W600
            )
        Text(text = "Simon Says",
            fontSize =24.sp,
            color = Dark,
            fontWeight = FontWeight.W600)
    }
}

@Composable
private fun FARVHeading(){
    Text(
        text = "Activities for Sports (Ages 4-5)",
        fontSize = 28.sp,
        fontWeight = FontWeight.W400,
        lineHeight = 34.sp,
        textAlign = TextAlign.Center
    )
}