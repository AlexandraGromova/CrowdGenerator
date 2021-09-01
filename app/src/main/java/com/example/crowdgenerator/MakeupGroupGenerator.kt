package com.example.crowdgenerator

import android.util.Log

private const val TAG = "MakeupGroupGenerator"

class MakeupGroupGenerator(private val maxMakeupCount: Int, private val minMakeupCount: Int) {
    private val storageOfOptions = StorageOfOptions()
    val makeupList: MutableList<Makeup> = mutableListOf()
    fun generator() {
        var i = minMakeupCount
        var j = 0
        while (i <= maxMakeupCount) {
            val makeup = Makeup(
                storageOfOptions.lips.random(),
                storageOfOptions.eyes.random(),
                storageOfOptions.blush.random()
            )
            makeupList.add(j, makeup)
            Log.v(TAG, "rrr $makeup $i")
            j++
            i++
        }
    }
}