enum class Direction(val direction: String, val distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 15),
    EAST("east", 15),
    WEST("west", 10);

    fun getDirection() {
        println("$direction $distance")
    }
}