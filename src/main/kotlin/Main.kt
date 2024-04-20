package org.example

import org.example.taskWithClassesAnimals.*

fun main() {
    val shirhan = Tiger(15, 25)
    shirhan.run()
    shirhan.swim()
    println(shirhan.sumSpeed)

    val mufasa = Lion(15, 25)
    mufasa.run()
    mufasa.swim()
    println(mufasa.sumSpeed)

    val jaga = Jaguar(50, 25);
    jaga.run()
    jaga.swim()
    println(jaga.sumSpeed)

    val cat = Cat(12, 30)
    cat.run()
    cat.swim()
    println(cat.sumSpeed)

    val salmon = Salmon(10)
    salmon.swim()
    println(salmon.sumSpeed)

    val tuna = Tuna(5)
    tuna.swim()
    println(tuna.sumSpeed)

    val vova = Shark(40)
    vova.swim()
    println(vova.sumSpeed)

    val fish = Fish(30)
    fish.swim()
    println(fish.sumSpeed)
}