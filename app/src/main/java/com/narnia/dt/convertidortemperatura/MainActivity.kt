package com.narnia.dt.convertidortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinnerTemp)
        val RES = findViewById<TextView>(R.id.textVResultado)
        val temp = findViewById<EditText>(R.id.editTextNTemp)
        val buttonConvertir = findViewById<Button>(R.id.buttonConvertir)

        buttonConvertir.setOnClickListener{
            Toast.makeText(this, ""+ temp.text , Toast.LENGTH_SHORT).show()
        }

    }

    public fun converter(){

        //TODO Add when statement to process conversions.
    }
}