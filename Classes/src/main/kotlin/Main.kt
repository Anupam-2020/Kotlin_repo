fun main() {
//    val car1 = Car("BMW", "X7", "Blue", 4)
//    car1.names = "BMWS"
//    car1.modal = "X7"
//    car1.color = "Blue"
//    car1.door = 4
//    println(car1.names)
//    car1.move()

//    val user1 = Person("Anupam", "Anand", 27, "CA")
//    println(user1.firstName)
//    val user2 = Person("Anupam")
//    println(user2.lastName)
//    val user3 = Person("Anand", 28)
//
//    // getters and setters for Person Class
//    user1.name = "${user1.firstName} ${user1.lastName}" // setter will be called here
//    println(user1.name) // getter will be called here
//
//    user1.address = "Patna"
//    println(user1.address)

//    println(Calculator.sum(23,45))
//    val calc = Calculator()
//    println(calc.multiply(2,4))

//    val instance = Database
//    println(instance)

    val emp1 = Employee("1234", 4, "Associate")
    val emp2 by lazy { // when we create object by lazy, object gets instantiated only when it used
        Employee("1643", 1, "Associate")
    }
    println(emp2.empId)
}