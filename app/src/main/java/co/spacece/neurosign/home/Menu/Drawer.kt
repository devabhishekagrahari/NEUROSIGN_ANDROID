package co.spacece.neurosign.Home.Menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import co.spacece.neurosign.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(
    drawerState: DrawerState,
    scope: CoroutineScope,
    onItemClick: (String) -> Unit
) {

    val menuItems = listOf(
        MenuItem(R.drawable.about_us,  "about"),
        MenuItem(R.drawable.our_products,  "products"),
        MenuItem(R.drawable.contact_us, "contact")
    )

    ModalDrawerSheet(
        modifier = Modifier.width(220.dp),
        drawerContainerColor = Color.White,
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterEnd
            ) {
                IconButton(
                    onClick = {
                        scope.launch { drawerState.close() }
                    }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.cut),
                        contentDescription = "Close menu",
                        modifier = Modifier.size(32.dp)
                    )
                }
            }

            menuItems.forEach { item ->
                NavigationDrawerItem(
                    icon = {
                        Image(
                            painter = painterResource(id = item.imageRes),
                            contentDescription = null,
                            modifier = Modifier.size(100.dp),
                        )
                    },
                    label = {},
                    selected = false,
                    onClick = {
                        scope.launch { drawerState.close() }
                        onItemClick(item.route)
                    }
                )
            }
        }
    }
}