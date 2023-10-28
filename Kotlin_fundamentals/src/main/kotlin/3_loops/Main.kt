package `3_loops`

fun main() {
//    for(i in 1..10) {
//        println("i $i")
//    }

//    for(i in 1 until 10) {
//        println("i = $i")
//    }

//    for(i in 10 downTo 1) {
//        println(i)
//    }

//    for(i in 1 until 10 step 2) {
//        println(i)
//    }

//    var number = 10;
//    while (number > 0) {
//        number--
//        if(number == 7) continue
//        print("$number ")
//    }

    // outer and inner loop.
    var value = 0
   outerWhile@ while (value < 10) {
        value++
        println(value)

        var i = 0
        while (i < 5) {
            i++
            if(i == 2) break@outerWhile
            println(i)
        }
    }
}