fun main() {
    Sistema.entrada()
    Sistema.processamento()

}

object Sistema {
    val listaJogadores = (1..23).associate { "Jogador $it" to Int}.toMutableMap()
    var totalVotos = 0


    fun entrada() {
        while (true) {
            print("Digite um número entre 1 e 23 (0 para encerrar): ")
            when (val numero = readln().toIntOrNull()) {
                null -> println("Número inválido. Digite um número inteiro.")
                !in (0..23) -> println("Número inválido. Digite um número entre 1 e 23.")
                0 -> break
                else -> listaJogadores["Jogador $numero"]
            }
        }
    }

    fun processamento() {
        println (listaJogadores.map { Pair(it, it)})

    }

    fun output() {

    }

}