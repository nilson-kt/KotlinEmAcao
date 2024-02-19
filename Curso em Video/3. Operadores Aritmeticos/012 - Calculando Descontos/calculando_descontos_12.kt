// Programa que lê o preço de um produto e exibe o preço com 5% de desconto aplicado.

fun main() {
    print("Digite o preço do produto: R$")
    val preco = readln().toFloat()
    val precoComDesconto = preco - (preco * 0.05)
    print("O preço do produto com desconto de 5% aplicado fica: R$$precoComDesconto")

}