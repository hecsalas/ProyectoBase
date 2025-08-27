package com.example.miproyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//IMPORT PACKAGE CUSTOM UTILS
import com.example.miproyectobase2.utils.OpMatematicas

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        //declaramos variables con los elementos del layout
        val edNumber1:EditText = findViewById(R.id.edNumber1)
        val edNumber2:EditText = findViewById(R.id.edNumber2)
        val txMsj:TextView = findViewById(R.id.txMsj)
        val btnCalcular:Button = findViewById(R.id.btnCalcular)

        //Conversiones dentro de boton
        btnCalcular.setOnClickListener{
            var calcN1:Int = edNumber1.text.toString().toIntOrNull() ?: 0
            var calcn2:Int = edNumber2.text.toString().toIntOrNull() ?: 0

            var resultadoOP: Int = OpMatematicas.sumar(calcN1, calcn2)

            txMsj.text = resultadoOP.toString()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}