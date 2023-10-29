class Person(val firstName: String, val lastName: String, age: Int = 10, qualification: String) {

    lateinit var address: String // Rerun type can't be any class which is primitive type...

    constructor(firstName: String, age: Int): this(firstName, "Anand", age, "B.tech") {
        println("2nd")
    }

    constructor(firstName: String) : this(firstName, "Srid", 12, "M.tech") {
        println("3rd")
    }

    var name = "${this.firstName} $lastName"
        get() { // getters and setters are implicitly created by class...
            return "Name : $field"
        }
        set(value) {
            println("$value assigned to name property")
            field = value
        }
}