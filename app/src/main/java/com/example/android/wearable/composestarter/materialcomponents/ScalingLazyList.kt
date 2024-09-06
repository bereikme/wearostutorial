package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.ScalingLazyListState
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Text
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices

@Composable
fun WScalingLazyList(){
    val listState : ScalingLazyListState = rememberScalingLazyListState()
    ScalingLazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        state = listState
    ) {
        items(20) { index ->
            Text("Item ${index + 1}")
        }
    }
}

@WearPreviewDevices
@Composable
fun WScalingLazyListPreview(){
    WScalingLazyList()
}
