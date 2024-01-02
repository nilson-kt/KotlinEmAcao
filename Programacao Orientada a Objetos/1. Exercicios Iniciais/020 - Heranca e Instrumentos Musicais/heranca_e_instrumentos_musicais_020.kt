fun main() {
    val violino = Violino("Violino")
    val violao = Violao("Violão")
    val flauta = Flauta("Flauta")
    val trombone = Trombone("Trombone")

    violino.afinar()
    violino.tocar()
    println("-".repeat(40))

    violao.afinar()
    violao.tocar()
    println("-".repeat(40))

    flauta.afinar()
    flauta.tocar()
    println("-".repeat(40))

    trombone.afinar()
    trombone.tocar()
}

abstract class Instrumento(var nome: String) {

    abstract fun afinar()

    fun tocar() {
        val artigo = if (nome.endsWith("a")) "a" else "o"
        println("(Tocando $artigo $nome)...")
    }
}

abstract class InstrumentoDeCorda(nome: String) : Instrumento(nome)

class Violao(nome: String) : InstrumentoDeCorda(nome) {

    override fun afinar() {
        println("Afinar as cordas respectivamente MI LÁ RÉ SOL SI MI.")
    }
}

class Violino(nome: String) : InstrumentoDeCorda(nome) {

    override fun afinar() {
        println("Afinar as cordas respectivamente SOL RÉ LÁ MI.")
    }

}

abstract class InstrumentoDeSopro(nome: String) : Instrumento(nome)

class Flauta(nome: String) : InstrumentoDeSopro(nome) {

    override fun afinar() {
        println("Afinar ajustando as chaves e a embocadura.")
    }

}

class Trombone(nome: String) : InstrumentoDeSopro(nome) {

    override fun afinar() {
        println("Afinar ajustando a posição da vara.")
    }

}