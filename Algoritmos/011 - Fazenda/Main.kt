import java.util.Locale

fun main() {
    Pulverizadora.rodarSistema()
}

object Pulverizadora {
    private fun entrarDados(): Pair<Int, Int> {
        println("""
            Tipo 1 – ervas daninhas  R$50.00 por acre
            Tipo 2 – gafanhotos      R$100.00 por acre
            Tipo 3 – broca           R$150.00 por acre
            Tipo 4 – todos acima     R$250.00 por acre
        """.trimIndent())
        println("-".repeat(45))
        print("Digite o tipo de pulverização: ")
        val tipoPulverizacao = Leitor.lerTipoPulverizacao()
        println("-".repeat(45))
        print("Digite a área a ser pulverizada (em acres): ")
        val area = Leitor.lerArea()
        return Pair(tipoPulverizacao, area)
    }

    private fun calcularPreco(tipoPulverizacao: Int, acres: Int): Float {
        val valorPorAcre = when (tipoPulverizacao) {
            1 -> 50
            2 -> 100
            3 -> 150
            else -> 250
        }
        return calcularDesconto((valorPorAcre * acres).toFloat(), acres)
    }

    private fun calcularDesconto(preco: Float, acres: Int): Float {
        return when {
            acres > 1000 && preco > 750 -> 0.15f
            acres > 1000 -> 0.05f
            else -> 0.10f
        }
    }

    private fun exibirInformacoes(preco: Float, tipoPulverizacao: Int, acres: Int) {
        println("-".repeat(45))
        println("""
            Quantidade de Acres: $acres
            Tipo de Pulverização: $tipoPulverizacao
            Preço calculado: ${String.format(Locale.US, "R$%.2f", preco)}
        """.trimIndent())
    }

    fun rodarSistema() {
        val (tipoPulverizacao, acres) = entrarDados()
        val preco = calcularPreco(tipoPulverizacao, acres)
        exibirInformacoes(preco, tipoPulverizacao, acres)
    }
}

object Leitor {
    const val MAX_TENTATIVA = 5

    object Mensagens {
        const val TENTATIVA_MAXIMA_ATINGIDA = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        var tentativa = 0
        while (tentativa != MAX_TENTATIVA) {
            val entrada = readln()
            if (validacao(entrada)) return entrada else print(mensagem)
            tentativa++
        }
        throw TentativaMaximaAtingidaExcecao(Mensagens.TENTATIVA_MAXIMA_ATINGIDA)
    }

    fun lerTipoPulverizacao(): Int {
        return lerEntrada("Opção inválida. Digite um número inteiro de 1 a 4: ") {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero in 1..4
        }.toInt()
    }

    fun lerArea(): Int {
        return lerEntrada("Área inválida. Digite um número inteiro acima de 0: ") {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero > 0
        }.toInt()
    }
}

class TentativaMaximaAtingidaExcecao(mensagem: String): Exception(mensagem)