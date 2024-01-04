fun main() {
    val botao = Button("Clique Aqui", "30", Pair(4, 5))
    botao.render()
}

abstract class Component {
    abstract fun position(): Pair<Int, Int>

    open fun render() {
        println("Posição: ${position().first} | ${position().second}")
    }
}

abstract class Text(val text: String) : Component() {
    override fun render() {
        super.render()
        println("Texto: $text")
    }
}

class Button(text: String, private val backgroundColor: String,
             private val pos: Pair<Int, Int>) : Text(text) {

    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("Cor: $backgroundColor")
    }
}