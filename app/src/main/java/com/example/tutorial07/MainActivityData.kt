package com.example.tutorial07

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityData:ViewModel() {

    private val _count = MutableLiveData<Int>().apply { value = 0 }
    val count: LiveData<Int> = _count
    fun increment(){
        _count.value = _count.value!! + 1
    }

}