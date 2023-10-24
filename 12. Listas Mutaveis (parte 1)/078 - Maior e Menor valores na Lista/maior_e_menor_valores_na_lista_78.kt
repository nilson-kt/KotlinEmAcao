/**
 * Este programa solicita ao usuário que insira cinco valores inteiros e, em seguida,
 * exibe o maior e o menor valor digitado, bem como as posições (índices) onde esses
 * valores ocorrem na lista criada pelo algoritmo.
 */

fun main() {
    val lista = mutableListOf<Int>()
    val indicesMenor = mutableListOf<Int>()
    val indicesMaior = mutableListOf<Int>()
    for (contador in 1..5) {
        print("Digite um valor para a posição ${contador-1}: ")
        val numero = readln().toInt()
        lista.add(numero)
    }
    for ((indice, numero) in lista.withIndex()) {
        if (numero == lista.max())
            indicesMaior.add(indice)
        else if (numero == lista.min())
            indicesMenor.add(indice)
    }
    val joinIndicesMaior = indicesMaior.joinToString("... ")
    val joinIndicesMenor = indicesMenor.joinToString("... ")
    println("Números da lista: $lista")
    println("O maior valor é ${lista.max()} nas posições: $joinIndicesMaior")
    print("O menor valor é ${lista.min()} nas posições: $joinIndicesMenor")
}
