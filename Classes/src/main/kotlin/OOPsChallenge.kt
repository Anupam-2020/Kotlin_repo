class BankAccount(val accountName: String) {
    private var balance: Int = 0
    var transaction = mutableListOf<Int>()

    fun deposit(money: Int) {
        this.balance += money
        transaction()
    }

    fun withdraw(money: Int) {
        if(money > this.balance) {
            println("Low Balance")
        } else {
            this.balance -= money
            transaction()
        }
    }

    private fun transaction() {
        transaction.add(balance)
    }

    fun getBalance(): Int {
        return balance
    }
}