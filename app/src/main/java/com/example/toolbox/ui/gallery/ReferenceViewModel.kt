package com.example.toolbox.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReferenceViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reference Fragment"
    }
    val text: LiveData<String> = _text
}