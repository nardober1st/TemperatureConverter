package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FahrenheitToCelsiusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrenheit_to_celsius)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnFahrenheitResult: Button = findViewById(R.id.btn_fahrenheit_result)
        val edtFahrenheit: EditText = findViewById(R.id.edt_fahrenheit)
        val tvFahrenheitResult: TextView = findViewById(R.id.txt_fahrenheitcelsius_result)

        btnFahrenheitResult.setOnClickListener {

            val userFahrenheitTemp = edtFahrenheit.text.toString().toFloat()

            val fahrenheitToCelsius = (userFahrenheitTemp - 32f) * (5f / 9f)
            val roundedFahrenheit = "%.1f".format(fahrenheitToCelsius)

            tvFahrenheitResult.text = roundedFahrenheit.toString() + "C"
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}
