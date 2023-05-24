package com.ekzakh.composetest.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun TimesTable() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
    ) {
        var color = Color.Yellow
        for (i in 1 until 10) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1F),
            ) {
                for (j in 1 until 10) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color)
                            .weight(1F)
                            .border(1.dp, Color.Blue),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(
                            text = "${i * j}",
                        )
                    }
                    color = if (color == Color.Yellow) {
                        Color.White
                    } else {
                        Color.Yellow
                    }
                }
            }
        }
    }
}
