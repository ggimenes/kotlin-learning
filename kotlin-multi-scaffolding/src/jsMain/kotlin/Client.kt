import fundamentos.Carro
import kotlinx.browser.document
import react.create
import react.dom.client.createRoot

fun main() {
    var carro = Carro("Branco", 2021);

    println(carro.cor);






    val container = document.createElement("div")
    document.body!!.appendChild(container)

    val welcome = Welcome.create {
        name = "Kotlin/JS"
    }
    createRoot(container).render(welcome)
}