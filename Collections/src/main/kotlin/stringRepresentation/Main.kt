package stringRepresentation

fun main() {
    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings) // output -> [one, two, three, four]
    println(numbersStrings.joinToString()) // output -> one, two, three, four

    val listString = StringBuffer("The list of numbers: ")
    println(numbersStrings.joinTo(listString)) // output -> The list of numbers: one, two, three, four

    println(numbersStrings.joinToString(" | ", prefix = "start: ", ": end")) // output -> start: one | two | three | four: end

    val numbers = (1..100).toList().joinToString(limit = 15, truncated = "<...>")
    println(numbers)

    println(numbersStrings.joinToString { "Element: ${it.uppercase()}"}) // output -> Element: ONE, Element: TWO, Element: THREE, Element: FOUR
}