package com.example.homeworksavestatewithmvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {
    private val model:Model = ModelImpl
    val numberOfClickLiveData = MutableLiveData(model.getNumberOfClicks())

    fun addItem() {
        model.addNumberOfClicks()
        numberOfClickLiveData.value = model.getNumberOfClicks()
    }
}
