package com.narnia.dt.convertidortemperatura

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var conversion : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinnerTemp)
        val RES = findViewById<TextView>(R.id.textVResultado)
        val temp = findViewById<EditText>(R.id.editTextNTemp)
        val buttonConvertir = findViewById<Button>(R.id.buttonConvertir)

        val options = resources.getStringArray(R.array.convert_options)

        if (spinner != null ){
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View?, positions: Int, id: Long){
                    Toast.makeText(this@MainActivity, "Opcion Seleccionada", Toast.LENGTH_SHORT).show()


                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }

        }



        buttonConvertir.setOnClickListener{
            converter(conversion)
            Toast.makeText(this, ""+ temp.text , Toast.LENGTH_SHORT).show()
        }

    }

     fun converter(convert: Int){

        when(convert) {
            0 ->{
                Toast.makeText(this, "Opcion no Valida", Toast.LENGTH_SHORT).show()
            }
            1 ->{
                //°C to °F
            }
            2 ->{
                //°C to °K

            }
            3 ->{
                //°F to °C

            }
            4 ->{
                //°F to °K

            }
            5 ->{
                //°K to °C
            }
            6 ->{
                //°K to °K

            }

        }
        //TODO Add when statement to process conversions.
    }
}