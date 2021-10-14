package com.example.lab2jacqueline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clases()
    }
//Desarrolle un aplicativo para crear vehículos que le permita crear 3 objetos distintos,
// requisitos del programa que se debe implementar: - Herencia.- Abstracción - Interface-
// Y los modificadores de acceso. Se debe de entregar en un repositorio alojado en GitHub
// y pegar el enlace en el espacio asignado.
private fun clases() {
    var coche = Vehiculo(
        "Frontier",
        "Nissan", 2010
    )
    println(coche)
    coche.crear()
}
    
}