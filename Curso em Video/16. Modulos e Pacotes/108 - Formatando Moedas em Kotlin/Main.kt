/**
 * Lê um preço, calcula a metade, o dobro, um aumento de 10% e uma redução de 13% e exibe as informações
 * na tela.
 */

fun main() {
    print("Digite um preço: R$")
    val preco = readln().toFloat()
    println("A metade de R$$preco é ${moeda(metade(preco))}")
    println("O dobro de R$$preco é ${moeda(dobro(preco))}")
    println("Aumentando 10%, temos ${moeda(aumentar(preco, 10))}")
    println("Reduzindo 13%, temos ${moeda(diminuir(preco, 13))}")
}
