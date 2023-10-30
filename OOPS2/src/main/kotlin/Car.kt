open class Vehicle(val name: String, val color: String, door: String) {

    open fun move() {
        println("$name is moving")
    }

    open fun stop() {
        println("$name has stopped")
    }
}

class Car(name: String, color: String, val engines: Int, val doors: Int, val door: String): Vehicle(name, color, door) {
    override fun move() {
        super.move()
        println("${this.name} has ${this.door} doors")
    }
    override fun stop() {
        super.stop()
    }
}

class Plane(name: String, color: String, val engines: Int, val doors: Int, door: String) : Vehicle(name, color, door) {

}