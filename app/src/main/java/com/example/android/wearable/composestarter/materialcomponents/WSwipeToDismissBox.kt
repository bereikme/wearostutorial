package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.runtime.Composable
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.rememberSwipeToDismissBoxState
import androidx.wear.compose.material.SwipeToDismissBox
import androidx.wear.compose.material.Text
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices

@Composable
fun WSwipeToDismissBox() {
    val state = rememberSwipeToDismissBoxState()
    SwipeToDismissBox(
        state = state,
        backgroundKey = 0 // Use this to differentiate between different backgrounds
    ) { isBackground ->
        if (isBackground) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Red), // Background color when swiping
                contentAlignment = Alignment.Center
            ) {
                Text("Swiping...")
            }
        } else {
            // Your main content goes here
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text("Swipe to dismiss")
            }
        }
    }
}

@Preview
@WearPreviewDevices
@Composable
fun WSwipeToDismissBoxPreview(){
    WSwipeToDismissBox()
}
