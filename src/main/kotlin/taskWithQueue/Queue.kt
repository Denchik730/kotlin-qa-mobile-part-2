package org.example.taskWithQueue

import org.example.taskWithClassesAnimals.*

class Queue<T> where T: Pet, T: Swimmable {
    val queue = ArrayDeque<T>()

    fun engueue(element: T) {
        queue.addLast(element)
    }

    fun dequeue(): T? {
        return queue.removeFirstOrNull()
    }
}

fun main() {
    val shirhan = Tiger(15, 25)

    val mufasa = Lion(15, 25)

    val jaga = Jaguar(50, 25);

    val cat = Cat(12, 30)

    val salmon = Salmon(10)

    val tuna = Tuna(5)

    val vova = Shark(40)

    val fish = Fish(30)

    val catQueue = Queue<Cat>()

    catQueue.engueue(mufasa)
    catQueue.engueue(jaga)
    catQueue.engueue(cat)
    catQueue.engueue(shirhan)

    println(catQueue.queue)
    println(catQueue.dequeue())

    val fishQueue = Queue<Fish>()

    fishQueue.engueue(salmon)
    fishQueue.engueue(tuna)
    fishQueue.engueue(vova)
    fishQueue.engueue(vova)
    fishQueue.engueue(fish)

    println(fishQueue.queue)
    println(fishQueue.dequeue())
}