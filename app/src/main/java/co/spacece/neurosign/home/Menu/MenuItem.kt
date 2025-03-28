package co.spacece.neurosign.Home.Menu

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

data class MenuItem(
    @DrawableRes val imageRes: Int,
    //val text: String,
    val route: String
)