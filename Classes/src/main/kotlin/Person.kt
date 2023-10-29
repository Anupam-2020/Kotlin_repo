class Person(val firstName: String, val lastName: String, age: Int, qualification: String) {

    constructor(firstName: String, age: Int): this(firstName, "Anand", 26, "B.tech") {
        println("2nd")
    }

    constructor(firstName: String) : this(firstName, "Srid", 12, "M.tech") {
        println("3rd")
    }
}