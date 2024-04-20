package org.example.taskWithClassesAnimals

class Salmon(swimSpeed: Int) : Fish(swimSpeed) {
    override fun swim() {
        println("I am a Salmon, and i swimming")
    }
}