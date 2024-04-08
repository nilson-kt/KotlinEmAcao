fun main() {
    println(Sistema.listaJogadores)
    Sistema.entrada()
    println(Sistema.listaJogadores)

}

object Sistema {
    val listaJogadores = (1..24).associate { "Jogador $it" to 0 } as MutableMap<String, Int>
    fun entrada() {
        do {
            print("Digite um número entre 1 e 23 (0 para encerrar): ")
            val numero = readln().toIntOrNull()
            when (numero) {
                null -> println("Número inválido. Digite um número inteiro.")
                !in (0..23) -> println("Número inválido. Digite um número entre 1 e 23.")
                else -> listaJogadores["Jogador $numero"]
            }
        } while (numero != null && numero != 0)
    }

}