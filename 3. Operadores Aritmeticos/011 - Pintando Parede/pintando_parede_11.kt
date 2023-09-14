// Programa que lê a largura e a altura de uma parede em metros, calcula a sua área,
// a quantidade de tinta necessária para pintá-la e exibe todos esses dados na tela.

fun main() {
    print("Digite a largura da parede em metros: ")
    val largura = readln().toFloat()
    print("Agora, em metros, digite a altura da parede: ")
    val altura = readln().toFloat()
    val area = largura * altura
    val larguraFormatada = String.format("%.2f", largura)
    val alturaFormatada = String.format("%.2f", altura)
    val areaFormatada = String.format("%.3f", area)
    println("Dimensão: ${larguraFormatada}x$alturaFormatada")
    println("Área: ${areaFormatada}m²")
    print("Quantidade de litros necessária para pintar a parede: ${area/2}l")

}