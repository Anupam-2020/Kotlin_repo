fun main() {

//    val numbers = listOf("one", "two", "three", "four")
//    val longerThan3 = numbers.filter { it.length > 3 }
//    println(longerThan3) // output -> [three, four]
//
//    val numberMap = mapOf("key 1" to 1, "key 2" to 2, "key 3" to 3, "key 101" to 101)
//    val filteredMap = numberMap.filter{
//        index -> index.key.endsWith("1") && index.value > 100}
//    println(filteredMap) // output -> {key 101=101}
//
//    val filteredIndex = numbers.filterIndexed { index, value -> index != 0 && index < 5 }
//    println(filteredIndex) // output -> [two, three, four]
//
//    val filteredNot = numbers.filterNot { it.length > 3 }
//    println(filteredNot)
//
//    val mixedList = listOf(1,2,3,"A","B","C","Hello World","Alex",false)
//    mixedList.filterIsInstance<String>().forEach {
//        value -> println(value)
//    }

    // Partition......................................................................
//    val (match, rest) = numbers.partition { it -> it.length > 3 }
//    println("$match $rest")

    // Test preifacts - any(), none(), all()........................................................
//    println(numbers.any({it.endsWith("e")}))
//    println(numbers.none{it.endsWith("w")})
//    println(numbers.all{it.length > 1})

    // Plus minus operator......................................................................
    val number = mutableListOf("One", "Two", "Three", "Four")
    val plusList = number + "Five"
    val minus = number - mutableListOf("Three", "Four")
//    println(plusList)
//    println(minus)

    // comparable and comparator......................................................................
//    val nums = mutableListOf(2,6,1,3,9,7,55,22)
    // here the list is of type Int. Int is a class which inherits comparable class and overrides a method -> compareTo which has logic to sort the list...
//    nums.sorted().forEach {
//        print("$it ")
//    }

    val laptops = mutableListOf(
        Laptop("Dell", 2021, 8, 50_000),
        Laptop("Lenovo", 2022, 16, 80_000),
        Laptop("Apple", 2021, 8, 90_000)
    )

//    laptops.sorted().forEach { println("$it") }
//
//    println("\n")
//
//    laptops.sortedWith(ComparatorRam()).forEach { println("$it ") } // Method -1
//
//    println("\n")
//
//    laptops.sortedWith(ComparatorYear()).forEach { println("$it") } // Method -2

//    laptops.sortedWith(compareBy{it.price}).forEach { println(it) } // Method -2

//    laptops.sortedBy { it.price }.forEach { println(it) } // Method -3

//    laptops.sortedWith(compareBy<Laptop>{ it.year }.thenBy { it.price }).forEach { println(it) } // We can sort using various chained checks...
}

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int)

