package co.spacece.neurosign.Home

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.AppTopBar
import co.spacece.neurosign.Home.Products.NavigationItem
import co.spacece.neurosign.Home.Products.ProductsScreen


@Composable
fun ProductApp() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = { BottomNavigation() }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "products",
            modifier = Modifier.padding(paddingValues)
        ) {
            composable("products") {
                ProductsScreen()
            }
        }
    }
}

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