package co.spacece.neurosign.home.products

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.spacece.neurosign.AppTopBar
import co.spacece.neurosign.BottomNavigation
import co.spacece.neurosign.R
import kotlinx.serialization.Serializable


@Composable
fun ProductsScreen() {
    Scaffold (topBar = { AppTopBar(title ="Products") }, bottomBar = { BottomNavigation()}){paddingValues ->

    val products = listOf(
        Product(
            id = 1,
            icon = R.drawable.sports_soccer,
            title = "Hobby Predictor",
            description = "Hobby Predictor is an AI-based tool designed to predict a child's potential hobbies..."
        ),
        Product(
            id = 2,
            icon = R.drawable.account_child,
            title = "Early Childhood Assessment",
            description = "Early Learning Assessment Tool is an intelligent solution designed to..."
        ),
        Product(
            id = 3,
            icon = R.drawable.sign_language,
            title = "Sign-Language Translator",
            description = "Sign-Language Translator is an AI-Powered application that translates sign-language gestures into words and vice-versa..."
        ),
        Product(
            id = 4,
            icon = R.drawable.history_edu,
            title = "Personalized AI Story Generator",
            description = "AI Story Generator is a tool that uses AI to generate fun and exciting personalized stories..."
        )
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEEEEEE))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            Text(
                text = "Our Products",
                fontSize = 32.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier.padding(vertical = 16.dp)
            )
        }

        items(products) { product ->
            ProductCard(product)
        }
    }
    }

}

@Serializable
object ScreenA


