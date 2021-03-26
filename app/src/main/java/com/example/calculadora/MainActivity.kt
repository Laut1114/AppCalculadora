package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /*fun sumar(view: View) {

        val ediTextnumber1: EditText = findViewById(R.id.Numero1)
        val ediTextnumber2: EditText = findViewById(R.id.Numero2)
        var numero1: Int = ediTextnumber1.text.toString().toInt()
        var numero2:Int = ediTextnumber2.text.toString().toInt()

        var resultado: Int = numero1 + numero2
        Toast.makeText(this, "La suma es: "+resultado, Toast.LENGTH_LONG).show()
        Log.i("pruebaSuma", "Estoy en metodo Sumar")
    }*/

    fun verificacion(view: View) {
        val num_edad: EditText = findViewById(R.id.edad)
        var num: Int = num_edad.text.toString().toInt()

        if (num >= 16 ) {
            Toast.makeText(this, "Usted ya puede votar", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usted todavia no puede votar", Toast.LENGTH_LONG).show()
        }
    }
}