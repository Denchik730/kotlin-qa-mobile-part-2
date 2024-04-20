package org.example.taskWithClassesAnimals

class Tiger(runSpeed: Int, swimSpeed: Int) : Cat(runSpeed, swimSpeed) {
    override fun run() {
        println("I am a Tiger, and i running")
    }

    override fun swim() {
        println("I am a Tiger, and i swimming")
    }
}
