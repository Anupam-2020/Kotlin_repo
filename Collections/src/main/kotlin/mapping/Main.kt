package mapping

fun main() {
    val numbers = setOf(1,2,3,4,5,2)
    println(numbers.mapIndexedNotNull { index, value ->
        if(index == 0) null else index * value
    }) // output -> [2,6,12,20]

    val modified = numbers.map {
        if(it == 3) it * 100 else it * 10
    }
    println(modified) // output -> [10,20,300,40,50]

    val numbersMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 4" to 4)
    println(numbersMap) // output -> {key 1=1, key 2=2, key 3=3, key 4=4}

    println(numbersMap.mapKeys {
        it.key.uppercase()
    }) // output -> {KEY 1=1, KEY 2=2, KEY 3=3, KEY 4=4}

    println(numbersMap.mapValues {
        it.value + it.key.length
    }) // output -> {key 1=6, key 2=7, key 3=8, key 4=9}
}