package org.example.taskCheckInputAnyObject

import java.time.LocalDate

fun main() {
    checkInputAnyObject("Молоко")
    checkInputAnyObject("Привет, Андрей, ну где ты был, ну обними меня скорей!")
    checkInputAnyObject(3)
    checkInputAnyObject(3.335)
    checkInputAnyObject(2.356)
    checkInputAnyObject(3.1)
    checkInputAnyObject(LocalDate.now())
    checkInputAnyObject(LocalDate.parse("2005-12-12"))
    checkInputAnyObject(null)
    checkInputAnyObject('f')
}

fun checkInputAnyObject(obj: Any?) {
    when(obj) {
        is String -> println("Я получил тип String = ‘$obj’, ее длина равна ${obj.length} символ${if (obj.length % 10 == 1 && obj.length % 100 != 11) "" else "ов"}")
        is Int -> println("Я получил Int = $obj, его квадрат равен ${obj * obj}")
        is Double -> println("Я получил Double = $obj, это число округляется до ${String.format("%.2f", obj).replace(',', '.')}")
        is LocalDate -> println("Я получил LocalData = $obj, эта дата ${if (obj < LocalDate.of(2006, 12, 24 )) "меньше" else "больше"} чем дата основания Tinkoff")
        null -> println("Объект равен null")
        else -> println("Мне этот тип неизвестен(")
    }
}