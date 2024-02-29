fun main() {
    val paisA = Pais("Brasil", 5_000_000, 0.03f)
    val paisB = Pais("China", 7_000_000, 0.02f)
    paisA.calcularUltrapassagem(paisB)

}

class Pais(private val nome: String, private val populacao: Int, taxaNatalidade: Float) {

    private val pessoasPorAno = (populacao * taxaNatalidade).toInt()

    private fun compararPopulacao(paisA: Pais, paisB: Pais): String {
        val popA = paisA.populacao
        val popB = paisB.populacao
        return when {
            popA > popB -> "maior"
            popA < popB -> "menor"
            else -> "igual"
        }
    }

    fun calcularUltrapassagem(paisB: Pais) {
        var populacaoPaisA = this.populacao
        val comparacao = compararPopulacao(this, paisB)
        println("$nome possui uma população $comparacao do que ${paisB.nome}.")
        var anosParaUltrapassagem = 0
        do  {
            if (anosParaUltrapassagem == 0) println("0 $populacaoPaisA")
            populacaoPaisA += pessoasPorAno
            anosParaUltrapassagem++
            println("$anosParaUltrapassagem $populacaoPaisA")
        } while (populacaoPaisA < paisB.populacao )
        println("-".repeat(40))
        println("Para $nome ultrapassar ${paisB.nome} em população, são necessários $anosParaUltrapassagem anos.")
        }
    }
