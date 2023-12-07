package poo

import kotlin.random.Random

object Jokenpo {
    private val posicao = mapOf(1 to "Pedra", 2 to "Papel", 3 to "Tesoura")

    private fun jogadaPlayer(): List<String?> {
        val jogada = Leitor.lerJogada("Qual é a sua jogada?: ")
        println("Você jogou ${posicao[jogada]}.")
        return listOf("Player", posicao[jogada])
    }

    private fun jogadaCPU(): List<String?> {
        val numeroAleatorio = Random.nextInt(1, 4)
        println("O computador jogou ${posicao[numeroAleatorio]}.")
        return listOf("CPU", posicao[numeroAleatorio])
    }

    fun jogar() {
        val jogada1 = jogadaPlayer()
        val jogada2 = jogadaCPU()
        val relacao = jogada1[1]+jogada2[1]
        val jogo = listOf(jogada1, jogada2)

        fun filtrarJogador(jogada: String): String? {
            return jogo.filter { it[1] == jogada}.flatten()[0]
        }
        if ("PedraPapel" in relacao || "PapelPedra" in relacao) {
            println(filtrarJogador("Papel"))
        } else if ("PapelTesoura" in relacao || "TesouraPapel" in relacao) {
            println(filtrarJogador("Tesoura"))
        } else if ("TesouraPedra" in relacao || "PedraTesoura" in relacao) {
            println(filtrarJogador("Pedra"))
        } else {
            println("Empate!")
        }
    }
}

object Leitor {
    fun lerJogada(frase: String): Int {
        while (true) {
            return try {
                print(frase)
                val opcao = readln().toIntOrNull()
                checkNotNull(opcao) { "Opção inválida. Digite um número inteiro." }
                if (opcao !in 1..3) {
                    println("Opção inválida. Digite um número inteiro de 1 a 3.")
                    Thread.sleep(1300)
                    continue
                }
                opcao
            } catch (e: IllegalStateException) {
                println(e)
                Thread.sleep(1300)
                continue
            }
        }
    }
}

fun main() {
    println("Jogo")
    Jokenpo.jogar()
}