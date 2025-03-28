package co.spacece.neurosign.Home

import ContactUsScreen
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import co.spacece.neurosign.Home.About.AboutUsScreen
import co.spacece.neurosign.Home.Menu.DrawerContent
import co.spacece.neurosign.Home.Menu.MenuItem
import co.spacece.neurosign.Navigation.AppTopBar
import co.spacece.neurosign.Navigation.BottomNavigation
import co.spacece.neurosign.home.products.OurProductsScreen
import kotlinx.coroutines.launch

@Composable
fun HomeScreen(navController: NavHostController) {
    val innerNavController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    /*
    val menuItems = listOf(
        MenuItem(Icons.Default.Info, "About Us", "about"),
        MenuItem(Icons.Default.MoreVert, "Our Products", "products"),
        MenuItem(Icons.Default.Phone, "Contact Us", "contact")
    )

     */

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            DrawerContent(
                drawerState = drawerState,
                scope = scope,
                onItemClick = { route ->
                    innerNavController.navigate(route)
                },

            )
        },
        gesturesEnabled = drawerState.isOpen// Ensure gestures are enabled only when open
    ){ // Define what the main content should be
            Scaffold(
                topBar = {
                    AppTopBar(title = "NeuroSign",
                        onMenuClick = {
                            scope.launch { drawerState.open() }
                        }
                    )
                },
                bottomBar = {
                    BottomNavigation(innerNavController)
                }
            ) { paddingValues ->
                NavHost(
                    navController = innerNavController,
                    startDestination = "products",
                    modifier = Modifier.padding(paddingValues)
                ) {
                    composable("products") { OurProductsScreen(navController) }
                    composable("about") { AboutUsScreen() }
                    composable("contact") { ContactUsScreen() }
                }
            }
        }
}