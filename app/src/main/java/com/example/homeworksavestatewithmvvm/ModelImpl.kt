package com.example.homeworksavestatewithmvvm

object ModelImpl:Model {
    private var numberOfClicks:Int = 0

    override fun getNumberOfClicks(): Int = numberOfClicks

    override fun addNumberOfClicks() {
        numberOfClicks += 1
    }
}
