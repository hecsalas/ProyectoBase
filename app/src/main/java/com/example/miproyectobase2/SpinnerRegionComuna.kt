package com.example.miproyectobase2

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.miproyectobase2.ApiRegionComuna.CargarRegionComunaAPI

class SpinnerRegionComuna : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main7)

        // val opcionesLV: ListView = findViewById(R.id.lv_menu_principal)
        val spRegion : Spinner = findViewById(R.id.sp_region)
        val spComuna : Spinner = findViewById(R.id.sp_comuna)
        val btnAceptar : Button = findViewById(R.id.btn_aceptar)
        val txRegion : TextView = findViewById(R.id.tx_region)
        val txComuna : TextView = findViewById(R.id.tx_comuna)

        //CargarAlumnosAPI.cargarAlumnos(this, listaAlumnos)

        CargarRegionComunaAPI.cargarRegionComuna(this, spRegion)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}