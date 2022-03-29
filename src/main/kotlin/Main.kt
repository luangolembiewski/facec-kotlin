import br.edu.facec.kotlin.functions.Functions

fun main(args: Array<String>): Functions {

    println("Informe o primeiro numero")
    val num1: Int =  readLine()!!.toInt()

    println("Informe o segundo numero")
    val num2: Int =  readLine()!!.toInt()

    println((num1,num2))
}