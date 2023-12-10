package com.example.december07.representation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun detailsPerson(name: String, surname: String,phone:String, modifier: Modifier,
                      horizontalAlignment: Alignment.Horizontal = Alignment.Start) {
    Column(modifier = modifier,
        horizontalAlignment = horizontalAlignment) {
        Text(
            text = name,
            style = MaterialTheme.typography.bodyLarge
        )

            Text(
                text = surname,
                style = MaterialTheme.typography.bodyLarge
            )
        Text(
            text = phone,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}
