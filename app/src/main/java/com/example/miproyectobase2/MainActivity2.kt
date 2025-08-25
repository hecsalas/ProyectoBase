package com.example.miproyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        //ACTIVITY DESTINO
        val mensajeBienvenida:TextView = findViewById(R.id.tx_bienvenido)
        val btnFormulario:Button = findViewById(R.id.btnFormulario)

        //CREO VARIABLE ASIGNO VALOR DESDE OTRO ACTIVITY
        val usuarioDesdeotroActivity = intent.getStringExtra("pUsuario")

        //SETEO UN TEXT VIEW REEMPLAZANDO EL TEXTO POR EL CONTENIDO
        mensajeBienvenida.text = usuarioDesdeotroActivity.toString()

        val recibeClave = intent.getStringExtra("par_clave")

        //ACCION SOBRE EL BOTON
        btnFormulario.setOnClickListener()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}