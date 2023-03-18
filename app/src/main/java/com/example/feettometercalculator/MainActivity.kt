package com.example.feettometercalculator

import android.R.attr.button
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val etFeet : EditText get() = findViewById(R.id.etFeet);
    private val tvMeter: TextView get() = findViewById(R.id.tvMeters);
    private val btnCalculate : Button get() = findViewById(R.id.btnCalculate);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnCalculate.setOnClickListener {tvMeter.text = "METERS: " + calculate().toString() }
    }

    private fun calculate(): Double {
        var meters : Double
        var feet:Double = etFeet.text.toString().toDouble()
        meters = 0.3048 * feet
        return meters
    }
}