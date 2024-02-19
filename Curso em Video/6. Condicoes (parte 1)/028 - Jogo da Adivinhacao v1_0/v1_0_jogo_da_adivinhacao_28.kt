/**
 * Programa que pede pro usuário digitar um valor de 1 a 5. Após isso, o
 * programa gera um número aleatório de 1 a 5 e mostra na tela se o usuário
 * acertou ou errou o número gerado.
 */

import kotlin.random.Random

fun main() {
    println("=".repeat(30))
    println("JOGO DA ADIVINHAÇÃO")
    println("=".repeat(30))
    print("Adivinhe um número de 1 a 5: ")
    val numeroAdivinhado = readln().toInt()
    println("=".repeat(30))
    val numeroAleatorioGerado = Random.nextInt(1, 6)
    if (numeroAdivinhado == numeroAleatorioGerado) {
        print("Você acertou! O número gerado pelo computador é $numeroAleatorioGerado!")
    } else {
        print("Você errou! O número gerado pelo computador é $numeroAleatorioGerado!")
    }
}
