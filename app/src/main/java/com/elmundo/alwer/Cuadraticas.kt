package com.elmundo.alwer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Math.sqrt
import kotlin.math.pow

class Cuadraticas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuadraticas)

        var x1 = Int
        var x2 = Int
        var al = findViewById<EditText>(R.id.A)
        var be = findViewById<EditText>(R.id.B)
        var ch = findViewById<EditText>(R.id.C)
        var sResultado1 = findViewById<TextView>(R.id.X)
        var sResultado2 = findViewById<TextView>(R.id.Y)

        var calculo= findViewById<Button>(R.id.btnCal)

        calculo.setOnClickListener {
            var a = al.text.toString().toDouble()
            var b = be.text.toString().toDouble()
            var c = ch.text.toString().toDouble()

            val x1= (-b +(sqrt(b.pow(2.0) - (4*a*c)))) / 2*a
            val x2= (-b -(sqrt(b.pow(2.0) - (4*a*c)))) / 2*a

            val d= b.pow(2.0) - (2*a*c)

            sResultado1.setText("" +x1)
            sResultado2.setText("" +x2)

            if (d>= 0){
                Toast.makeText(this, "Tiene solucion con numeros reales", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "No tiene solucion con numeros reales", Toast.LENGTH_SHORT).show()
            }
    }
}}