package searching

fun main() {
//    println(searchElement(3, mutableListOf(1,2,6,5,2,8,3)))
    println(binarySearch(31, mutableListOf(1,2,6,7,8,9,31)))
}

private fun binarySearch(searchedElement: Int, numbers: MutableList<Int>):Int {
    var i = 0
    var start = 0
    var end = numbers.size - 1
    while(start <= end) {
        val mid = end - (end - start )/ 2
        println("Searched number: ${i++}")
        if(numbers[mid] > searchedElement) end = mid -1
        else if(numbers[mid] < searchedElement) start = mid + 1
        else return mid
    }

    return -1
}

private fun searchElement(searchedElement: Int, numbers: MutableList<Int>): Int {
    var i = 0
    for(number in numbers) {
        println("Searched number: ${i++}")
        if(number == searchedElement) {
            return 1
        }
    }
    return -1
}