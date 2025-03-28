package co.spacece.neurosign.home.products

import androidx.compose.ui.graphics.vector.ImageVector

data class Product(
    val id: Int,
    val icon: Int,
    val title: String,
    val description: String,
    val route: String
)


data class NavigationItem(val label: String, val icon: ImageVector)