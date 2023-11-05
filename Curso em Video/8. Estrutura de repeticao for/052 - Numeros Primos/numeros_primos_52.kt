/**
 * Programa que lê um número inteiro e mostra na tela
 * se ele é ou não um número primo.
 */

fun main() {
    var checagem = 0
    print("Digite um número inteiro: ")
    val numero = readln().toInt()
    for (contador in 1..numero) {
        if (numero % contador == 0) {
            ++checagem
            print("*$contador ")
        } else {
            print("$contador ")
        }
    }
    println()
    println("O número $numero tem $checagem divisores.")
    if (checagem > 2) print("Ele NÃO É um número primo.") else print("Ele É um número primo!")
}
