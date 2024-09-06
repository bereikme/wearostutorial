package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Checkbox
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleChip
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices

@Composable
fun WChip(){
    Chip(
        modifier = Modifier.padding(16.dp),
        onClick = { /* TODO: Handle chip click */ },
        label = { Text("Call Mom") },
        icon = {
            Icon(
                imageVector = Icons.Filled.Call,
                contentDescription = "Call icon",
                modifier = Modifier.size(ChipDefaults.IconSize)
            )
        }
    )
}

@WearPreviewDevices
@Composable
fun WChip_Preview(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        WChip()
    }
}

@Composable
fun WToggleChip(){
    var checked by remember { mutableStateOf(false) }
    ToggleChip(
        checked = checked,
        onCheckedChange = { checked = it },
        label = { Text("Sound") },
        toggleControl = {
            Checkbox(
                checked = checked,
                onCheckedChange = null
            // We update the state in onCheckedChange of ToggleChip
            )
        }
    )
}

@WearPreviewDevices
@Composable
fun WToggleChip_Preview() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ){
    WToggleChip()
    }
}


