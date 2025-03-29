package co.spacece.neurosign.home.products.hobbyPredictor.ui.resultScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.spacece.neurosign.ui.theme.Primary


@Composable
fun ResultHeadingView() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)
        .shadow(4.dp, shape = MaterialTheme.shapes.medium)
        .clip(RoundedCornerShape(12.dp))
        .background(Color.White)
        .padding(16.dp),
    ) {
        Text(
            text = "Your Child’s Predicted Hobby is Sports!",
            fontSize = 32.sp,
            color = Primary,
            fontWeight = FontWeight.W400,
            lineHeight = 39.sp,
            textAlign = TextAlign.Center
        )
    }
}