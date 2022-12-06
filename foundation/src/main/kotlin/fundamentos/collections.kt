package fundamentos

fun main() {
    var lst = listOf(1, 2, 3, 4, 5, 6)
    var pares = lst.filter { it % 2 == 0 }
    println(pares)

//    lst.forEach()
//    lst.firstOrNull()

    for(x in lst)
        println(x)

    var lst2 = mutableListOf(1, 2, 3, 4, 5, 6)

    lst2.add(4)

//    lst2.sortBy {  }

    var dic = mutableMapOf("abc" to 123, "def" to 456)
}