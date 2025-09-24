package com.example.miproyectobase2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //variables con los elementos del layout
        val edUsername:EditText = findViewById(R.id.ed_username)
        val edPasswd:EditText = findViewById(R.id.ed_password)
        val btnlogin:Button = findViewById(R.id.btn_login)
        val txMensaje:TextView = findViewById(R.id.tx_mensaje)

        //variables para la password
        var usuarioBase = "admin"
        var passwdBase = "admin"

        btnlogin.setOnClickListener{

            if(edUsername.text.toString() == usuarioBase
                && edPasswd.text.toString() == passwdBase){

                //Crear objeto intent
                val nuevaVentana = Intent(this, SpinnerRegionComuna::class.java)

                var ses_username = edUsername.text.toString()

                nuevaVentana.putExtra("sesion",ses_username)
                nuevaVentana.putExtra("par_contrasena", edPasswd.text.toString() )  // abrimos el Activity
                startActivity(nuevaVentana)

                val toast = Toast.makeText(this, "Bienvenid@s: "+ses_username, Toast.LENGTH_SHORT) // in Activity
                toast.show()
                txMensaje.text = "Login OK!!"
            }else{
                txMensaje.text = "Login NO!!"
            }
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}