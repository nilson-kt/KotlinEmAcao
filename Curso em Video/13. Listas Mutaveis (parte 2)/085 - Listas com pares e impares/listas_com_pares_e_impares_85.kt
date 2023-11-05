/**
 * Programa que recebe sete números fornecidos pelo usuário, classifica-os em números pares e ímpares,
 * e os exibe em ordem crescente.
 */

fun main() {
    val lista = mutableListOf<MutableList<Int>>(
        mutableListOf(),
        mutableListOf()
    )
    for (contador in 1..7) {
        print("Digite o ${contador}º número: ")
        val numero = readln().toInt()
        if (numero % 2 == 0) {
            lista[0].add(numero)
        } else {
            lista[1].add(numero)
        }
    }
    lista[0].sort()
    lista[1].sort()
    for ((indice, sublista) in lista.withIndex()) {
        if (indice == 0) print("Números pares: ") else print("Números ímpares: ")
        for (numero in sublista) {
            print("$numero ")
        }
        println()
    }
}
