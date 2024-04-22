package org.example.taskUpdateList

fun main() {
    val listExample = listOf(13.31, 3.98, 12.0, 2.99, 9.0)
    val listExample2 = listOf(133.21, null, 233.98, null, 26.99, 5.0, 7.0, 9.0)

    println(String.format("%.2f", updateList(listExample)).replace(',', '.'))
    println(String.format("%.2f", updateList(listExample2)).replace(',', '.'))
}

fun updateList(listWithDoubleNumbers: List<Double?>): Double {
    return listWithDoubleNumbers
        .asSequence()
        .filterNotNull()
        .map {
            if ((it.toInt() % 2) == 0) {
                it * it
            } else {
                it / 2
            }
        }
        .filter {
            it <= 25.0
        }
        .sortedDescending()
        .take(10)
        .sum()
}