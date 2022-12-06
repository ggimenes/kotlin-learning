package fundamentos

fun main() {
    println(sayHi("Gabriel"))
    println(sayHi(name = "Gabriel", age = 23))
}

fun returnName(): String {
    return "Gustavo"
}

fun sayHi(name: String, age: Int = 20, x: Any? = null) {
    println("Hi ${name}, age ${age}")

    for (numero in 1 .. 10){

    }

    if(x == null)
        println("x is null")

    val x = 4
    when(x){
        5 -> println()
        in 11..15 -> println("11 a 15")
        else -> println("2")
    }


}

