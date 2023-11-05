/**
 * Jogo do Par ou Ímpar
 *
 * Este programa implementa o clássico jogo de Par ou Ímpar entre o usuário e o computador.
 * O usuário escolhe um número e decide se é "PAR" ou "ÍMPAR", o computador gera um número aleatório e
 * faz a soma dos números. Se a soma for par e o usuário escolheu "PAR" ou se a soma for ímpar e
 * o usuário escolheu "ÍMPAR", o usuário vence. Caso contrário, o computador vence.
 * O jogo continua até que o usuário perca.
 *
 * No final, o programa mostra a quantidade de vitórias do usuário.
 */

import kotlin.random.Random

fun main() {
    println("""|====================
        |JOGO DO PAR OU ÍMPAR
        |====================""".trimMargin())
    var qntVitorias = 0
    while (true) {
        print("Digite um número: ")
        val numeroUsuario = readln().toInt()
        var decisao = ""
        while (decisao !in "PI" || decisao == ""){
            print("Par ou Ímpar? [P/I]: ")
            decisao = readln().trim().uppercase()
            if (decisao !in "PI" || decisao == "") print("Opção inválida. ")
        }
        if (decisao == "P") decisao = "PAR" else if (decisao == "I") decisao = "ÍMPAR"
        val numeroGeradoPc = Random.nextInt(1, 11)
        println("=".repeat(40))
        println("Você escolheu: $decisao")
        println("Computador gerou: $numeroGeradoPc")
        println("Você digitou: $numeroUsuario")
        val soma = numeroGeradoPc + numeroUsuario
        println("$numeroGeradoPc + $numeroUsuario = $soma")
        println("=".repeat(40))
        if (soma % 2 == 0 && decisao == "PAR") {
            println("$soma é um número $decisao! Você ganhou essa!")
            ++qntVitorias
        } else if (soma % 2 != 0 && decisao == "ÍMPAR") {
            println("$soma é um número $decisao! Você ganhou essa!")
            ++qntVitorias
        } else {
            println("$soma NÃO é um número $decisao.")
            println("=".repeat(40))
            print("GAME OVER! Você ganhou $qntVitorias vezes! Volte sempre!")
            break
        }
        println("=".repeat(40))
    }
}
