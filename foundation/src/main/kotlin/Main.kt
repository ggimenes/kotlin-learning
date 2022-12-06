import fundamentos.Carro

fun main(args: Array<String>) {
    var carro = Carro("Branco", 2021)
    println(carro.cor)

    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}