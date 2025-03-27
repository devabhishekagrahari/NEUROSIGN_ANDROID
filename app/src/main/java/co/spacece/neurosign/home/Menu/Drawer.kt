package co.spacece.neurosign.Home.Menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material3.Icon


@Composable
fun DrawerContent(
    onItemClick: (String) -> Unit,
    onClose: () -> Unit
) {
    val menuItems = listOf(
        MenuItem(Icons.Default.Info, "About Us", "about"),
        MenuItem(Icons.Default.MoreVert, "Our Products", "products"),
        MenuItem(Icons.Default.Phone, "Contact Us", "contact")
    )

    ModalDrawerSheet(
        modifier = Modifier.width(220.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            IconButton(
                onClick = onClose,
                modifier = Modifier.align(Alignment.End)
            ) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "Close menu",
                    modifier = Modifier.size(32.dp)
                )
            }

            menuItems.forEach { item ->
                NavigationDrawerItem(
                    icon = {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.text,
                            modifier = Modifier.size(28.dp)
                        )
                    },
                    label = { Text(item.text) },
                    selected = false,
                    onClick = { onItemClick(item.route) }
                )
            }
        }
    }
}
