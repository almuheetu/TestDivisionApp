package com.softzino.testdivisionsapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.model.DivisionResponse
import kotlinx.coroutines.launch
import java.io.IOException

class DivisionViewModel(val divisionRepository: DivisionRepository) : ViewModel() {

//    private val _eventShowMessage: MutableLiveData<String?> by lazy {
//        MutableLiveData<String?>()
//    }
//
//    val eventShowMessage: LiveData<String?>
//        get() = _eventShowMessage
//
//    // ----------------------------------------------------------------
//
//    private val _eventShowLoading: MutableLiveData<Boolean?> by lazy {
//        MutableLiveData<Boolean?>()
//    }
//
//    val eventShowLoading: LiveData<Boolean?>
//        get() = _eventShowLoading

    // ----------------------------------------------------------------

    private val _items: MutableLiveData<DivisionResponse> by lazy {
        MutableLiveData<DivisionResponse>()
    }
    val items: LiveData<DivisionResponse?> get() = _items

    fun getDivision() = viewModelScope.launch {
//        _eventShowLoading.value = true
        try {
            _items.value = divisionRepository.getDivisions()
            if (_items == null) {
                items.value?.let {

//                    _eventShowMessage.value = "Data not found"
                }
            }
//            _eventShowLoading.value = false
        } catch (e: IOException) {
//            _eventShowMessage.value = e.message
//            _eventShowLoading.value = false
        }
    }
}
