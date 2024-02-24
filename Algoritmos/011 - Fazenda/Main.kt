fun main() {
    Pulverizadora.entrarDados()
}

object Pulverizadora {
    fun entrarDados() {
        val entrada = Leitor.lerTipoPulverizacao()
    }
}

object Leitor {
    const val MAX_TENTATIVA = 5

    data class Mensageiro(val mensagemEntrada: String, val mensagemTentativa: String, val tentativa: Int)

    object Mensagens {
        const val TENTATIVA_MAXIMA_ATINGIDA = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    fun lerEntrada(mensagem: String, validacao: (String) -> Boolean, mensageiro: Mensageiro): String {
        var tentativa = 0
        while (tentativa != MAX_TENTATIVA) {
            if (mensageiro.tentativa == tentativa) {
                println(mensageiro.mensagemTentativa)
            }
            print(mensageiro.mensagemEntrada)
            val entrada = readln()
            if (validacao(entrada)) return entrada else print(mensagem)
            tentativa++
        }
        throw TentativaMaximaAtingidaExcecao(Mensagens.TENTATIVA_MAXIMA_ATINGIDA)
    }

    fun lerTipoPulverizacao() {
        lerEntrada("Opção inválida. Digite um número inteiro de 1 a 4: ",  {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero in 1..4
        }, Mensageiro(
            """
                Tipo 1 - ervas daninhas  R${'$'}50.00 por acre
                Tipo 2 - gafanhotos      R${'$'}100.00 por acre
                Tipo 3 - broca           R${'$'}150.00 por acre
                Tipo 4 - todos acima     R${'$'}250.00 por acre
                Digite a área a ser a pulverizada (acres):
            """.trimIndent(),
            """
                Tipo 1 - ervas daninhas  R${'$'}50.00 por acre
                Tipo 2 - gafanhotos      R${'$'}100.00 por acre
                Tipo 3 - broca           R${'$'}150.00 por acre
                Tipo 4 - todos acima     R${'$'}250.00 por acre
            """.trimIndent(),3))
    }
}

class TentativaMaximaAtingidaExcecao(mensagem: String): Exception(mensagem)