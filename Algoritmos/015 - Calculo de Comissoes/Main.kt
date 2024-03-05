fun main() {
    //semana tem 7 dias
    //vendedor recebe 200 * 7 por semana + 9% de suas vendas brutas, exemplo + 9% de 3000
    Colaborador.lerEntrada()
}

object Colaborador {
    fun lerEntrada() {
        Leitor.lerVenda()
    }
}

object Leitor {
    private const val MAX_TENTATIVA = 5
    private var tentativa = 0

    object Mensagens {
        const val VENDA_BRUTA_INVALDIA = "Erro. Digite apenas números."
        const val LIMITE_TENTATIVAS_ATINGIDO = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        while (tentativa != MAX_TENTATIVA) {
            print(mensagem)
            val entrada = readln()
            if (validacao(entrada)) return entrada else print(Mensagens.VENDA_BRUTA_INVALDIA)
            tentativa++
        }
        throw MaximaTentativaAlcancadaException()
        }

    fun lerVenda(): Float {
        return lerEntrada("Digite as vendas brutas: R$") {
            val possivelNumero = it.toFloatOrNull()
            possivelNumero != null
        }.toFloat()
    }

}

class MaximaTentativaAlcancadaException: Exception(Leitor.Mensagens.LIMITE_TENTATIVAS_ATINGIDO)