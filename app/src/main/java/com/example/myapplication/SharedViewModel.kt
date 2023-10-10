package com.example.myapplication

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    private val TAG = "SharedViewModel"
    private val _quantity: MutableLiveData<Int> = MutableLiveData(0)
    val quantity: LiveData<Int> = _quantity

    init {
        Log.i(TAG, "created")
    }

    fun increaseQuantity() {
        _quantity.value = _quantity.value!! + 1

        Log.i(TAG, "Quantity: ${_quantity.value}")

    }

    fun decreaseQuantity() {
        if (_quantity.value!! > 0) {
            _quantity.value = _quantity.value!! - 1

            Log.i(TAG, "Quantity: ${_quantity.value}")
        }
    }

}