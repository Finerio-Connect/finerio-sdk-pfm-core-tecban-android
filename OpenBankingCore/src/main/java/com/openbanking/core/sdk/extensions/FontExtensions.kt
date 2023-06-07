package com.openbanking.core.sdk.extensions

import android.graphics.Typeface
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

fun TextView.typeFace(typeface: Typeface?, style: Int) {
    if (typeface == null) {
        this.setTypeface(null, style)
    } else {
        this.typeface = typeface
    }
}

fun Button.typeFace(typeface: Typeface?, style: Int) {
    if (typeface == null) {
        this.setTypeface(null, style)
    } else {
        this.typeface = typeface
    }
}

fun EditText.typeFace(typeface: Typeface?, style: Int) {
    if (typeface == null) {
        this.setTypeface(null, style)
    } else {
        this.typeface = typeface
    }
}

fun CheckBox.typeFace(typeface: Typeface?, style: Int) {
    if (typeface == null) {
        this.setTypeface(null, style)
    } else {
        this.typeface = typeface
    }
}