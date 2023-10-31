data class User(var firstName: String, var lastName: String, var age: Int)
// below class(User) represents what happens behind the scene of data class...


// All the classes inherit from Any.

//class User(var firstName: String, var lastName: String, var age: Int): Any() {
//    override fun equals(other: Any?): Boolean {
//        if(this === other) {
//            return true
//        }
//
//        if(other is User) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//        }
//
//        return false
//    }
//
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
////        return super.hashCode().toString()
//        return "User(firstName=$firstName, lastName=$lastName, age=$age)"
//    }
//}

