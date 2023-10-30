import java.util.ArrayList
import kotlin.Array as Array

fun main(args: Array<String>) {
    val car = Car("BMW", "BLUE", 4, 3, "2")
    println(car.doors)
    car.move()
    println(car.door)
}