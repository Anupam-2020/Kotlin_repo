package `1_basics`

fun foo(str: Int): String { // return type should be provided...
    return "Hello $str World"
}

fun getMaxMinOFIntTypes(): String {
    var maxInteger: Int = Int.MAX_VALUE // 2147483647 ( space -> 32 bits)
    var minInteger: Int = Int.MIN_VALUE // -214748364

    val maxByte: Byte = Byte.MAX_VALUE // 127 (space -> 8 bits)
    val minByte: Byte = Byte.MIN_VALUE // -128

    val maxShort: Short = Short.MAX_VALUE // 32767 (space -> 16 bits)
    val minShort: Short = Short.MIN_VALUE // -32768

    val maxLong: Long = Long.MAX_VALUE // 9223372036854775807 (space -> 64 bits)
    val minLong: Long = Long.MIN_VALUE // -9223372036854775808

    // Int to Long conversion.
    val value = 23L

    return "maxInt -> $maxInteger / minInt -> $minInteger" +
            " maxByte -> $maxByte / minByte -> $minByte " +
            " maxShort -> $maxShort / minShort -> $minShort"+
            " maxLong -> $maxLong / minLong -> $minLong"
}

fun getFloat() {
    // By default, decimal numbers are double.
    // We can convert double to float by adding `f` in suffix.

    val decimalValue = 2.3f
}

fun getChar() {
    var myCharValue: Char = 'a'
    println(myCharValue)
}

fun getBoolean() {
    val bool = false
}

fun main() {
    val str: Int = 24 // val declared variables can't be changed...

    var str2: Int? = null
    println(foo(str))

    println(getMaxMinOFIntTypes())

    getFloat()

    getChar()

    getBoolean()
}