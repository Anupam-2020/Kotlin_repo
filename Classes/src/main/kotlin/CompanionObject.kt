class Calculator() {
    companion object { // We can call methods/variables inside companion object without creating object...
        // These variables/ methods are also called class components...
        fun sum(a: Int, b: Int): Int {
            return a + b
        }
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}