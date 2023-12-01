import kotlin.random.Random

fun main () {
    class DadoGame() {
        val partidas = mutableListOf<MutableMap<String, Any>>()

        fun jogar() {
            var opcao: String
            do {
                val dadoPlayer = jogarDadoPlayer()
                val dadoCPU = jogarDadoCPU()
                processarPartida(dadoPlayer, dadoCPU)
                exibirUltimaPartida()
                while (true) {
                    print("Deseja jogar novamente?: ")
                    opcao = readln().trim()
                    if (opcao !in "SsNn" || opcao.isEmpty()) {
                        println("Opção inválida.")
                    } else {
                        break
                    }
                }
            } while (opcao !in "Nn")
            println("Player venceu ${getVitoriasPlayer()} vezes!")
        }

        private fun jogarDadoPlayer(): Int {
            while (true) {
                try {
                    print("Digite um dado: ")
                    val giroPlayer = readln().toIntOrNull()
                    checkNotNull(giroPlayer) {"Número inválido. Digite um número inteiro."}
                    if (giroPlayer !in 1..6) {
                        throw IllegalArgumentException("ERRO: giroPlayer não está entre 1 e 6")
                    }
                    return (giroPlayer)
                } catch (e: IllegalStateException) {
                    println(e.message)
                    continue
                } catch (e: IllegalArgumentException) {
                    println(e.message)
                    continue
                }
            }

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
            println("-".repeat(50))
            partidas.last().forEach { (key, value) ->
                if (key != "Resultado") {
                    println("$key rolou $value")
                } else {
                    println("$key = $value")
                }
            }
            println("-".repeat(50))
        }

        fun getVitoriasPlayer(): Int {
            return partidas.filter { it["Resultado"] == "Player Wins"}.size
        }


        private fun jogarDadoCPU(): Int {
            return Random.nextInt(1, 7)
        }
    }

    val jogo = DadoGame()
    jogo.jogar()

}