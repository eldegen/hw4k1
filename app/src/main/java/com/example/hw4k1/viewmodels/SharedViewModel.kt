package com.example.hw4k1.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {

    private var mCounter = 0
    private var mStatus = arrayListOf<Boolean>()

    val counter = MutableLiveData<Int>()
    val status = MutableLiveData<ArrayList<Boolean>>()

    fun increaseCounter() {
        mCounter++
        counter.value = mCounter
    }

    fun decreaseCounter() {
        mCounter--
        counter.value = mCounter
    }

    fun setStatus(value: Boolean) {
        if (value) {
            mStatus.add(value)
            status.value = mStatus
        } else {
            mStatus.add(value)
            status.value = mStatus
        }
    }

}