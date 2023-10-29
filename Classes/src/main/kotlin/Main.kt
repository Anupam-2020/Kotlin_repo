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
//    user1.address = "Patna"
//    println(user1.address)

    // companion object
//    println(Calculator.sum(23,45))
//    val calc = Calculator()
//    println(calc.multiply(2,4))

    // Singleton example
//    val instance = Database
//    println(instance)

    // Lazy...
//    val emp1 = Employee("1234", 4, "Associate")
//    val emp2 by lazy { // when we create object by lazy, object gets instantiated only when it used
//        Employee("1643", 1, "Associate")
//    }
//    println(emp2.empId)


    // ENUM Classes
//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.getDirection())
//
//    for(direction in Direction.entries) {
//        println(direction.name)
//    }
//
//    val direction = Direction.valueOf("west".uppercase())
//
//    when(direction) {
//        Direction.WEST -> Direction.WEST.getDirection()
//        Direction.NORTH -> Direction.NORTH.getDirection()
//        Direction.EAST -> Direction.EAST.getDirection()
//        Direction.SOUTH -> direction.getDirection()
//    }

    // Inner Class
//    val listView = ListView(arrayOf("Name 1", "Name 2", "Name 3", "Name 4"))
//    listView.ListViewItems().displayItem(2)

    // OOPS Challenge
//    val accountHolder1 = BankAccount("Anupam")
//    accountHolder1.deposit(10000)
//    accountHolder1.withdraw(2000)
//    accountHolder1.withdraw(10000)
//
//    for (transaction in accountHolder1.transaction) {
//        print("$transaction ")
//    }
//    print("\n")
//    println(accountHolder1.getBalance())
}