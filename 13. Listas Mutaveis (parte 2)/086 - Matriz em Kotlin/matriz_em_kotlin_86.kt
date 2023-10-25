/**
 * Este programa cria uma matriz 3x3, solicita ao usuário que insira valores para cada elemento da matriz
 * e, em seguida, exibe a matriz formatada com os valores inseridos.
 */

fun main() {
    val lista = mutableListOf<MutableList<Int>>(
        mutableListOf(),
        mutableListOf(),
        mutableListOf()
    )
    for (contador in 0..2) {
        for (contador2 in 0..2) {
            print("Digite um valor para [$contador, $contador2]: ")
            lista[contador].add(readln().toInt())
        }
    }
    println("-=".repeat(30))
    for (contador in 0..2) {
        for (contador2 in 0..2) {
            print("[   ${lista[contador][contador2].toString().padEnd(3)} ] ")
        }
        println()
    }
}
