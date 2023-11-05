// Algoritmo que lê um número real e exibe a sua parte inteira.

fun main() {
    print("Digite um número real qualquer: ")
    val numeroReal = readln().toDouble()
    val parteInteira = numeroReal.toInt()
    print("A parte inteira desse número é: $parteInteira")
}
