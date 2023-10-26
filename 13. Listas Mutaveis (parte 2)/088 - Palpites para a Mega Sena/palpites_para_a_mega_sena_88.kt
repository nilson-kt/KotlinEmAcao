/**
 * Este programa gera sorteios de números para jogos de loteria. O algoritmo
 * gerará uma quantidade de jogos de acordo com a entrada fornecida pelo usuário.
 */

import kotlin.random.Random

fun main() {
    val lista = mutableListOf<MutableList<Int>>()
    print("Quanto jogos você quer que eu sorteie?: ")
    val resposta = readln().toInt()
    for (contador in 1..resposta) {
        val sublista = mutableListOf<Int>()
        for (contador2 in 1..6) {
            var valorAleatorio = Random.nextInt(1, 61)
            if (valorAleatorio in sublista) {
                while (valorAleatorio in sublista) {
                    valorAleatorio = Random.nextInt(1, 61)
                }
            }
            sublista.add(valorAleatorio)
        }
        sublista.sort()
        lista.add(sublista)
        println("Jogo $contador: ${lista[contador-1]}")
        Thread.sleep(999)
    }
}
