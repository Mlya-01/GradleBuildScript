package com.example.gradlebuildscript

import android.app.Activity
import android.graphics.Color
import android.view.View
import android.view.ViewGroup

fun Activity.drawBadge() {
    val badage = View(this)
    badage.setBackgroundColor(Color.YELLOW)
    val decorView = window.decorView as ViewGroup
    decorView.addView(badage, 200, 200)
}