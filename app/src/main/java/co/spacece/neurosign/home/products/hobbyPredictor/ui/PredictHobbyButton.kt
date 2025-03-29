package co.spacece.neurosign.home.products.hobbyPredictor.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.spacece.neurosign.R
import co.spacece.neurosign.ui.theme.Light
import co.spacece.neurosign.ui.theme.Primary

@Composable
fun PredictHobbyButton(){
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Light),
        elevation = ButtonDefaults.buttonElevation(4.dp),
        colors = ButtonColors(containerColor = Primary, disabledContainerColor = Primary, contentColor = Color.White, disabledContentColor = Color.White)
    ) {
        Text(text = stringResource(R.string.predict_hobby), modifier = Modifier.background(Primary), color = Color.White, fontSize = 16.sp)
    }
}