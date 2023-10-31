import interfaces.ButtonClass
import interfaces.Car
import interfaces.ClickListener
import interfaces.Plane
import interfaces.User

fun main(args: Array<String>) {
    // Inheritance...........................................
//    val car = Car("BMW", "BLUE", 4, 3, "2")
//    println(car.doors)
//    car.move()
//    println(car.door)

    // Inheritance 2...........................................
//    val view = View()
//    val button = Button("Login", "Center")
//    val roundButton = RoundButton("Sign Up", "Center", 10)
//    view.draw()
//    button.draw()
//    roundButton.draw()

    // Sealed Class...........................................
//    val success = Result.Success("Success")
////    val error = Result.Error.RecoverableError("Reachable Code Error", "Reachable Error")
//    val error = Result.Error.RecoverableError("Error occurred", "Recoverable Error")
//    val progress = Result.Progress("Progress")
//    getResult(error)
//    error.printMessage()

    // Abstract Class......................................
//    val bank = Customer("Anupam", 23000)
//    bank.account()

    // data class...........................................
    // == vs ===
    // == -> structural equal(checks value)
    // === -> referential equal(checks reference/type and value)
//    val user1 = User("Anupam", "Anand", 27)
//    val user2 = User("Anupam", "Anand", 27)
//    println(user2 == user1) // true
//    println(user2 === user1) // false
//    println(user2)

    // Interfaces
//    val car = Plane("Tata", "Black")
//    car.startEngine()

    // Object Expression.....................................
//    val button = ButtonClass("Sign In", 1234, object : ClickListener {
//        override fun click() {
//            println("Sign In Clicked")
//        }
//    })
//    button.click()

    // delegation on properties.....................................
//    val user = User()
//    with(user) {
//        this.firstName = "Anupam"
//        this.lastName = "Anand"
//    }
//
//    with(user) {
//        println(firstName)
//        println(lastName)
//    }
}