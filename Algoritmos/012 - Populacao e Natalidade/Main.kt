fun main() {
    val paisA = Pais("Brasil", 5_000_000, 0.03f)
    val paisB = Pais("China", 7_000_000, 0.02f)
    paisA.calcularUltrapassagem(paisB)

}

class Pais(private val nome: String, private val populacao: Int, taxaNatalidade: Float) {

    private val pessoasPorAno = (populacao * taxaNatalidade).toInt()

    fun calcularUltrapassagem(paisB: Pais) {
        var populacaoPaisA = this.populacao
        var contador = 0
        if (this.populacao > paisB.populacao) {
            println("$nome possui uma população maior do que ${paisB.nome}")
        } else if (this.populacao == paisB.populacao) {
            println("$nome possui uma população igual a ${paisB.nome}")
        } else {
            println("0 $populacao")
            while (populacaoPaisA < paisB.populacao) {
                populacaoPaisA += pessoasPorAno
                contador++
                println("$contador $populacaoPaisA")
            }
            println("-".repeat(40))
            println("Para $nome ultrapassar ${paisB.nome} em população, é necessário $contador anos. ")
        }
    }
}