import kotlin.random.Random

fun main() {
    val gustavo = Pessoa("Gustavo")
    gustavo.menu = getMenu()
    gustavo.comprarUmLanche()

}

fun getMenu(): Menu {
    val numeroAleatorio = Random.nextInt(1, 3)
    return when (numeroAleatorio) {
        1 -> LanchoneteDelicia()
        else -> SaboresLanches()
    }
}

class Pessoa(private var nome: String) {
    lateinit var menu: Menu

    fun comprarUmLanche() {
        val lanche = menu.lanches()
        println("$nome comprou uma $lanche!")
    }
}

interface Menu {
    fun lanches(): String
}

class LanchoneteDelicia: Menu {

    override fun lanches(): String {
        return "coxinha"
    }
}

class SaboresLanches: Menu {

    override fun lanches(): String {
        return "esfirra"
    }

}