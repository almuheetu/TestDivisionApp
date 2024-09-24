package com.softzino.testdivisionsapp.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.softzino.testdivisionsapp.repositories.DivisionRepository
import com.softzino.testdivisionsapp.model.DivisionResponse
import kotlinx.coroutines.launch
import java.io.IOException

class DivisionViewModel(val divisionRepository: DivisionRepository) : ViewModel() {


    private val _items: MutableLiveData<DivisionResponse?> by lazy {
        MutableLiveData<DivisionResponse?>()
    }

    val items: LiveData<DivisionResponse?> get() = _items

    fun getDivision() = viewModelScope.launch {
        try {
            _items.value = divisionRepository.getDivisions()
            if (_items.value == null) {
                items.value?.let {
                }
            }
        } catch (e: IOException) {
            Log.e("DivisionViewModel", "Failed to fetch divisions : $e")
        }
    }
}
