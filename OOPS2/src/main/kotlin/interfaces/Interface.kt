package interfaces
// Interfaces are like abstract class but more strict...
// Interfaces don't have function implementations. They only contain function name.

interface Engine {
    fun startEngine()
}

class Car(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("Car starts")
    }
}

class Truck(val name: String, val color: String): Engine {
    override fun startEngine() {
        println("Truck starts")
    }
}

class Plane(val name: String, val  color: String): Engine {
    override fun startEngine() {
        println("Plane starts")
    }
}