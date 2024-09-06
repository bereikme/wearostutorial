package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.runtime.Composable
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.PositionIndicator
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.material.Vignette
import androidx.wear.compose.material.VignettePosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Text
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices

@Composable
fun WScaffold() {
    val listState = rememberScalingLazyListState()

    MaterialTheme {
        Scaffold(
            timeText = { TimeText() },
            vignette = { Vignette(vignettePosition = VignettePosition.TopAndBottom) },
            positionIndicator = {
                if (listState.isScrollInProgress) {
                    PositionIndicator(scalingLazyListState = listState)
                }
            }
        ) { // This is the padding you should use for your content
            ScalingLazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp), // Use the inner padding
                state = listState,
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(20) { index ->
                    Text("Item ${index + 1}")
                }
            }
        }
    }
}

@WearPreviewDevices
@Composable
fun WScaffoldPreview(){
    WScaffold()
}


