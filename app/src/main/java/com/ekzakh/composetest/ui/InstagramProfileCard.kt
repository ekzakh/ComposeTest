package com.ekzakh.composetest.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ekzakh.composetest.ui.theme.ComposeTestTheme

@Composable
fun InstagramProfileCard() {
    Card(
        shape = RoundedCornerShape(topStart = 8.dp, topEnd = 8.dp),
        colors = CardDefaults.cardColors(MaterialTheme.colorScheme.background),
        border = BorderStroke(width = 1.dp, color = MaterialTheme.colorScheme.onBackground),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Red),
            ) {}
            UserStatistics(title = "Posts", value = "6.950")
            UserStatistics(title = "Followers", value = "463M")
            UserStatistics(title = "Following", value = "79")
        }
    }
}

@Composable
private fun UserStatistics(title: String, value: String) {
    Column(
        modifier = Modifier.height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        Text(
            text = value,
            fontSize = 24.sp,
            fontFamily = FontFamily.Cursive,
        )
        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
        )
    }
}

@Preview
@Composable
fun InstagramProfileCardLight() {
    ComposeTestTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
fun InstagramProfileCardDark() {
    ComposeTestTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}