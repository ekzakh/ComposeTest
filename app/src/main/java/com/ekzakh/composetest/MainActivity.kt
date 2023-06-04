package com.ekzakh.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModelProvider
import com.ekzakh.composetest.ui.InstagramProfileCard
import com.ekzakh.composetest.ui.MainViewModel
import com.ekzakh.composetest.ui.theme.ComposeTestTheme

class MainActivity : ComponentActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            viewModel = ViewModelProvider(this)[MainViewModel::class.java]
            ComposeTestTheme {
                Column(
                    modifier = Modifier.fillMaxSize()
                        .background(MaterialTheme.colorScheme.background),
                ) {
                    InstagramProfileCard(viewModel)
                }
            }
        }
    }
}
