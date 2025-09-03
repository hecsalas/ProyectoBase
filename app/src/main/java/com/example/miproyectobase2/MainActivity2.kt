package com.example.miproyectobase2

import android.content.Intent
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



        val btnCalculadora:Button = findViewById(R.id.btn_abrir_calculadora)

        btnCalculadora.setOnClickListener{
            val abrirCalculadora = Intent(this, MainActivity5::class.java)
            startActivity(abrirCalculadora)
        }


        //ACTIVITY DESTINO
        val msjeBienvenida:TextView = findViewById(R.id.tx_bienvenido)
        //CREO VARIABLE ASIGNO VALOR DESDE OTRO ACTIVITY
        val usuarioDesdeOtroActivity = intent.getStringExtra("sesion")
        //SETEO UN TEXT VIEW REEMPLAZANDO EL TEXTO POR EL CONTENIDO
        msjeBienvenida.text = usuarioDesdeOtroActivity.toString()

        val recibeContrasena = intent.getStringExtra("par_contrasena")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}