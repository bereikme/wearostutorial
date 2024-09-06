package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.example.android.wearable.composestarter.R

@Composable
fun WButton(){
    val enabledState by remember { mutableStateOf(false) }
    Button(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
        enabled = enabledState
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_airplane_ticket),
            contentDescription = "airplane ticket",
            modifier = Modifier.size(24.dp)
        )
    }
}

@WearPreviewDevices
@Composable
fun WButtonPreview(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ){
        WButton()
    }
}
