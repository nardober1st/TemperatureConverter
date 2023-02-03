package com.example.temperatureconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCelsiusToFahrenheit = findViewById<Button>(R.id.btn_celsius)
        val btnFahrenheitToCelsius = findViewById<Button>(R.id.btn_fahrenheit)

        btnCelsiusToFahrenheit.setOnClickListener {

            val intentCelsius = Intent(this, CelsiusToFahrenheitActivity::class.java)
            startActivity(intentCelsius)
        }

        btnFahrenheitToCelsius.setOnClickListener {

            val intentFahrenheit = Intent(this, FahrenheitToCelsiusActivity::class.java)
            startActivity(intentFahrenheit)
        }
    }
}