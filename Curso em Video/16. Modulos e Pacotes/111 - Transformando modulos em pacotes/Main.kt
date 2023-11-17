import utilidadescev.resumo

/**
 * Lê um preço, calcula a metade, o dobro, um aumento de 10% e uma redução de 13% e exibe as informações
 * na tela.
 */

fun main() {
    print("Digite um preço: R$")
    val preco = readln().toFloat()
    resumo(preco, 10, 13)
}
