package co.spacece.neurosign.Home.Splash


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import kotlinx.coroutines.delay
import co.spacece.neurosign.R

@Composable
fun SplashScreen(navController: NavHostController) {
    Box(
        modifier = Modifier.fillMaxSize()
                .background(Color.White),
        contentAlignment = Alignment.Center


    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center ,
            modifier = Modifier.fillMaxSize()

        ) {

            Image(
                painter = painterResource(id = R.drawable.splash),
                contentDescription = "Splash screen image",
                modifier = Modifier.fillMaxWidth(0.8f)
                          .fillMaxHeight(0.5f)
            )


            Spacer(modifier = Modifier.height(30.dp))

            Text("NeuroSign",
                color = Color(0xFFF8A800),
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.fillMaxHeight(0.15f))

            Text("An AI-Based Assistant to \nhelp your children with their\nearly development",
                color = Color.Black,
                fontSize = 20.sp ,
                modifier = Modifier.fillMaxWidth(0.85f),
                textAlign = TextAlign.Center,
              
                lineHeight = 34.sp

            )

            Spacer(modifier = Modifier.fillMaxHeight(0.075f))

            Button(onClick = { navController.navigate("home") } ,
                    shape = RectangleShape, // Makes the button rectangular
                    modifier = Modifier
                    .fillMaxWidth(0.85f) // Makes it stretch horizontally
                    .fillMaxHeight(0.3f)
                    .clip(RoundedCornerShape(14.dp))
            ) {
                  Text("Let's Begin!" ,
                      fontSize = 14.sp ,
                  )
            }
        }
    }
}