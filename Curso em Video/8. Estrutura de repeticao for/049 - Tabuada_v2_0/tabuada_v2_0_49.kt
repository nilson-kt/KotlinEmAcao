/**
 * Programa que lê um número inteiro e exibe sua tabuada.
 */

fun main() {
    print("Digite um número para ver sua tabuada: ")
    val numero = readln().toInt()
    for (contador in 1..10) {
        println("$numero X $contador = ${numero*contador}")
    }
}
