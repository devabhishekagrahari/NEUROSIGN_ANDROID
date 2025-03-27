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
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.currentBackStackEntryAsState

data class NavigationItem(val title: String, val icon: ImageVector, val route: String)

@Composable
fun BottomNavigation(navController: NavHostController) {
    val items = listOf(
        NavigationItem("Our Products", Icons.Filled.MoreVert, "products"),
        NavigationItem("About Us", Icons.Filled.Info, "about"),
        NavigationItem("Contact Us", Icons.Filled.Call, "contact")
    )

    NavigationBar(
        containerColor = Color.White, // Background white
        contentColor = Color.Black, // Icon & text black
        tonalElevation = 4.dp // Optional: for shadow effect
    )  {
        val currentDestination = navController.currentBackStackEntryAsState().value?.destination?.route

        items.forEach { item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = currentDestination == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Black,
                    selectedTextColor = Color.Black,
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color.LightGray // Optional: when selected
                )
            )
        }
    }
}