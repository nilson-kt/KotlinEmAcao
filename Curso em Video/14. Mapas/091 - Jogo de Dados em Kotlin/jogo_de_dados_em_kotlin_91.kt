/**
 * Programa que simula um jogo de dados entre quatro jogadores e determina o ranking com base nos
 * valores dos dados lançados.
 */

import kotlin.random.Random

fun main() {
    val mapa = mutableMapOf<String, Int>()
    println("Valores sorteados:")
    for (contador in 1..4) {
        val dado = Random.nextInt(1,7)
        mapa["Jogador $contador"] = dado
        println("Jogador $contador jogou $dado")
        Thread.sleep(999)
    }
    println("Ranking dos jogadores:")
    val mapaOrdenado = mapa.toList().sortedBy { it.second }.toMap()
    var contador = 0
    for ((chave, valor) in mapaOrdenado.entries) {
        ++contador
        println("${contador}º lugar: $chave com $valor")
        Thread.sleep(999)
    }
}
