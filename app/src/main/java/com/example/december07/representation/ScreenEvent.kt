package com.example.december07.representation

sealed class ScreenEvent {

    data class nameValue(val name:String) :ScreenEvent()

    data class surnameValue(val surname:String) :ScreenEvent()

    data class phoneValue(val phone:String) :ScreenEvent()

    object addList :ScreenEvent()


}