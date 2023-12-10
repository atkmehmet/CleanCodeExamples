package com.example.december07.representation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun mainScreen(view: ScreenView,onEvent:(ScreenEvent)->Unit){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        TextField(value =view.state.name ,
            onValueChange ={onEvent(ScreenEvent.nameValue(it))},
            placeholder = {"Please name Value"} )

        TextField(value =view.state.name ,
            onValueChange ={onEvent(ScreenEvent.nameValue(it))},
            placeholder = {"Please name Value"} )

        TextField(value =view.state.name ,
            onValueChange ={onEvent(ScreenEvent.nameValue(it))},
            placeholder = {"Please name Value"} )

    }

}