
    class Car(name: String, model: String, var color: String, var door: Int) {
        private var model = model
        var names = name
        var lastName: String

        init { // initializer gets called on every object creation.
            if(name.lowercase().startsWith('a')) {
                lastName = name
            } else {
                lastName = "Car"
                println("Car doesn't start with A or a")
            }
        }

        fun move() {
            println("This car $names is moving and is of ${this.model} model modal with $door doors and $color color")
        }
    }
