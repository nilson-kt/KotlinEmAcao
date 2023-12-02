import kotlin.random.Random

fun main () {
    class DadoGame {
        private val partidas = mutableListOf<MutableMap<String, Any>>()
        private val instrucao = """
            O player digita 1 para rolar o dado. O dado pode cair num número de 1 a 6. Caso
            o dado lançado pelo computador for maior do que o do player, o computador ganha.
            Do contrário, o player ganha. Se for o mesmo valor, haverá empate.
        """.trimIndent()

        fun exibirMenu() {
            while (true) {
                try {
                    println("-".repeat(40))
                    println("JOGO DOS DADOS")
                    println("-".repeat(40))
                    println("[1] Rolar dado")
                    println("[2] Exibir partidas")
                    println("[3] Exibir quantidade de vitórias")
                    println("[4] Exibir instruções")
                    println("[5] Sair do Jogo")
                    println("-".repeat(40))
                    print("Sua opção: ")
                    val opcao = readln().toIntOrNull()
                    checkNotNull(opcao) { "Opção inválida. Digite um número inteiro de 1 a 5." }
                    if (opcao !in 1..5) {
                        println("Opção inválida. Digite um número inteiro de 1 a 5.")
                        Thread.sleep(1300)
                        continue
                    }
                    when (opcao) {
                        1 -> jogar()
                        2 -> {
                            println(partidas)
                            print("Pressione enter para continuar ")
                            readln()
                        }
                        3 -> {
                            println("O Player teve ${getVitoriasPlayer()} vitórias")
                            print("Pressione enter para continuar ")
                            readln()
                        }
                        4 -> {
                            println(instrucao)
                            print("Pressione enter para continuar ")
                            readln()
                        }
                        5 -> break
                    }
                } catch (e: IllegalStateException) {
                    println(e.message)
                    Thread.sleep(1300)
                    continue
                }
            }
        }

        private fun jogar() {
            val dadoPlayer = jogarDado()
            val dadoCPU = jogarDado()
            processarPartida(dadoPlayer, dadoCPU)
            exibirUltimaPartida()
        }

        private fun jogarDado(): Int {
            return Random.nextInt(1, 7)
        }

        private fun processarPartida(giroPlayer: Int, giroCPU: Int) {
            var resultado = "Player Wins"
            if (giroCPU > giroPlayer) {
                resultado = "CPU Wins"
            } else if (giroCPU == giroPlayer) {
                resultado = "Empate"
            }
            partidas.add(mutableMapOf(
                "Player" to giroPlayer,
                "CPU" to giroCPU,
                "Resultado" to resultado
            ))
        }

        private fun exibirUltimaPartida() {
            println("=".repeat(40))
            partidas.last().forEach { (key, value) ->
                if (key != "Resultado") {
                    println("$key rolou $value")
                } else {
                    println("$key = $value")
                }
            }
            println("=".repeat(40))
            print("Pressione enter para continuar ")
            readln()
        }

        private fun getVitoriasPlayer(): Int {
            return partidas.filter { it["Resultado"] == "Player Wins"}.size
        }


    }

    val jogo = DadoGame()
    jogo.exibirMenu()
}
