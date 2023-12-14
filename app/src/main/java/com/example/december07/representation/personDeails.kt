package com.example.december07.representation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun detailsPerson(name: String?, surname: String?,phone:String?, onEvent:(ScreenEvent)->Unit,modifier: Modifier=Modifier,
                      horizontalAlignment: Alignment.Horizontal = Alignment.Start) {
    Column(modifier = modifier,
        horizontalAlignment = horizontalAlignment) {
        if (name != null) {
            Text(
                text = name,
                style = MaterialTheme.typography.h2
            )
        }

        if (surname != null) {
            Text(
                text = surname,
                style = MaterialTheme.typography.body2
            )
        }
        if (phone != null) {
            Text(
                text = phone,
                style = MaterialTheme.typography.body2
            )
        }
    }
}
