package `2_functions`

fun sayHello(value: String) { // By default params are `val`.
    return;
}

fun getMax(value1: Int, value2: Int): Int {
    return if(value1 > value2) value1 else value2
}

// function overloading...
fun getMax(a: Int, b: Int, c: Int): Int {
    return if(a > b && a > c) a else if(b > a && b > c) b else c
}

fun getMax(a: Double, b: Int): Double {
    return a + b
}

// function expression -> curley braces/ return keyword and return-type is removed.
fun getMax2(value1: Int, value2: Int) = if(value1 > value2) value1 else value2

// default params...
fun sendMessage(name: String, message: String = ""): String {
    return "name = $name and message = $message"
}

fun sendFunAsArgValue() = "Some message"

fun addUsingVarargs(vararg numbers: Int): Int {
    var sum = 0;
    numbers.forEach{ sum += it}
    return sum
}

fun main(args: Array<String>) {
    println(getMax(23,34))
    println(getMax2(100, 200))
    println(getMax(2,3, 7))
    println(getMax(32.0, 21))
    println(sendMessage("Anupam", "Hi"))
    println(sendMessage(message = "Hello", name = "Anurag")) // named parameters
    println(sendMessage(message = sendFunAsArgValue(), name = "Anupam")) // function returned as value of arg.
    println(addUsingVarargs(1,2,3,4,5,6,7,8,9,10)) // varargs
}

// Note:- Unit represents void type in kotlin.