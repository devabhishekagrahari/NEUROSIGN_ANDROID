package co.spacece.neurosign.home.products.hobbyPredictor.ui.resultScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import co.spacece.neurosign.home.products.hobbyPredictor.HobbyPredictorViewModel
import co.spacece.neurosign.home.products.hobbyPredictor.OARVViewDataModel
import co.spacece.neurosign.ui.theme.Dark
import co.spacece.neurosign.ui.theme.Light
import co.spacece.neurosign.ui.theme.Primary


@Composable
fun OtherActivitiesRecommendationView() {
    val viewModel = viewModel<HobbyPredictorViewModel>()
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .shadow(4.dp, shape = MaterialTheme.shapes.medium)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp)
    ) {
        OARVHeading()
        val list = viewModel.hpbResultActivitySuggestions.collectAsState().value
        OARVVideos(list)
    }
}



@Composable
fun OARVVideos(list:List<OARVViewDataModel>) {
    Column{
    list.forEach { item->
        Spacer(modifier = Modifier.height(20.dp))
        OARVVideosView(
            item.description,
            item.content,
            item.materialRequired,
            item.mrContent,
            item.heading,
            item.imageId
        )
        }
    }

}

@Composable
fun OARVVideosView(
    description:String,
    content :String,
    materialRequired:String,
    mrContent:String,
    heading:String,
    imageId:Int,

) {
    Column(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Light, RoundedCornerShape(8.dp))
                .padding(8.dp)
            ){

        Text(text = heading, color = Primary, fontWeight = FontWeight.W400, fontSize = 20.sp)
        Spacer(modifier = Modifier.height(8.dp))
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Image(painter = painterResource(id = imageId), contentDescription ="tempimage", modifier = Modifier
                .width(120.dp)
                .aspectRatio(1F) )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle( fontWeight = FontWeight.W600)) {
                            append(description)
                        }
                        append(content)},

                    fontSize =14.sp,
                    color = Dark
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = buildAnnotatedString {
                        withStyle(style = SpanStyle( fontWeight = FontWeight.W600)) {
                            append(materialRequired)
                        }
                        append(mrContent)},

                    fontSize =14.sp,
                    color = Dark,
                    lineHeight = 17.sp
                )
            }
        }
    }
}

@Composable
fun OARVHeading() {
    Text(
        text = "Other Activity Videos",
    fontSize = 28.sp,
    fontWeight = FontWeight.W400,
    lineHeight = 34.sp,
    textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )
}
