fun main() {
    val user = User()

    // without scope function...
    user.firstName = "Anupam"
    user.lastName = "Anand"
    user.age = 37

    // when -> returns last value.
    val res = with(user) {
        firstName
        lastName
        age
    }

    // let -> returns last value
    val res2 = user.let {
        it.firstName = "Anupam"
        it.lastName = "Anand"
        it.age = 27
        it.age
    }

    // apply -> returns context
    val res3 = user.apply {
        firstName = "Anupam"
        lastName = "Anand"
        age = 20
        age
    }

    // also -> returns context
    val res4 = user.also {
        it.firstName = "Anupam"
        it.lastName = "Anand"
        it.age = 27
        it.age
    }

    // run -> return last value
    // run is combination of with and let...
    val res5 = user.run {
        firstName = "Anupam"
        lastName = "Anand"
        age = 20
        age
    }

    println("Let: -> $res2") // Let: -> 27
    println("with: -> $res") // with: -> 28
    println("apply: -> $res3") // apply: -> User@312b1dae
    println("also: -> $res4") // also: -> User@312b1dae
    println("run: -> $res5") // run: -> 20
}

class User() {
    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0
}