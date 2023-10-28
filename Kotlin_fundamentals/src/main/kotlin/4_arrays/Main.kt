package `4_arrays`

fun main(args: Array<String>) {
//    val names = arrayOf("Anupam", "Anand")
//    val number = arrayOf(2,3,"Anand", arrayOf(5, 9, false), true)
//    for(i in number) {
//        print("$i ")
//        if (i is Array<*>) {
//            i.forEach {
//                print("$it ")
//            }
//        }
//    }

    val numbers = arrayOf(1,2,3,4,5,6,7)
    val arr = getLargestAndSmallest(numbers)
    arr.forEach {
        print("$it ")
    }

    println()
    print(getSmallestOrLargest(numbers, "Smallest"))
}