package com.example.a5_tenzor_two_activities

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReceiverViewModel : ViewModel() {
    private val message = MutableLiveData<String>()

    fun getMessage(): MutableLiveData<String> {
        return message
    }

    fun storeMessage(message: String) {
        this.message.postValue(message)
    }
}