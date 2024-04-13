fun main() {
    println(Sistema.listaJogadores)
    Sistema.entrada()
    println(Sistema.listaJogadores)

}

object Sistema {
    val listaJogadores = (1..23).associate { "Jogador $it" to 0 } as MutableMap<String, Int>
    var totalVotos = 0


    fun entrada() {
        while (true) {
            print("Digite um número entre 1 e 23 (0 para encerrar): ")
            when (val numero = readln().toIntOrNull()) {
                null -> println("Número inválido. Digite um número inteiro.")
                !in (0..23) -> println("Número inválido. Digite um número entre 1 e 23.")
                0 -> break
                else -> listaJogadores["Jogador $numero"] = listaJogadores["Jogador $numero"]!! + 1
            }
        }
    }

    fun processamento() {
        totalVotos = listaJogadores.values.sum()
        listaJogadores.entries.associate { "Porcentagem de Votos $it" to it}
    }

    fun saida() {

    }

}