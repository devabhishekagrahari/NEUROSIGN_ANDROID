package co.spacece.neurosign.Home.About

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material3.HorizontalDivider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutUsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
            .verticalScroll(rememberScrollState()),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(12.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "About Us",
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                HorizontalDivider(
                    modifier = Modifier
                        .fillMaxWidth(0.7f)
                        .padding(vertical = 16.dp),
                    thickness = 4.dp,
                    color = Color(0xFFFFA500)
                )
                Text(
                    text = "At SpacECE we are dedicated to creating innovative tech solutions that drive social impact, empower educators, and foster community growth.\n\n" +
                            "Our Mission is to bridge the gap through technology, ensuring accessible learning and development opportunities for all.",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(horizontal = 14.dp),
                    textAlign = TextAlign.Justify,
                    color = Color.Gray
                )
            }


            Spacer(modifier = Modifier.height(10.dp))

            FeatureCard(
                title = "AI-Powered Solutions",
                description = "Our AI-Driven Tools offer personalized insights, enabling better decision-making for children by their guardians."
            )

            FeatureCard(
                title = "Trusted By Communities",
                description = "With a strong network of educators, parents and institutions, we are committed to making a difference."
            )

            FeatureCard(
                title = "Sustainable Impact",
                description = "Every solution we create aims to improve lives, ensuring technology serves a larger social cause."
            )

            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}

@Composable
fun FeatureCard(title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp , horizontal = 12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        shape = RoundedCornerShape(8.dp),
        elevation = CardDefaults.cardElevation(2.dp)
    ) {
        Column(
            modifier = Modifier.padding(14.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFFFA500)
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = description,
                fontSize = 12.sp,
                textAlign = TextAlign.Unspecified,
                color = Color.DarkGray
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AboutUsScreenPreview() {
    AboutUsScreen()
}
