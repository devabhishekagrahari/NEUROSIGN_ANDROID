package co.spacece.neurosign

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import co.spacece.neurosign.home.products.NavigationItem

@Composable
fun BottomNavigation() {
    NavigationBar {
        val items = listOf(
            NavigationItem("About Us", Icons.Filled.Info),
            NavigationItem("Our Products", Icons.Filled.MoreVert),
            NavigationItem("Contact Us", Icons.Filled.Call)
        )

        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon, // Use imageVector instead of painter
                        contentDescription = item.label
                    )
                },
                label = { Text(item.label) },
                selected = item.label == "Our Products",
                onClick = { /* TODO: Handle navigation */ }
            )
        }
    }
}