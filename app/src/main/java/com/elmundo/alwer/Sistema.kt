package com.elmundo.alwer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Sistema : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sistema)
        val bcal = findViewById<Button>(R.id.btnCal)
        val bLim = findViewById<Button>(R.id.btnLimpiar)

        val al1 = findViewById<EditText>(R.id.A)
        val be1 = findViewById<EditText>(R.id.C)
        val ch1 = findViewById<EditText>(R.id.res1)

        val al2 = findViewById<EditText>(R.id.B)
        val be2 = findViewById<EditText>(R.id.D)
        val ch2 = findViewById<EditText>(R.id.res2)

        val txX = findViewById<TextView>(R.id.fequis)
        val txY = findViewById<TextView>(R.id.fDiegra)


        bcal.setOnClickListener {
            var a1 = al1.getText().toString().toDouble()
            var b1 = be1.getText().toString().toDouble()
            var c1 = ch1.getText().toString().toDouble()
            var a2 = al2.getText().toString().toDouble()
            var b2 = be2.getText().toString().toDouble()
            var c2 = ch2.getText().toString().toDouble()

            var r = (a1 * b2) - (a2 * b1)

            var rx = (c1 * b2) - (c2 * b1)
            var x = rx / r

            var ry = (a1 * c2) - (a2 * c1)
            var y = ry / r
            x.toString()
            y.toString()
            if ((x.toString().equals("NaN") || x.toString().equals("Infinity")) && (y.toString()
                    .equals("NaN") || y.toString().equals("Infinity"))
            ) {
                txX.setText("Sin Solución")
                txY.setText("Sin Solución")
            } else {
                txX.setText(x.toString())
                txY.setText(y.toString())
            }
        }
        bLim.setOnClickListener {
            al1.setText(""); be1.setText(""); ch1.setText("");al2.setText("");be2.setText("");ch2.setText(
            ""
        );txX.setText("");txY.setText("");
            Toast.makeText(this, "Hecho", Toast.LENGTH_SHORT).show()
        }
    }
}