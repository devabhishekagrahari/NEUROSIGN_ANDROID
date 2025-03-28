package co.spacece.neurosign.home.products

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.Navigation.BottomNavigation
import co.spacece.neurosign.R
import kotlinx.serialization.Serializable


@Composable
fun OurProductsScreen(navController: NavController){

    val products = listOf(
        Product(
            id = 1,
            icon = R.drawable.sports_soccer,
            title = "Hobby Predictor",
            description = "Hobby Predictor is an AI-based tool designed to predict a child's potential hobbies...",
            route = "hobby_predictor"
        ),
        Product(
            id = 2,
            icon = R.drawable.account_child,
            title = "Early Childhood Assessment",
            description = "Early Learning Assessment Tool is an intelligent solution designed to...",
            route = "early_assessment"
        ),
        Product(
            id = 3,
            icon = R.drawable.sign_language,
            title = "Sign-Language Translator",
            description = "Sign-Language Translator is an AI-Powered application that translates sign-language gestures into words and vice-versa...",
            route = "sign_language"
        ),
        Product(
            id = 4,
            icon = R.drawable.history_edu,
            title = "Personalized AI Story Generator",
            description = "AI Story Generator is a tool that uses AI to generate fun and exciting personalized stories...",
            route = "story_generator"
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
            .padding(12.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
                .shadow(4.dp, shape = MaterialTheme.shapes.medium),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier
                    .padding(6.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Our Products",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    items(products) { product ->
                        ProductsCard(product = product, navController = navController)
                    }
                }
            }
        }
    }
}


@Serializable
object ScreenA


