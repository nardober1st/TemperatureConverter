package com.example.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class CelsiusToFahrenheitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celsius_to_fahrenheit)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btnCelsiusResult: Button = findViewById(R.id.btn_celsius_result)
        val edtCelsius: EditText = findViewById(R.id.edt_celsius)
        val tvCelsiusResult: TextView = findViewById(R.id.txt_celsiusfahrenheit_result)

        btnCelsiusResult.setOnClickListener {

            val userCelsiusTemp = edtCelsius.text.toString().toFloat()

            val celsiusToFahrenheit = (userCelsiusTemp * 1.8) + 32
            val roundedCelsius = "%.1f".format(celsiusToFahrenheit)

            tvCelsiusResult.text = roundedCelsius.toString() + "F"
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)
    }
}