package interfaces

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

// with the help of delegation we can use multiple inheritance...
class App: A by FirstDelegate(), B by SecondDelegate() {
    override fun print() {

    }

    override fun print2() {

    }
}

interface A {
    fun print()
}

interface B {
    fun print2()
}

open class FirstDelegate: A {
    override fun print() {

    }
}

open class SecondDelegate: B {
    override fun print2() {

    }
}

// Method delegation....
class User{
    var firstName by FormatDelegate() // use the code which is inside the `FormateDelegate` whenever we have to set or get the value of 1st name.
    var lastName by FormatDelegate()
}

class FormatDelegate: ReadWriteProperty<Any?, String> {
    private var formattedString: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return formattedString
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        formattedString = value.uppercase()
    }
}