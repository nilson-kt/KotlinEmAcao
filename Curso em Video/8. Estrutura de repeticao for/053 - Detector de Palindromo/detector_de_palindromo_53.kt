/**
 * Programa que lê uma string e exibe na tela se ela é um
 * palíndromo ou não.
 */

fun main() {
    println("=".repeat(30))
    println("DETECTOR DE PALÍNDROMO")
    println("=".repeat(30))
    print("Digite uma frase qualquer: ")
    val frase = readln().trim().uppercase().split(" ").joinToString(separator="")
    val fraseReversa = frase.reversed()
    println("=".repeat(30))
    println("ANALISANDO...")
    Thread.sleep(3000)
    println("=".repeat(30))
    println("$frase ao inverso fica: $fraseReversa")
    if (frase == fraseReversa) {
        print("É um palíndromo!")
    } else {
        print("NÃO É um palíndromo!")
    }
}
