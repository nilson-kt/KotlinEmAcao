fun main() {
    SistemaSaude.rodarPrograma()
}

object SistemaSaude {

    private val painel = """
        ${"-".repeat(30)}
        SISTEMA SAÚDE-ESTIMULA
        ${"-".repeat(30)}
    """.trimIndent()

    private fun exibirPainel() {
        println(painel)
    }

    private fun entrarDados(): Int {
        print("Digite o número de horas de atividade física no mês: ")
        return readln().toInt()
    }

    private fun calcularPontos(qntHorasMes: Int): Int {
        return when {
            qntHorasMes <= 9 -> 2 * qntHorasMes
            qntHorasMes <= 20 -> 5 * qntHorasMes
            else -> 10 * qntHorasMes
        }
    }

    private fun calcularDinheiro(qntPontos: Int): Float {
        return qntPontos * 0.05f
    }

    private fun exibirInformacoes(qntHorasMes: Int, qntPontos: Int, dinheiroGanho: Float) {
        println("-".repeat(30))
        print("Calculando o Resultado")
        for (contador in 3 downTo 1) {
            print(".")
            Thread.sleep(800)
        }
        println()
        println("-".repeat(30))
        println("""
            ==Informações Obtidas==
            -Quantidade de Horas: $qntHorasMes
            -Pontos Calculados: $qntPontos
            -Dinheiro Ganho: ${String.format("R$%.2f", dinheiroGanho)}
        """.trimIndent())
    }

    fun rodarPrograma() {
        exibirPainel()
        val qntHorasMes = entrarDados()
        val qntPontos = calcularPontos(qntHorasMes)
        val dinheiroganho = calcularDinheiro(qntPontos)
        exibirInformacoes(qntHorasMes, qntPontos, dinheiroganho)
    }
}