package com.example.android.wearable.composestarter.sampleapp


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.Icon
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Switch
import androidx.wear.compose.material.Text
import androidx.wear.compose.material.ToggleChip
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.example.android.wearable.composestarter.R
import com.example.android.wearable.composestarter.presentation.theme.WearAppTheme

// Create a Button Composable (with a Row to center)
@Composable
fun WearButton(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        // Button
        Button(
            modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
            onClick = { /* ... */ },
        ) {
            Icon(
                imageVector = Icons.Rounded.Phone,
                contentDescription = "triggers phone action",
                modifier = iconModifier
            )
        }
    }
}

// Create a Text Composable
@Composable
fun WearText(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.app_name)
    )
}

// Create a Card (specifically, an AppCard) Composable
@Composable
fun WearCard(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    AppCard(
        modifier = modifier,
        appImage = {
            Icon(
                imageVector = Icons.Rounded.Email,
                contentDescription = "triggers open email action",
                modifier = iconModifier
            )
        },
        appName = { Text("Messages") },
        time = { Text("14m") },
        title = { Text("Niran") },
        onClick = { /* ... */ }
    ) {
        Text("On my way to Office!")
    }
}

//  Create a Chip Composable
@Composable
fun WearChip(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier
) {
    Chip(
        modifier = modifier,
        onClick = { /* ... */ },
        label = {
            Text(
                text = "5 minute face watching",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        },
        icon = {
            Icon(
                imageVector = Icons.Rounded.Face,
                contentDescription = "triggers face action",
                modifier = iconModifier
            )
        },
    )
}

// Create a ToggleChip Composable
@Composable
fun WearToggleChip(modifier: Modifier = Modifier) {
    var checked by remember { mutableStateOf(true) }
    ToggleChip(
        modifier = modifier,
        checked = checked,
        toggleControl = {
            Switch(
                checked = checked,
                modifier = Modifier.semantics {
                    this.contentDescription = if (checked) "On" else "Off"
                }
            )
        },
        onCheckedChange = {
            checked = it
        },
        label = {
            Text(
                text = "Do Something",
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
        }
    )
}

// Function only used as a demo for when you start the code lab (removed as step 1).
@Composable
fun StartOnlyTextComposables() {
    Text(
        modifier = Modifier.fillMaxSize(),
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = stringResource(R.string.hello_world),
    )
}

/* Previews of Composables. */

// Hello, world starter text preview
@WearPreviewDevices
@Composable
fun StartOnlyTextComposablesPreview() {
    WearAppTheme {
        StartOnlyTextComposables()
    }
}

// Button Preview
@WearPreviewDevices
@Composable
fun ButtonExamplePreview() {
    WearAppTheme {
        WearButton(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
        )
    }
}

// Text Preview
@WearPreviewDevices
@Composable
fun TextExamplePreview() {
    WearAppTheme {
        WearText(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        )
    }
}

// Card Preview
@WearPreviewDevices
@Composable
fun CardExamplePreview() {
    WearAppTheme {
        WearCard(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
        )
    }
}

// Chip Preview
@WearPreviewDevices
@Composable
fun ChipExamplePreview() {
    WearAppTheme {
        WearChip(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
        )
    }
}

// Toggle Chip Preview
@WearPreviewDevices
@Composable
fun ToggleChipExamplePreview() {
    WearAppTheme {
        WearToggleChip(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        )
    }
}
