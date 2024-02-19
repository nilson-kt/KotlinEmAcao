// Programa que lê um valor em metros e exibe a conversão do valor para
// milímetros e centímetros.

fun main() {
    print("Digite um valor em metros: ")
    val metros = readln().toDouble()
    val centimetros = metros * 100
    val milimetros = metros * 1000
    println("${metros}m para centímetros: ${centimetros}cm")
    println("${metros}m para milímetros: ${milimetros}mm")
}
