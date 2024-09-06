package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.TimeText
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices

@Composable
fun WText(){
    TimeText(
        startLinearContent = { Text("ETA") }, // Content before time on square devices
        endLinearContent = { Text("30 min", color = Color.Red) }  // Content after time on square devices
    )
}

@OptIn(ExperimentalLayoutApi::class)
@WearPreviewDevices
@Composable
fun WTextPreview(){
    FlowRow(
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        WText()
    }
}
