/**
 * Programa que simula um jogo de adivinhação. O programa gera um número
 * aleatório de 0 a 10 e pede para o usuário adivinhar qual foi esse número
 * gerado. O usuário terá várias tentativas até que ele acerte o número gerado
 * pelo computador.
 */

import kotlin.random.Random

fun main() {
    println("""
        =========================
        ===JOGO DA ADIVINHAÇÃO===
        =========================
    """.trimIndent())
    print("O computador irá pensar num número de 1 a 10. Tente adivinhar!: ")
    var numeroAdivinhado = readln().toInt()
    var qntPalpites = 1
    var numeroGerado = Random.nextInt(1, 11)
    print("O computador pensou $numeroGerado e você adivinhou o número $numeroAdivinhado. ")
    while (numeroGerado != numeroAdivinhado) {
        println("Você perdeu!")
        print("Tente novamente: ")
        numeroAdivinhado = readln().toInt()
        numeroGerado = Random.nextInt(1, 11)
        ++qntPalpites
        print("O computador pensou $numeroGerado e você adivinhou o número $numeroAdivinhado. ")
    }
    print("Você ganhou! Você acertou na ${qntPalpites}ª tentativa!")
}
