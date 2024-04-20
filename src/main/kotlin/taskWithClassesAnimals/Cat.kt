package org.example.taskWithClassesAnimals

open class Cat(override val runSpeed: Int, override val swimSpeed: Int) : Pet(), Runnable, Swimmable {
    override val sumSpeed = runSpeed + swimSpeed

    override fun run() {
        println("I am a Cat, and i running")
    }

    override fun swim() {
        println("I am a Cat, and i swimming")
    }
}
