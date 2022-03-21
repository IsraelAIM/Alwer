package com.elmundo.alwer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val entrada=findViewById<Button>(R.id.btnEntrar)
        //Aqui estan los doss
        val user:EditText;
        val pass:EditText;
        user=findViewById(R.id.txtUser);
        pass=findViewById(R.id.txtPassw);

        entrada.setOnClickListener(View.OnClickListener {
            var usuario=user.getText().toString()
            var contraseña=pass.getText().toString()
            if(usuario.isNullOrEmpty() || contraseña.isNullOrEmpty()){
                Toast.makeText(this, "Introduzca contraseña o nombre de usuario",Toast.LENGTH_SHORT).show()
            }else{
                if(usuario=="Hola" && contraseña=="1234"){
                    val intent=Intent(this,option::class.java)
                    startActivity(intent)
                } else{
                    Toast.makeText(this, "Datos incorrectos",Toast.LENGTH_SHORT).show()
                }
            }
        })
        //Fin
    }//fin

}