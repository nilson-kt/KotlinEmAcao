import kotlin.system.exitProcess

object Leitor {

    private const val MAX_TENTATIVA = 5

    private object Mensagens {
        const val TIPO_GASOLINA_INVALIDA = "Tipo inválido. Digite um tipo [A/G] (ALCOOL/GASOLINA): "
        const val ENTRADA_LITROS_INVALIDA = "Dado inválido. Digite um número inteiro acima de zero: "
        const val MENSAGEM_MAX_TENTATIVAS = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        var tentativas = 0
        while (tentativas != MAX_TENTATIVA) {
            val entrada = readln()
            when (validacao(entrada)) {
                true -> return entrada
                else -> print(mensagem)
            }
            tentativas++
        }
        println()
        println(Mensagens.MENSAGEM_MAX_TENTATIVAS)
        exitProcess(0)
    }

    fun lerTipoCombustivel(): PostoDeCombustivel.Combustivel  {
        val entrada = lerEntrada(Mensagens.TIPO_GASOLINA_INVALIDA) { it.uppercase().trim() in setOf("A", "G")}
        return when (entrada.uppercase()) {
            "A" -> PostoDeCombustivel.Combustivel.ALCOOL
            "G" -> PostoDeCombustivel.Combustivel.GASOLINA
            else -> PostoDeCombustivel.Combustivel.ALCOOL
        }
    }

    fun lerQuantidadeLitros(): Int {
        return lerEntrada(Mensagens.ENTRADA_LITROS_INVALIDA) {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero != 0
        }.toInt()
    }
}