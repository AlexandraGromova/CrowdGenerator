package com.example.crowdgenerator

import android.util.Log

private const val TAG = "MakeupGroupGenerator"

class MakeupGroupGenerator(private val maxMakeupCount: Int, private val minMakeupCount: Int) {
    private val storageOfOptions = StorageOfOptions()
    fun generator() {
        var i = minMakeupCount
        val makeupList: MutableList<Makeup> = mutableListOf()
        while (i < maxMakeupCount) {
            val makeup = Makeup(
                storageOfOptions.lips.random(),
                storageOfOptions.eyes.random(),
                storageOfOptions.blush.random()
            )
            makeupList.add(i-1, makeup)
            Log.v(TAG, "rrr $makeup $i")
            i++
        }
    }
}