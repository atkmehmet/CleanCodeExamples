package com.example.december07.representation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.december07.domain.model.Person
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class ScreenView:ViewModel() {

    private var _state by mutableStateOf(ScreenState())
    private val _listPerson = MutableStateFlow( emptyList<Person>())
    val listItem=_listPerson.asStateFlow()
    val state: ScreenState
        get() =_state

    init {

    }


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

                    viewModelScope.launch(Dispatchers.IO) {
                        withContext(Dispatchers.Main) {
                            _listPerson.value = _listPerson.value + listOf(
                                Person(
                                    _state.name,
                                    _state.surnmae,
                                    _state.phoneNumber
                                )
                            )

                        }


                        _state=_state.copy(
                            name = "",
                            surnmae = "",
                            phoneNumber = ""
                        )
                }
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