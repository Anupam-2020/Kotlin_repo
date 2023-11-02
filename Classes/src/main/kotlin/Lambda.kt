fun main() {
    val loginButton = Button("Sign Up", 123) {
        println("Hello Lambda")
    }
//    println(myAdd(2,3))

    add(2,3) { a: Int, b: Int -> a * b }

//    upperCase("hello") { s: String -> s.uppercase() }
    upperCase("hello World") {it.uppercase()} // for single variable we can use `it` as well.
}

val myAdd: (Int, Int) -> Int = { a: Int, b: Int -> a + b }

fun add(a: Int, b: Int, action: (Int, Int) -> Int) {
    println(a + b)
    println(action(a, b))
}

fun upperCase(str: String, myFunc: (String) -> String) {
    val uppercaseWord = myFunc(str)
    println(uppercaseWord)
}

class Button(val text: String, val id: Int, val onClickListener: () -> Unit)