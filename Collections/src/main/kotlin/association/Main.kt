package association

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { // Here key will be `list elements` and value will be `it.length`
        it.length
    }) // output -> {one=3, two=3, three=5, four=4}

    println(numbers.associateBy { // Here key will be `it.uppercase()` and value will be `list elements`
        it.uppercase()
    }) // output -> {ONE=one, TWO=two, THREE=three, FOUR=four}

    println(numbers.associateBy({ it.uppercase()}, { it.length}))
}