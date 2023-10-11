/**
 * Programa que lê um número digitado pelo usuário e exibe a sua tabuada.
 * O programa continuará pedindo um número e exibindo a correspondente tabuada
 * até que o usuário digite um número negativo.
 */

fun main() {
    while (true) {
        print("Digite um número para ver sua tabuada: ")
        val numero = readln().toInt()
        if (numero < 0) break
        var contador = 0
        while (contador != 10) {
            ++contador
            println("$numero x $contador = ${numero*contador}")
        }
    }
    print("Programa encerrado.")
}
