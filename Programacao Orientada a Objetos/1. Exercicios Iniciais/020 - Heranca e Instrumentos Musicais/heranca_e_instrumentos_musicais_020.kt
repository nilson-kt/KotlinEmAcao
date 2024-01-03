fun main() {
    val violino = Violino("Violino")
    val violao = Violao("Violão")
    val flauta = Flauta("Flauta")
    val trombone = Trombone("Trombone")

    val michael = Musico("Michael")
    val maria = Musico("Maria")
    val joao = Musico("João")
    val rafaela = Musico("Rafaela")

    tocar(violino, michael)
    tocar(violao, maria)
    tocar(flauta, joao)
    tocar(trombone, rafaela)
}

fun tocar (instrumento: Instrumento, musico: Musico) {
    instrumento.tocar(musico)
}

abstract class Instrumento(private var nome: String) {

    abstract fun afinar(): Boolean

    fun tocar(musico: Musico) {
        if (afinar()) {
            val artigo = if (nome.endsWith("a")) "a" else "o"
            println("(${musico.nome} toca $artigo $nome)")
        } else {
            println("${musico.nome}, por favor, afine seu instrumento: $nome")
        }
        println("-".repeat(60))

    }
}

class Musico(var nome: String)

abstract class InstrumentoDeCorda(nome: String) : Instrumento(nome)

class Violao(nome: String) : InstrumentoDeCorda(nome) {

    override fun afinar(): Boolean {
        println("Afinando as cordas respectivamente MI LÁ RÉ SOL SI MI...")
        return true
    }
}

class Violino(nome: String) : InstrumentoDeCorda(nome) {

    override fun afinar(): Boolean {
        return false
    }

}

abstract class InstrumentoDeSopro(nome: String) : Instrumento(nome)

class Flauta(nome: String) : InstrumentoDeSopro(nome) {

    override fun afinar(): Boolean {
        println("Afinando por meio do ajuste das chaves e da embocadura...")
        return true
    }

}

class Trombone(nome: String) : InstrumentoDeSopro(nome) {

    override fun afinar(): Boolean {
        println("Afinando por meio do ajuste da posição da vara...")
        return true
    }
}