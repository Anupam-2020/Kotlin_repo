package flatten

fun main() {
    val numberArray = listOf(arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(7,8,9))
    println(numberArray[2][2])

    for (sets in numberArray) {
        for (number in sets) {
            print("$number ")
        }
        print("\n")
    }

    val numberSets = setOf(setOf(1,2,3), setOf(9,5,6), setOf(7,8,9))

    val numberFlatten = numberSets.flatten()
    println(numberFlatten)
}