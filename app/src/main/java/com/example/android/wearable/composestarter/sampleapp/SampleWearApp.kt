package com.example.android.wearable.composestarter.sampleapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.android.wearable.composestarter.presentation.theme.WearAppTheme
import com.google.android.horologist.annotations.ExperimentalHorologistApi
import com.google.android.horologist.compose.layout.AppScaffold
import com.google.android.horologist.compose.layout.ScalingLazyColumn
import com.google.android.horologist.compose.layout.ScalingLazyColumnDefaults
import com.google.android.horologist.compose.layout.ScreenScaffold
import com.google.android.horologist.compose.layout.rememberResponsiveColumnState

@OptIn(ExperimentalHorologistApi::class)
@Composable
fun SampleWearApp() {

    WearAppTheme {
        AppScaffold {
            val listState = rememberResponsiveColumnState(
                contentPadding = ScalingLazyColumnDefaults.padding(
                    first = ScalingLazyColumnDefaults.ItemType.SingleButton,
                    last = ScalingLazyColumnDefaults.ItemType.Chip,
                ),
            )
            // Modifiers used by our Wear composables.
            val contentModifier = Modifier.fillMaxWidth().padding(bottom = 8.dp)
            val iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)

            ScreenScaffold(
                scrollState = listState,
            ) {
                ScalingLazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    columnState = listState
                ) {
                    // 1
                    item { WearButton(contentModifier, iconModifier) }
                    item { WearText(contentModifier) }
                    item { WearCard(contentModifier, iconModifier) }

                    // 2
                    item { WearChip(contentModifier, iconModifier) }
                    item { WearToggleChip(contentModifier) }
                }
            }
        }
    }
}
