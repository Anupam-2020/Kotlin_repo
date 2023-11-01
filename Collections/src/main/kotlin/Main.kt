fun main() {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3) // output -> [three, four]

    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
    val filteredMap = numberMap.filter{
        index -> index.key.endsWith("1") && index.value > 100}
    println(filteredMap) // output -> {key 101=101}

    val filteredIndex = numbers.filterIndexed { index, value -> index != 0 && index < 5 }
    println(filteredIndex) // output -> [two, three, four]

    val filteredNot = numbers.filterNot { it.length > 3 }
    println(filteredNot)

    val mixedList = listOf(1,2,3,"A","B","C","Hello World","Alex",false)
    mixedList.filterIsInstance<String>().forEach {
        value -> println(value)
    }

    val (match, rest) = numbers.partition { it -> it.length > 3 }
    println("$match $rest")

    
}