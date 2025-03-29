package co.spacece.neurosign.Home.Products.Assessment

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.ui.theme.AppAccent
import co.spacece.neurosign.ui.theme.AppPrimary
import co.spacece.neurosign.ui.theme.Dark
import co.spacece.neurosign.ui.theme.Medium

@Composable
fun EarlyAssessmentScreen(navController: NavController) {
    val assessmentBenefits = listOf(
        "Detect potential learning and developmental challenges early.",
        "Provide tailored support for cognitive, language, and social skills.",
        "Build a strong foundation of lifelong learning.",
        "Empower parents and educators with personalized insights."
    )

    Column(modifier = Modifier.fillMaxSize()) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {
                        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                            Text(
                                text = "Early Childhood Development Assessment -",
                                style = MaterialTheme.typography.headlineLarge.copy(fontSize = 24.sp),
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                            Text(
                                text = "Unlock Your Child's Potential!",
                                style = MaterialTheme.typography.bodyLarge,
                                color = AppAccent,
                                textAlign = TextAlign.Center,
                                modifier = Modifier.fillMaxWidth()
                            )
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                            Text(
                                text = "Identify Support & Empower Young Minds",
                                style = MaterialTheme.typography.headlineLarge.copy(fontSize = 24.sp),
                                color = AppPrimary
                            )
                            Text(
                                text = "Every child is unique, and early childhood development plays a crucial role in shaping their future.",
                                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                                color = Medium
                            )
                            Text(
                                text = "Our scientifically developed Early Childhood Development Assessment helps parents, educators, and specialists understand a child's cognitive, emotional, and social growth at an early stage.",
                                style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp),
                                color = Medium
                            )
                        }

                        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                            Button(
                                onClick = { navController.navigate("learn_detection")},
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(containerColor = AppPrimary)
                            ) {
                                Text(
                                    text = "Get Started",
                                    style = MaterialTheme.typography.labelLarge.copy(fontSize = 16.sp),
                                    modifier = Modifier.padding(8.dp)
                                )
                            }

                            OutlinedButton(
                                onClick = { },
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.outlinedButtonColors(contentColor = AppPrimary)
                            ) {
                                Text(
                                    text = "Learn More",
                                    style = MaterialTheme.typography.labelLarge,
                                    modifier = Modifier.padding(8.dp)
                                )
                            }
                        }
                    }
                }
            }

            item {
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(12.dp),
                    colors = CardDefaults.cardColors(containerColor = Color.White)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp),
                        verticalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        Text(
                            text = "Why Early Assessment Matters",
                            style = MaterialTheme.typography.headlineMedium,
                            color = AppAccent
                        )

                        assessmentBenefits.forEach { benefit ->
                            Text(
                                text = benefit,
                                style = MaterialTheme.typography.bodyMedium,
                                color = Dark
                            )
                        }
                    }
                }
            }
        }
    }
}