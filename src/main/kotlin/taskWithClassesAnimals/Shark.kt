package org.example.taskWithClassesAnimals

class Shark(swimSpeed: Int) : Fish(swimSpeed) {
    override fun swim() {
        println("I am a Shark, and i swimming")
    }
}