// Programa que lê a quantidade de km percorridos por um carro alugado e a quantidade de dias
// pelos quais ele foi alugado. O programa calcula o preço do aluguel, considerando que o carro
// custa R$60 por dia e R$0.15 por km rodado.

fun main() {
    print("km percorridos: ")
    val kmQuantidade = readln().toFloat()
    print("Quantidade de dias alugados: ")
    val diasQuantidade = readln().toInt()
    val precoPorDia = 60 * diasQuantidade
    val precoPorKmRodado = 0.15 * kmQuantidade
    val valorTotalAluguel = String.format("%.2f", precoPorDia + precoPorKmRodado)
    print("O valor total do aluguel é: R$valorTotalAluguel")

}