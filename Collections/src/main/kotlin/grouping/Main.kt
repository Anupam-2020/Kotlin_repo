package grouping

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.groupBy { it.first().uppercase() }) // output -> {O=[one], T=[two, three], F=[four]}
    println(numbers.groupBy(keySelector = {it.first()}, valueTransform = {it.uppercase()})) // output -> {o=[ONE], t=[TWO, THREE], f=[FOUR]}
}