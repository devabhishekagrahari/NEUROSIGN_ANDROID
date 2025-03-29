package co.spacece.neurosign.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState
import co.spacece.neurosign.R

//data class NavigationItem(val title: String, val icon: ImageVector, val route: String)
data class NavigationItem(val route: String, val imageRes: Int, val imageResSelected: Int)

@Composable
fun BottomNavigation(navController: NavHostController) {
    val items = listOf(

        NavigationItem("about", R.drawable.about_us, R.drawable.about_us_o),
        NavigationItem("products", R.drawable.our_products, R.drawable.our_products_o),
        NavigationItem("contact", R.drawable.contact_us, R.drawable.contact_us_o)
    )

    NavigationBar(
        containerColor = Color.White, // Background white
        contentColor = Color.Black, // Icon & text black
        tonalElevation = 4.dp // Optional: for shadow effect
    )  {
        val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { item ->
            val isSelected = currentDestination == item.route
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = if (isSelected) item.imageResSelected else item.imageRes),
                        contentDescription = item.route,
                        tint = Color.Unspecified
                    )
                },
                selected = isSelected,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Unspecified, // Prevents tinting
                    unselectedIconColor = Color.Unspecified, // Prevents gray shadow
                    indicatorColor = Color.Transparent // Removes selection background
                )
            )
        }
    }
}