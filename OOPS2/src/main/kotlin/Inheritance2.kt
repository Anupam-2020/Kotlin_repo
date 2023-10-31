open class View() {
    open fun draw() {
        println("Drawing the view.")
    }
}

open class Button(val text: String, val orientation: String): View() {
    override fun draw() {
        println("Drawing button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation) {
    override fun draw() {
        println("Drawing a round button")
        super.draw()
    }
}