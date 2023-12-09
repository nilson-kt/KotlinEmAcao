package poo

import kotlin.random.Random

object Jokenpo {
    private val posicao = mapOf(1 to "Pedra", 2 to "Papel", 3 to "Tesoura")
    private var pontosPlayer = 0
    private var pontosCPU = 0
    private var empates = 0

    private fun jogadaPlayer(): List<String?> {
        val jogada = Leitor.lerJogada("Qual é a sua jogada?: ")
        println("Player: ${posicao[jogada]}.")
        return listOf("Player", posicao[jogada])
    }

    private fun jogadaCPU(): List<String?> {
        val numeroAleatorio = Random.nextInt(1, 4)
        println("Computador: ${posicao[numeroAleatorio]}.")
        return listOf("CPU", posicao[numeroAleatorio])
    }

    private fun determinarVencedor(jogadaPlayer: String?, jogadaCPU: String?): String {
        return when {
            jogadaPlayer == jogadaCPU -> "Empate"
            (jogadaPlayer == "Pedra" && jogadaCPU == "Tesoura") ||
                    (jogadaPlayer == "Papel" && jogadaCPU == "Pedra") ||
                    (jogadaPlayer == "Tesoura" && jogadaCPU == "Papel") -> "Player"
            else -> "CPU"
        }
    }

    private fun checarContinuacaoDoJogo(): String {
        println("-".repeat(40))
        var opcao: String
        while (true) {
            print("Deseja jogar mais uma? [S/N]: ")
            opcao = readln().trim()
            if (opcao.isEmpty() || opcao !in "SsNn") {
                println(Cores.vermelho("Opção inválida."))
                continue
            } else {
                return opcao
            }
        }
    }

    private fun fimDeJogo() {
        println("-".repeat(40))
        println(Cores.azul("Informações Finais: "))
        println("-Total de Partidas: ${pontosCPU+pontosPlayer+empates}")
        println("-Vitórias do Player: $pontosPlayer")
        println("-Vitórias do Computador: $pontosCPU")
        println("-Empates: $empates")
        println("-".repeat(40))
        println("Fim do Jogo. Volte sempre.")

    }

    fun jogar() {
        do {
            val escolhaPlayer = jogadaPlayer()[1]
            val escolhaCPU = jogadaCPU()[1]
            val vencedor = determinarVencedor(escolhaPlayer, escolhaCPU)

            if (vencedor != "Empate") {
                println(Cores.amarelo("O vencedor é $vencedor!"))
            } else {
                println(Cores.amarelo("Houve um empate!"))
            }

            if (vencedor == "CPU") pontosCPU++ else if (vencedor == "Player") pontosPlayer++ else empates++

            val continuar = checarContinuacaoDoJogo()
        } while (continuar in "Ss")

        fimDeJogo()
    }
}

object Leitor {
    fun lerJogada(frase: String): Int {
        var contador = 0
        while (true) {
            return try {
                if (contador == 2) contador = 0
                if (contador == 0) {
                    println("-".repeat(40))
                    println(Cores.verde("1 - [Pedra]\n2 - [Papel]\n3 - [Tesoura]"))
                    println("-".repeat(40))
                }
                print(frase)
                val opcao = readln().toIntOrNull()
                checkNotNull(opcao)
                { Cores.vermelho("Opção inválida. Digite um número inteiro de 1 a 3.") }
                if (opcao !in 1..3) {
                    contador++
                    println(Cores.vermelho("Opção inválida. Digite um número inteiro de 1 a 3."))
                    Thread.sleep(1200)
                    continue
                }
                opcao
            } catch (e: IllegalStateException) {
                contador++
                println(e.message)
                Thread.sleep(1200)
                continue
            }
        }
    }
}

object Cores {
    fun vermelho(frase: String): String {
        return "\u001B[31m$frase\u001B[0m"
    }

    fun verde(frase: String): String {
        return "\u001B[32m$frase\u001B[0m"
    }

    fun amarelo(frase: String): String {
        return "\u001B[33m$frase\u001B[0m"
    }
    fun azul(frase: String): String {
        return "\u001B[34m$frase\u001B[0m"
    }

}

fun main() {
    Jokenpo.jogar()
}