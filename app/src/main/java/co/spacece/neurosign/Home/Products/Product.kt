package co.spacece.neurosign.Home.Products

import androidx.compose.ui.graphics.vector.ImageVector

data class Product(
    val id: Int,
    val icon: Int,
    val title: String,
    val description: String
)


data class NavigationItem(val label: String, val icon: ImageVector)