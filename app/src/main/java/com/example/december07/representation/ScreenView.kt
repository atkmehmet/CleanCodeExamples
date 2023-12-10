package com.example.december07.representation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.december07.domain.model.Person

class ScreenView:ViewModel() {

    private var _state by mutableStateOf(ScreenState())
    val state: ScreenState
        get() =_state




    fun changeValue(event: ScreenEvent){

        when(event){

            is ScreenEvent.nameValue ->{
                _state=_state.copy(
                    name = event.name
                )
            }
            is ScreenEvent.phoneValue ->{
                _state=_state.copy(
                    phoneNumber = event.phone
                )
            }
            is ScreenEvent.surnameValue->{
                  _state=_state.copy(
                      surnmae = event.surname
                  )
            }
            ScreenEvent.addList->{
                if (_state.name.isNotEmpty() and _state.surnmae.isNotEmpty() and _state.phoneNumber.isNotEmpty()){
                    val listperson=_state.listPerson
                    listperson.contains(Person(_state.name,_state.surnmae,_state.phoneNumber))
                    _state=_state.copy(
                        listPerson = listperson
                    )
                }
                else{
                    _state=_state.copy(
                        error ="Please not empty fields."
                    )
                }

            }


        }

    }

}