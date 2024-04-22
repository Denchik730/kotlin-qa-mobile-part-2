package org.example.taskWithCalculator

fun main() {

    try{
        println(calculator(getOperationOnChar('+'), 2.0, 33.0))
        println(calculator(getOperationOnChar('-'), 2.0, 33.0))
        println(calculator(getOperationOnChar('*'), 2.0, 33.0))
        println(calculator(getOperationOnChar('/'), 15.0, 5.0))
        calculator(getOperationOnChar('='), 15.0, 5.0)
    } catch (e: UnsupportedOperationException) {
        println(e.printStackTrace())
    }

}

fun calculator(
    operation: (Double, Double) -> Double,
    leftOperand: Double,
    rightOperand: Double,
): Double {
    return operation(leftOperand, rightOperand)
}

val plus: (Double, Double) -> Double = { a, b -> a + b }
val minus: (Double, Double) -> Double = { a, b -> a - b }
val multiplication: (Double, Double) -> Double = { a, b -> a * b }
val division: (Double, Double) -> Double = { a, b -> a / b }

val getOperationOnChar: (Char) -> (Double, Double) -> Double = {symbolOperation ->
    when(symbolOperation) {
        '+' -> plus
        '-' -> minus
        '*' -> multiplication
        '/' -> division
        else -> throw UnsupportedOperationException()
    }
}