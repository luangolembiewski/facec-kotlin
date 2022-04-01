import br.edu.facec.kotlin.functions.Functions

fun main(args: Array<String>) {

    println("Informe o primeiro numero:")
    val num1: Int =  readLine()!!.toInt()


    println("Informe o segundo numero:")
    val num2: Int =  readLine()!!.toInt()

    val func = Functions();
    println("Soma: " + func.Somar(num1, num2))
    println("Subtação: " + func.Subtrair(num1, num2))
    println("Multiplicação: " + func.Multiplicar(num1, num2))
    println("Divisão: " + func.Dividir(num1, num2))
}