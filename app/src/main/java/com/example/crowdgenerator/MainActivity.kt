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
            Log.v(TAG, "Все хорошо")
            val maxMakeupCount = try {
                maxEditTextView.text.toString().toInt()
            } catch (e: NumberFormatException) {
                0
            }
            val minMakeupCount = try {
                minEditTextView.text.toString().toInt()
            } catch (e: NumberFormatException) {
                0
            }
            if (maxEditTextView.text.toString() < minEditTextView.text.toString()) {
                val toast = Toast.makeText(
                    this,
                    "Неверно введен промежуток \n Попробойте еще раз",
                    Toast.LENGTH_SHORT
                )
                toast.show()
            }
            Log.v(TAG, "$maxMakeupCount")
            val makeupGroupGenerator = MakeupGroupGenerator(maxMakeupCount, minMakeupCount)
            makeupGroupGenerator.generator()
            val text = Text(makeupGroupGenerator.makeupList)
            text.preparation()
            textView.text = text.finalText
        }
    }
}