package com.example.december07.representation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.december07.domain.model.Person
import kotlinx.coroutines.flow.map


@Composable
fun mainScreen(view: ScreenView,onEvent:(ScreenEvent)->Unit){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {


            TextField(value =view.state.name ,
                onValueChange ={onEvent(ScreenEvent.nameValue(it))},
                placeholder = {"Please name Value"} )



        TextField(value =view.state.surnmae ,
            onValueChange ={onEvent(ScreenEvent.surnameValue(it))},
            placeholder = {"Please Surname Value"} )

        TextField(value =view.state.phoneNumber ,
            onValueChange ={onEvent(ScreenEvent.phoneValue(it))},
            placeholder = {"Please phone Value"} )

        TextField(value =view.state.error ,
            onValueChange ={onEvent(ScreenEvent.phoneValue(it))},
            placeholder = {"Please phone Value"} )

        Button(onClick = { onEvent(ScreenEvent.addList) }) {
            Text(text = "Add List")
        }
        LazyColumn{
             val list=view.listItem.value
            items(view.listItem.value){
                    person->
                detailsPerson(person.name,person.surname,person.phoneNumber,view::changeValue)
            }
        }
    }

    }


