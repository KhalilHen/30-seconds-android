package com.example.a30seconds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a30seconds.screens.HomePage
import com.example.a30seconds.ui.theme._30SecondsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30SecondsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    HomePage(
                        modifier = Modifier.padding(innerPadding)
                    )


                }
            }
        }
    }
}

