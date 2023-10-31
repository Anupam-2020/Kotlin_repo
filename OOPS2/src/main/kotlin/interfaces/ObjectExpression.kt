package interfaces

interface ClickListener {
    fun click()
}

class ButtonClass(val text: String, val id: Int, val onClickListener: ClickListener): ClickListener {
    override fun click() {
        println("$text clicked")
    }

}