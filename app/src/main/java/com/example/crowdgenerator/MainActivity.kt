package com.example.crowdgenerator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var maxEditTextView: EditText
    private lateinit var minEditTextView: EditText
    private lateinit var textView: TextView
    private lateinit var buttonMakeupVariants: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        maxEditTextView = findViewById(R.id.maxTextView)
        minEditTextView = findViewById(R.id.minTextView)
        textView = findViewById(R.id.textView2)
        buttonMakeupVariants = findViewById(R.id.button_makeup_variants)
        buttonMakeupVariants.setOnClickListener {
            val maxMakeupCount = maxEditTextView.text.toString().toInt()
            val minMakeupCount = minEditTextView.text.toString().toInt()
            Log.v(TAG, "$maxMakeupCount")
            val makeupGroupGenerator = MakeupGroupGenerator(maxMakeupCount, minMakeupCount)
            makeupGroupGenerator.generator()
            val preparationOfText = PreparationOfText(makeupGroupGenerator.makeupList)
            preparationOfText.preparation()
            textView.text = preparationOfText.finalText
        }
    }
}