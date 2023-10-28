package `4_arrays`

fun findLargest(arr: Array<Int>, size: Int): Int {
    var largest = Int.MIN_VALUE
    for(i in arr) {
        if(largest < i) largest = i
    }
    return  largest
}

fun findSmallest(arr: Array<Int>, size: Int): Int {
    var smallest = Int.MAX_VALUE
    for(i in arr) {
        if(smallest > i) smallest = i
    }
    return  smallest
}

fun getLargestAndSmallest(arr: Array<Int>): Array<Int> {
    val largest = findLargest(arr, arr.size)
    val smallest = findSmallest(arr, arr.size)

    return arrayOf(largest, smallest)
}

fun getSmallestOrLargest(arr: Array<Int>, input: String): Int {

    if(input == "Largest") {
        return findLargest(arr, arr.size)
    } else if(input == "Smallest"){
        return findSmallest(arr, arr.size)
    }
    return 0
}