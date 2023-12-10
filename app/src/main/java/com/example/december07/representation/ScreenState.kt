package com.example.december07.representation

import com.example.december07.domain.model.Person

data class ScreenState (
    val name:String="",
    val surnmae:String="",
    val phoneNumber:String="",
    val error:String="",
    val listPerson: List<Person> = emptyList()
)