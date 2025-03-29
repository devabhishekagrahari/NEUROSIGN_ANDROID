package co.spacece.neurosign.Home.Products.Assessment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch


@Composable
fun WelcomeAssessment(navController: NavController) {
    val appPrimary = Color(0xFFF8A800)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
    ) {
        // Main Content
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            shape = RoundedCornerShape(16.dp)
        ) {
            Column(
                modifier = Modifier.padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                // Back button and Welcome text
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    IconButton(
                        onClick = { /* Back action */ },
                        modifier = Modifier
                            .background(Color.White, RoundedCornerShape(20.dp))
                            .border(1.dp, appPrimary, RoundedCornerShape(20.dp))
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "Back",
                            tint = appPrimary
                        )
                    }
                    Text(
                        text = "Welcome!",
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Medium,
                        color = appPrimary,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Text(
                    text = "Discover Your Unique Learning Journey",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = "Select an activity",
                    color = appPrimary,
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(16.dp))

                // Activity Cards Grid
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ActivityCard(
                        title = "Start Assessment",
                        iconRes = R.drawable.start,
                        isActive = false
                    )
                    ActivityCard(
                        title = "Pattern Recognition",
                        iconRes = R.drawable.pattern,
                        isActive = true
                    )

                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ActivityCard(
                        title = "Reading Assessment",
                        iconRes = R.drawable.read,
                        isActive = false
                    )
                }

                Spacer(modifier = Modifier.height(32.dp))

                Button(
                    onClick = { /* Generate Assessment action */ },
                    colors = ButtonDefaults.buttonColors(containerColor = appPrimary)
                ) {
                    Text("Generate Assessment")
                }
            }
        }
    }
}
@Composable
fun ActivityCard(
    title: String,
    iconRes: Int,
    isActive: Boolean
) {
    val appPrimary = Color(0xFFF8A800)
    val backgroundColor = if (isActive) appPrimary else Color.White
    val textColor = if (isActive) Color.White else Color(0xFF333333)

    Card(
        modifier = Modifier
            .size(140.dp, 180.dp)
            .border(
                width = 2.dp,
                color = appPrimary,
                shape = RoundedCornerShape(10.dp)
            ),
        colors = CardDefaults.cardColors(containerColor = backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = iconRes),
                contentDescription = title,
                modifier = Modifier.size(62.dp)
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = title,
                color = textColor,
                textAlign = TextAlign.Center,
                fontSize = 16.sp
            )
        }
    }
}