fun main() {
    Colaborador.rodarPrograma()
}

object Colaborador {
    private var valorBase = 200
    private var porcentagemBase = 0.09f
    private const val SEMANAS_NO_MES = 4

    private fun lerEntrada(): Map<String, Float> {
        return Leitor.lerVendaBrutaPorVendedor()
    }

    private fun calcularComissao(vendaBrutaPorVendedor: Map<String, Float>): Map<String, Float> {
        return vendaBrutaPorVendedor.mapValues { (_, vendaBruta) -> vendaBruta * porcentagemBase}
    }

    private fun calcularSalario(comissaoPorVendedor: Map<String, Float>): Map<String, Float> {
        return comissaoPorVendedor.mapValues { (_, comissao) -> valorBase * SEMANAS_NO_MES + comissao}
    }

    private fun exibirInformacoes(mapa: Map<String, Float>) {
        println(mapa)
    }

    fun rodarPrograma() {
        val vendaBrutaPorVendedor = lerEntrada()
        val comissaoPorVendedor = calcularComissao(vendaBrutaPorVendedor)
        val salarioPorVendedor = calcularSalario(comissaoPorVendedor)
        exibirInformacoes(salarioPorVendedor)
    }
}

object Leitor {
    private const val MAX_TENTATIVA = 5
    private const val NUMERO_MAXIMO_VENDEDORES = 5
    private var tentativa = 0

    object Mensagens {
        const val VENDA_BRUTA_INVALIDA = "Erro. Digite apenas números: R$"
        const val LIMITE_TENTATIVAS_ATINGIDO = "Você excedeu o número máximo de tentativas. Programa encerrado."
    }

    private fun lerEntrada(validacao: (String) -> Boolean): Map<String, Float> {
        val mapa = mutableMapOf<String, Float>()
        for (contador in 1..NUMERO_MAXIMO_VENDEDORES) {
            print("Digite a venda bruta do ${contador}º vendedor: R$")
            var entrada = readln()
            while (!validacao(entrada)) {
                print(Mensagens.VENDA_BRUTA_INVALIDA)
                entrada = readln()
                tentativa++
                if (tentativa == MAX_TENTATIVA)  throw MaximaTentativaAlcancadaException()
            }
            mapa += "Vendedor $contador" to entrada.toFloat()
            }
        return mapa
        }

    fun lerVendaBrutaPorVendedor(): Map<String, Float> {
        return lerEntrada {
            val possivelNumero = it.toFloatOrNull()
            possivelNumero != null
        }.toMap()
    }

}


class MaximaTentativaAlcancadaException: Exception(Leitor.Mensagens.LIMITE_TENTATIVAS_ATINGIDO)