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
        var bcal = findViewById<Button>(R.id.btnCal)
        bcal.setOnClickListener {
            var a1 = findViewById<EditText>(R.id.A).getText().toString().toDouble()
            var b1 = findViewById<EditText>(R.id.C).getText().toString().toDouble()
            var c1 = findViewById<EditText>(R.id.res1).getText().toString().toDouble()
            var a2 = findViewById<EditText>(R.id.B).getText().toString().toDouble()
            var b2 = findViewById<EditText>(R.id.D).getText().toString().toDouble()
            var c2 = findViewById<EditText>(R.id.res2).getText().toString().toDouble()

            var txX = findViewById<TextView>(R.id.fequis)
            var txY = findViewById<TextView>(R.id.fDiegra)

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

    }
}