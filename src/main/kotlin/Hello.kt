fun main(args: Array<String>) {
    val temperature = 10
    val message = "The water temprature is ${if (temperature > 50) "too warm" else "ok"}"
    println(message)
}