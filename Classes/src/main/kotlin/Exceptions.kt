fun main() {

    val a = 2
    val b = 0

    try {
        val c= a / b
        println(c)
    } catch (err: Throwable) {
        println("Error occurred: ${err.message}")
    } finally {
        println("Resolved Error")
    }


}