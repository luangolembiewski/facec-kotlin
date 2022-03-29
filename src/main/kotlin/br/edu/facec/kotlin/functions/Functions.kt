package br.edu.facec.kotlin.functions

public class Functions (num1: Int,num2: Int) {

    public fun Somar(num1: Int, num2: Int): Float {
        val resultado: Float = (num1+num2).toFloat()
        return resultado
    }
    public fun Subtrair(num1: Int, num2: Int): Float {
        val resultado: Float = (num1-num2).toFloat()
        return resultado
    }
    public fun Multiplicar(num1: Int, num2: Int): Float{
        val resultado: Float = (num1*num2).toFloat()
        return resultado
    }
    public fun Dividir(num1: Int, num2: Int): Float{
        val resultado: Float = (num1/num2).toFloat()
        return resultado
    }
}