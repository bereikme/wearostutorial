package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.Text
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.google.android.horologist.compose.layout.fillMaxRectangle

@Composable
fun WNavigation() {
    val navController = rememberSwipeDismissableNavController()

    MaterialTheme {
        Scaffold(
            modifier = Modifier.padding(16.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxRectangle(),
                contentAlignment = Alignment.Center
            ) {
                SwipeDismissableNavHost(
                    navController = navController,
                    startDestination = "screen1"
                ) {
                    composable("screen1") { Screen1(navController) }
                    composable("screen2") { Screen2(navController) }
                }
            }
        }
    }
}

@Composable
fun Screen1(navController: NavController) {
    // Content for screen 1
    Button(modifier = Modifier.fillMaxWidth(), onClick = { navController.navigate("screen2") }) {
        Text("Go to Screen 2")
    }
}

@Composable
fun Screen2(navController: NavController) {
    // Content for screen 2
    Button(onClick = { navController.popBackStack() }) { // Go back to previous screen
        Text("Go Back")
    }
}

@WearPreviewDevices
@Composable
fun WNavigationPreview(){
    WNavigation()
}
