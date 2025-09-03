package com.example.miproyectobase2.funciones

object OpMatematicas {

    //Funcion sumar recibe dos parametros y retorna un entero numerico

    fun sumar(valor1: Int, valor2: Int): Int {
        return valor1 + valor2
    }

    fun restar(valor1: Int, valor2: Int): Int {
        return valor1 - valor2
    }

    fun multiplicar(valor1: Int, valor2 : Int): Int{
        return valor1 * valor2
    }

    fun dividir(valor1: Int, valor2: Int): Int {
        try {
            return valor1 / valor2
        }catch (e: ArithmeticException){
            return 0
        }finally {
            println("Se ha producido un error")
        }
    }
}