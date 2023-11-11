/**
 * Programa de sorteio e soma de valores.
 *
 * Este programa utiliza funções para sortear cinco números inteiros aleatórios entre 1 e 10,
 * exibindo o sorteio passo a passo.
 *
 * Em seguida, calcula e imprime a soma dos valores pares presentes na lista de números sorteados.
 *
 * @param lista Uma lista mutável de inteiros que armazena os números sorteados.
 * @return Nenhum valor é retornado. O programa imprime o sorteio passo a passo e a soma dos valores pares.
 */

import kotlin.random.Random

fun main() {
    val numeros = mutableListOf<Int>()
    sorteia(numeros)
    somaPar(numeros)
}

fun sorteia(lista: MutableList<Int>) {
    print("Sorteando os 5 valores: ")
    val sorteio = listOf(
        Random.nextInt(1, 10),
        Random.nextInt(1, 10),
        Random.nextInt(1, 10),
        Random.nextInt(1, 10),
        Random.nextInt(1, 10)
    )
    sorteio.forEach {
        print("$it ")
        Thread.sleep(444)
    }
    println("PRONTO!")
    lista.addAll(sorteio)
}

fun somaPar(lista: MutableList<Int>) {
    val soma = lista.sumOf { if (it % 2 == 0) it else 0 }
    println("Somando os valores pares de $lista, temos $soma")
}
