package com.example.a30seconds.screens


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape

import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddBox
import androidx.compose.material.icons.outlined.PersonAddAlt
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30seconds.components.ActionCard
import com.example.a30seconds.components.AppBar
import com.example.a30seconds.ui.theme._30SecondsTheme

@Preview(showBackground = true)
@Composable
fun HomePagePreview() {
    _30SecondsTheme { HomePage() }
}

@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { AppBar() }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(top = 24.dp)
        ) {


            Row(
                Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                //TODO Turn this into an component
                Card(
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                    ),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 12.dp
                    ),
                    shape = RoundedCornerShape(26.dp),


                    modifier = Modifier.size(height = 225.dp, width = 350.dp)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(24.dp)
                    ) {


                        Text(
                            "Ready to play?",
                            style = MaterialTheme.typography.headlineSmall,
                            modifier = Modifier.padding(top = 28.dp)
                        )



                        Text(
                            "Gather your team  and test your quik thinking skills!!",
                            style = MaterialTheme.typography.bodyMedium,
                            softWrap = true,
                            maxLines = 3,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(start = 12.dp, end = 10.dp)
                        )


                        ElevatedButton(
                            enabled = true,
                            colors = ButtonDefaults.elevatedButtonColors(

                                containerColor = MaterialTheme.colorScheme.onPrimary,
                                contentColor = MaterialTheme.colorScheme.primaryContainer
                            ),

                            onClick = {}
                        ) {
//TODO Add here an navigation
                            Icon(
                                imageVector = Icons.Outlined.PlayArrow,

                                contentDescription = "Localized description"

                            )

                            Text("Play Now")

                        }


                    }

                }


            }


            Spacer(modifier = Modifier.height(24.dp))
            Row(
                Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,

                ) {


                ActionCard(title = "Create a List", icon = Icons.Outlined.AddBox, onClick = {
//! Add here navigation

                    println("Je  hebt hierop gedrukt!")
                })
                Spacer(Modifier.width(14.dp))
                ActionCard(title = "Join game", icon = Icons.Outlined.PersonAddAlt, onClick = {
//! Add here navigation

                })


            }

        }


    }


}









