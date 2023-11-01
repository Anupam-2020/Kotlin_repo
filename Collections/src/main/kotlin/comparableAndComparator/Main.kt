package comparableAndComparator

data class Laptop(val brand: String, val year: Int, val ram: Int, val price: Int): Comparable<Laptop> {
    override fun compareTo(other: Laptop): Int {
        return if(this.price > other.price) {
            println("In if statement: Swapping ${this.brand} with ${other.brand}")
             1
        } else if(this.price < other.price) {
            println("In else if statement: Swapping ${this.brand} with ${other.brand}")
            -1
        } else {
            return 0
        }
    }
}

class ComparatorRam: Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if(o1.ram > o2.ram) {
            1
        } else if(o1.ram < o2.ram) {
            -1
        } else {
            0
        }
    }
}

class ComparatorYear: Comparator<Laptop> {
    override fun compare(o1: Laptop, o2: Laptop): Int {
        return if(o1.year > o2.year) {
            1
        } else if(o1.year < o2.year) {
            -1
        } else {
            0
        }
    }
}