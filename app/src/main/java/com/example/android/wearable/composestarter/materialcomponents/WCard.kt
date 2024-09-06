package com.example.android.wearable.composestarter.materialcomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.Card
import androidx.wear.compose.material.Text
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.example.android.wearable.composestarter.R

@Composable
fun WCard(){
    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier.wrapContentWidth().padding(20.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "background image",
            modifier = Modifier.fillMaxWidth()
        )
        Text(text = "Title")
        Text(text = "Content")
    }
}

@WearPreviewDevices
@Composable
fun WCardPreview(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(10.dp),
        horizontalArrangement = Arrangement.Center
    ){
        WCard()
    }
}
