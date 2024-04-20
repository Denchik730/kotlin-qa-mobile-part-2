package org.example.taskWithClassesAnimals

class Lion(runSpeed: Int, swimSpeed: Int) : Cat(runSpeed, swimSpeed) {
    override fun run() {
        println("I am a Lion, and i running")
    }

    override fun swim() {
        println("I am a Lion, and i swimming")
    }
}