package com.example.crowdgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var maxEditTextView: EditText
    private lateinit var minEditTextView: EditText
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        maxEditTextView = findViewById(R.id.maxTextView)
        minEditTextView = findViewById(R.id.minTextView)
        textView = findViewById(R.id.textView2)

        val maxMakeupCount = 5
        val minMakeupCount = 1

        val makeupGroupGenerator = MakeupGroupGenerator(maxMakeupCount, minMakeupCount)
        makeupGroupGenerator.generator()
    }
}