package com.example.proyecto_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import android.widget.TextView

data class cursos(val nombres: String, val url:String)

class MainActivity : AppCompatActivity() {

    val react = cursos("React", "react")
    val kot = cursos("Kotlin", "kotlin")
    var cursoActual = react.copy()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById(R.id.boton) as Button
        boton. setOnClickListener {
            View -> Switchcurso(cursoActual)
        }
    }
     fun Switchcurso(curso:cursos)
     {
         cursoActual = curso.copy()
         when (curso.url)
         {
             "React " -> cursoActual = kot.copy()
             "kotlin" -> cursoActual = react.copy()
             else -> print("esto no va a pasar")
         }
         verEnPantalla("curso de ${cursoActual.nombres}en example.com/${cursoActual.url}")
     }

    fun verEnPantalla(s : String)
    {
        val txt = findViewById(R.id.mensaje) as TextView
        txt.setText(s)
    }
}