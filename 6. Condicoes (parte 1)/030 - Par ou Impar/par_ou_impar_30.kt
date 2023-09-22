/**
 * Programa que lê um número inteiro e exibe na tela se ele é par ou ímpar.
 */

fun main() {
    print("Digite um número inteiro: ")
    val numero = readln().toInt()
    if (numero % 2 == 0) {
        print("O número é par!")
    } else {
        print("O número é ímpar!")
    }
}
