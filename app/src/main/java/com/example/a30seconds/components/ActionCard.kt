package com.example.a30seconds.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun ActionCard(modifier: Modifier = Modifier, title: String, icon: ImageVector, onClick: () -> Unit) {

    Card(
        colors = CardDefaults.cardColors(

            containerColor = MaterialTheme.colorScheme.onPrimary,

            ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 12.dp,
        ),
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .size(height = 140.dp, width = 170.dp)
            .clickable(onClick = onClick),


        ) {

//* Same as sizedbox
        Spacer(Modifier.padding(top = 8.dp))
        Column(

            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Icon(
                modifier = Modifier.size(size = 36.dp),
                imageVector = icon,
                contentDescription = title,
            )

            Spacer(Modifier.height(height = 12.dp))

            Text(title, style = MaterialTheme.typography.labelLarge)
        }
    }


}
