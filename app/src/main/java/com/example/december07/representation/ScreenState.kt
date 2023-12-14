package com.example.december07.representation

import com.example.december07.domain.model.Person
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emptyFlow

data class ScreenState (
    val name:String="",
    val surnmae:String="",
    val phoneNumber:String="",
    val error:String="",
    val listPerson: Flow<List<Person>> = emptyFlow<List<Person>>()
)