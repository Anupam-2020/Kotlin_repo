// Singleton is a design pattern where we don't want to create objects of the class. Eg -> Database-class

//class Database private constructor() {
//    companion object {
//        private var instance: Database? = null
//
//        fun getDatabase(): Database? {
//            if(instance == null) {
//                instance = Database()
//                println("Database created")
//            }
//            return instance
//        }
//    }
//}

object Database { // M-2 of creating singleton
    init {
        println("Database created")
    }
}