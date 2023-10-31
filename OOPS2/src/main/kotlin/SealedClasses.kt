import java.lang.Exception

// sealed classes -> overcomes the limitations of enum class...

fun getResult(result: Result) {
    when(result) {
        is Result.Success -> result.printMessage()
//        is Result.Error -> result.printMessage()
        is Result.Error.RecoverableError -> result.printMessage()
        is Result.Error.NonRecoverableError -> result.printMessage()
        is Result.Progress -> result.printMessage()
    }
}

sealed class Result(private val message: String) {
    fun printMessage() {
        println("Result: ${this.message}")
    }

    class Success(message: String): Result(message)
    sealed class Error(message: String): Result(message) {
        class RecoverableError( exception: String, message: String): Error(message)
        class NonRecoverableError(exception: String, message: String): Error(message)
    }
    class Progress(message: String): Result(message)
}
