package com.example.a30seconds

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.a30seconds.screens.HomePage
import com.example.a30seconds.ui.theme._30SecondsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30SecondsTheme {

                    HomePage(

                    )


                }///
            }
        }

    }


