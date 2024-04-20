package org.example.taskWithClassesAnimals

class Jaguar(runSpeed: Int, swimSpeed: Int) : Cat(runSpeed, swimSpeed) {
    override fun run() {
        println("I am a Jaguar, and i running")
    }

    override fun swim() {
        println("I am a Jaguar, and i swimming")
    }
}