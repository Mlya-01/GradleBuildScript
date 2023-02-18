package com.example.gradlebuildscript

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library1.Lib1Class

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawBadge()

        Lib1Class()
    }
}