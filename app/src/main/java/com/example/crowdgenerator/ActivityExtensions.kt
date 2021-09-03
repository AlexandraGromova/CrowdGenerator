package com.example.crowdgenerator

import android.app.Activity
import android.view.View
import android.view.inputmethod.InputMethodManager

class ActivityExtensions() {
    fun Activity?.hideSoftKeyboard() {
        this ?: return
        (getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager)
            .hideSoftInputFromWindow(findViewById<View>(android.R.id.content).windowToken, 0)
    }

}