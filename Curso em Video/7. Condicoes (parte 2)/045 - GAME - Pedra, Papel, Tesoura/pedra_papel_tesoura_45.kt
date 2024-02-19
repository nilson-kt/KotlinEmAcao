/**
 * Jogo de Pedra, Papel e Tesoura
 *
 * Este programa simula o clássico jogo de Pedra, Papel e Tesoura entre um jogador humano
 * e o computador. O jogador escolhe entre as opções Pedra, Papel e Tesoura, e o computador
 * faz uma escolha aleatória.
 *
 * As regras são as seguintes:
 * - Pedra ganha de Tesoura
 * - Tesoura ganha de Papel
 * - Papel ganha de Pedra
 *
 * Instruções:
 * 1. Execute o programa.
 * 2. Escolha uma das opções: [ 1 ] PEDRA, [ 2 ] PAPEL ou [ 3 ] TESOURA.
 * 3. O programa mostrará a jogada do computador e anunciará o resultado.
 */

import kotlin.random.Random

fun main() {
    print("""
        |[ 1 ] PEDRA
        |[ 2 ] PAPEL
        |[ 3 ] TESOURA
        |Qual é a sua jogada?: 
    """.trimMargin())
    val listaOpcoes = listOf("PEDRA", "PAPEL", "TESOURA")
    val jogadaUsuario = listaOpcoes[readln().toInt()-1]
    val jogadaComputador = listaOpcoes[Random.nextInt(1, 4)-1]
    print("O computador jogou $jogadaComputador e você jogou $jogadaUsuario! ")
    if (jogadaUsuario == jogadaComputador) {
        print("EMPATE!")
    } else if (jogadaUsuario == "PAPEL" && jogadaComputador == "TESOURA") {
        print("VOCÊ PERDEU!")
    } else if (jogadaUsuario == "PEDRA" && jogadaComputador == "PAPEL") {
        print("VOCÊ PERDEU!")
    } else if (jogadaUsuario == "TESOURA" && jogadaComputador == "PEDRA") {
        print("VOCÊ PERDEU!")
    } else {
        print("VOCÊ GANHOU!")
    }
}
