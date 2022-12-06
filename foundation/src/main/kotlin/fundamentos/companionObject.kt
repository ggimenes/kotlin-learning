package fundamentos

// Just like static methods

class Class1(
    name: String,
    age: Int
) {
    companion object {
        fun CreateWithDefaultValues(): Class1 {
            return Class1("abc", 21)
        }
    }
}

class Class2(
    name: String,
    age: Int
) {
    fun CreateWithDefaultValues(): Class1 {
        return Class1("abc", 21)
    }
}

fun main() {
    Class1.CreateWithDefaultValues()
    Class2("name", 10).CreateWithDefaultValues()
}