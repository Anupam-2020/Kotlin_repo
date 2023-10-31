abstract class Bank {
    abstract fun account()
    abstract fun balance()
}

class Customer(private var name: String, var amount: Int): Bank() {
    override fun account() {
        println("Account Holder name $name")
    }

    override fun balance() {
       println("Account balance $amount")
    }

}