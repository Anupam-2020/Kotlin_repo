package `1_basics`

fun basicIfElse() {
    val age: String? = readlnOrNull();
    val ageToInt = age?.toInt()
    if (ageToInt != null) {
        if(ageToInt > 24) {
            println("Over aged")
        } else if(ageToInt == 24) {
            println("Perfect age")
        } else {
            println("Under aged")
        }
    }
}

fun whenStatement() {
    val age: String? = readlnOrNull()
    val ageToInt: Int? = age?.toInt();
    if (ageToInt != null) {
        when {
            ageToInt > 18 -> println("Over aged")
            ageToInt in 14..18 -> println("Exact age")
            ageToInt == 13 || ageToInt == 12 -> println("Perfect")
            else -> println("Under ages")
        }
    }
}

fun whenStatement2() {
    val value = readln().toInt()
    val res = when(value) {
        in 1..4 -> {
            "The result is smaller"
        }
        5,6,7 -> {
            "The value is perfect"
        }
        else -> {
            "The result is larger"
        }
    }

    // ternary operator...
    val res2 = if(value == 2) "Less" else if(value in 3..5) "Equal" else "More"
    println(res2)
}

fun elvisOperator(): String {
    //
    var test: String? = null
//    test = "Hello World"
//    return test ?: "Value is null" // if `test` is null -> returns right-side else returns left-side value.

    // Behind the scene of above elvis operation...
    return if (test == null) {
        "Value is null"
    } else {
        test
    }
}


fun main() {
//    basicIfElse()
//    whenStatement()
//    whenStatement2()
    println(elvisOperator())
}