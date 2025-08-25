package com.example.miproyectobase2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //declaramos variables con los elementos del layout
        val edUsername:EditText = findViewById(R.id.edUsername)
        val edClave:EditText = findViewById(R.id.edClave)
        val btnLogin:Button = findViewById(R.id.btnLogin)
        val txMensaje:TextView = findViewById(R.id.txmensaje)

        //variables en duro
        var defaultUsr = "admin@duocuc.cl"
        var defaultclave = "admin123"

        //Accion sobre el boton
        btnLogin.setOnClickListener{
            if(edUsername.text.toString() == defaultUsr &&
                edClave.text.toString() == defaultclave){
                txMensaje.text = "Bienvenid@"

                val nuevaVentana = Intent(this, MainActivity2::class.java)
                nuevaVentana.putExtra("pUsuario",edUsername.text.toString())

                startActivity(nuevaVentana)

            }else{
                txMensaje.text = "Error! Usuario/Password Incorrecto "

            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}