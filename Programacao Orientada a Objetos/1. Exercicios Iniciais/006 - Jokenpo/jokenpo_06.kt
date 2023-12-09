package poo

import kotlin.random.Random

object Jokenpo {
    private val posicao = mapOf(1 to "Pedra", 2 to "Papel", 3 to "Tesoura")
    var pontosPlayer = 0
    var pontosCPU = 0

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

    fun jogar() {
        val jogada1 = jogadaPlayer()
        val jogada2 = jogadaCPU()
        val relacao = jogada1[1]+jogada2[1]
        val jogo = listOf(jogada1, jogada2)
        val vencedor: String?

        fun filtrarJogador(jogada: String): String? {
            return jogo.filter { it[1] == jogada}.flatten()[0]
        }

        vencedor = if ("PedraPapel" in relacao || "PapelPedra" in relacao) {
            filtrarJogador("Papel")
        } else if ("PapelTesoura" in relacao || "TesouraPapel" in relacao) {
            filtrarJogador("Tesoura")
        } else if ("TesouraPedra" in relacao || "PedraTesoura" in relacao) {
            filtrarJogador("Pedra")
        } else {
            null
        }
        if (!vencedor.isNullOrBlank()) {
            println(Cores.amarelo("O vencedor é $vencedor!"))
        } else {
            println(Cores.amarelo("Houve um empate!"))
        }
        if (vencedor == "CPU") pontosCPU++ else pontosPlayer++

        println("-".repeat(40))
        var opcao: String
        while (true) {
            print("Deseja jogar mais uma? [S/N]: ")
            opcao = readln()
            if (opcao.isEmpty() || opcao !in "SsNn") {
                println(Cores.vermelho("Opção inválida."))
                continue
            } else {
                break
            }
        }

        if (opcao in "Ss") jogar()
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
                checkNotNull(opcao) { Cores.vermelho("Opção inválida. Digite um número inteiro.") }
                if (opcao !in 1..3) {
                    contador++
                    println(Cores.vermelho("Opção inválida. Digite um número inteiro de 1 a 3."))
                    Thread.sleep(1300)
                    continue
                }
                opcao
            } catch (e: IllegalStateException) {
                contador++
                println(e.message)
                Thread.sleep(1300)
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
}

fun main() {
    Jokenpo.jogar()
}