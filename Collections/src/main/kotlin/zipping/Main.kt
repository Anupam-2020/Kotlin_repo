package zipping

fun main() {
    val colors = listOf("red", "brown", "grey")
    val animals = listOf("fox", "bear", "wolf")
    println(colors.zip(animals)) // creates pairs -> [(red, fox), (brown, bear), (grey, wolf)]
    println(colors.zip(animals) { color, animal ->
        "The ${animal.replaceFirstChar { it.uppercase() }} is $color"
    }) // output -> [The Fox is red, The Bear is brown, The Wolf is grey]

    val numberPairs = listOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
    println(numberPairs) // output -> [(one, 1), (two, 2), (three, 3), (four, 4)]
    println(numberPairs.unzip()) // output -> ([one, two, three, four], [1, 2, 3, 4])
}