package com.example.lab2jacqueline

public open class Vehiculo(var modelo:String, var marca:String, var anio:Int) {
 public fun crear(){
  if (modelo=="Frontier") {
      println("La marca del vehiculo es: $marca y el año es $anio")
  }
 }
}