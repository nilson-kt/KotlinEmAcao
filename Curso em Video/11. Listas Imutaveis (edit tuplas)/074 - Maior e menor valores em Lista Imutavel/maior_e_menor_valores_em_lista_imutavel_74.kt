/**
 * Este programa gera uma lista de cinco números aleatórios entre 1 e 10,
 * imprime os valores sorteados, encontra o maior e o menor número da lista
 * e os exibe na saída padrão.
 */

import kotlin.random.Random

fun main() {
    val valoresSorteados = listOf(Random.nextInt(1, 10), Random.nextInt(1, 10),
        Random.nextInt(1, 10), Random.nextInt(1, 10),
        Random.nextInt(1, 10))
    print("Valores sorteados: ")
    for (valor in valoresSorteados) {
        print("$valor ")
    }
    println()
    println("Maior número: ${valoresSorteados.max()}")
    print("Menor número: ${valoresSorteados.min()}")
}
