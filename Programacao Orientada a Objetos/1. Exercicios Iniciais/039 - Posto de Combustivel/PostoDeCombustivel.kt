object PostoDeCombustivel {

    enum class Combustivel(val preco: Float) {
        ALCOOL(1.90f),
        GASOLINA(2.70f)
    }

    private fun entrarDados(): Pair<Combustivel, Int> {
        print("Digite o tipo de combustível a ser vendido [A/G] (ALCOOL/GASOLINA): ")
        val tipoCombustivel = Leitor.lerTipoCombustivel()
        print("Digite a quantidade de litros: ")
        val qntLitros = Leitor.lerQuantidadeLitros()
        return Pair(tipoCombustivel, qntLitros)
    }

    private fun aplicarDesconto(preco: Float, tipoCombustivel: Combustivel, qntLitros: Int): Float {
        val desconto = when (tipoCombustivel) {
            Combustivel.ALCOOL -> when {
                qntLitros > 25 -> 0.04f
                else -> 0.02f
            }
            Combustivel.GASOLINA -> when {
                qntLitros > 25 -> 0.05f
                else -> 0.03f
            }
        }
        return preco - (preco * desconto)
    }

    private fun calcularPreco(tipoCombustivel: Combustivel, qntLitros: Int): Float {
        val precoNormal = tipoCombustivel.preco * qntLitros
        return aplicarDesconto(precoNormal, tipoCombustivel, qntLitros)
    }

    private fun exibirInformacoes(preco: Float, tipoCombustivel: Combustivel, qntLitros: Int) {
        println("-".repeat(30))
        println("Relatório da Venda")
        println("-".repeat(30))
        println("""
            Tipo de Combustível: $tipoCombustivel
            Preço por Litro: ${String.format("R$%.2f", tipoCombustivel.preco)}
            Quantidade de Litros: $qntLitros
            Valor calculado: ${String.format("R$%.2f", preco)}
        """.trimIndent())
    }

    fun rodarPrograma() {
        val (tipoCombustivel, qntLitros) = entrarDados()
        val valor = calcularPreco(tipoCombustivel, qntLitros)
        exibirInformacoes(valor, tipoCombustivel, qntLitros)
    }
}