/**
 * Este programa simula uma experiência de compras, calculando preços
 * com descontos e juros para diferentes formas de pagamento.
 * Com base na escolha, o programa calcula e exibe o valor final a ser pago.
 * Certifique-se de inserir valores válidos e seguir as instruções do programa.
 */

fun main() {
    print("Digite o preço do produto: R$")
    val precoProduto = readln().toFloat()
    val porcentagem5 = precoProduto * 0.05
    val porcentagem10 = precoProduto * 0.10
    val porcentagem20 = precoProduto * 0.20
    var quantidadeParcelas = 2
    var mensalidade = precoProduto / quantidadeParcelas
    println("""
        ${"=".repeat(40)}
        Condições de Pagamento:
        [1] à vista (dinheiro/cheque)
        [2] à vista no cartão
        [3] em até 2x no cartão
        [4] 3x ou mais no cartão
        ${"=".repeat(40)}
    """.trimIndent())
    print("Digite a condição de pagamento: ")
    val condicaoPagamento = readln()
    when (condicaoPagamento) {
        "1" -> {
            println("Você recebeu 10% de desconto por pagar à vista no dinheiro/cheque!")
            print("Você pagará o valor de R$${precoProduto - porcentagem10} reais!")
        }
        "2" -> {
            println("Você recebeu 5% de desconto por pagar à vista no cartão!")
            print("Você pagará o valor de R$${precoProduto - porcentagem5} reais!")
        }
        "3" -> {
            println("Você pagará 2x de R$$precoProduto reais!")
            print("Cada parcela custará R$$mensalidade reais!")
        }
        "4" -> {
            println("Você terá juros de 20% por pagar em 3x ou mais no cartão!")
            print("Em quantas parcelas você deseja pagar? (de 3x a 12x): ")
            quantidadeParcelas = readln().toInt()
            if (quantidadeParcelas < 3 || quantidadeParcelas > 12) {
                print("Opção inválida! Reinicie o programa e insira, por favor, uma opção válida.")
            } else {
                println("=".repeat(40))
                mensalidade = ((precoProduto + porcentagem20) / quantidadeParcelas).toFloat()
                println("Você pagará ${quantidadeParcelas}x de R$${precoProduto + porcentagem20} reais!")
                print("Cada parcela custará R$$mensalidade reais!")
                }
            }
        else -> {
            print("Opção inválida! Reinicie o programa e insira, por favor, uma opção válida.")
        }
    }
}
