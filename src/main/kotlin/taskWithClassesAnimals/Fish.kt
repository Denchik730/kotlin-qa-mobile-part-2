package org.example.taskWithClassesAnimals

open class Fish(override val swimSpeed: Int) : Pet(), Swimmable {
    override val sumSpeed = swimSpeed

    override fun swim() {
        println("I am a Fish, and i swimming")
    }
}