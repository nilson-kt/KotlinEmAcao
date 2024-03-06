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
        const val VENDA_BRUTA_INVALIDA = "Erro. Digite apenas números: R$"
        const val LIMITE_TENTATIVAS_ATINGIDO = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    private fun lerEntrada(validacao: (String) -> Boolean): Map<String, Float> {
        val mapa = mutableMapOf<String, Float>()
        for (contador in 1..5) {
            print("Digite a venda bruta do ${contador}º vendedor: R$")
            var entrada = readln()
            while (!validacao(entrada)) {
                print(Mensagens.VENDA_BRUTA_INVALIDA)
                entrada = readln()
                tentativa++
                if (tentativa == 5)  throw MaximaTentativaAlcancadaException()
            }
            mapa += "Vendedor $contador" to entrada.toFloat()
            }
        return mapa
        }

    }

    fun lerVenda(): Float {
        return lerEntrada {
            val possivelNumero = it.toFloatOrNull()
            possivelNumero != null
        }.toFloat()
    }

}

class MaximaTentativaAlcancadaException: Exception(Leitor.Mensagens.LIMITE_TENTATIVAS_ATINGIDO)