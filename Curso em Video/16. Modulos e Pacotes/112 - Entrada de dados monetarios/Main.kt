import utilidadescev.*

/**
 * Lê um preço, calcula a metade, o dobro, um aumento de 10% e uma redução de 13% e exibe as informações
 * na tela.
 */

fun main() {
    val preco = leiaDinheiro("Digite um preço: R$")
    resumo(preco, 10, 13)
}
