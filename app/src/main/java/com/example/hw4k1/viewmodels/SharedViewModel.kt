package com.example.hw4k1.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private var mCounter = 0

    val counter = MutableLiveData<Int>()

    fun increaseCounter() {
        mCounter++
        counter.value = mCounter
    }

}