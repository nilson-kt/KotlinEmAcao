import kotlin.math.truncate

fun main() {
    Sistema.entrada()
    Sistema.processamento()
    val vetor = Array<Int>(3) { 0 }
}

data class Jogador(val nome: String, var voto: Int = 0, var porcentagem: String = "") {

}

object Sistema {
    var totalVotos = 0
    val vetor = List(23) {Jogador("Jogador ${it+1}", 0, "")}

    fun entrada() {
        while (true) {
            print("Digite um número entre 1 e 23 (0 para encerrar): ")
            when (val numero = readln().toIntOrNull()) {
                null -> println("Número inválido. Digite um número inteiro.")
                !in (0..23) -> println("Número inválido. Digite um número entre 1 e 23.")
                0 -> break
                else -> vetor[numero-1].voto++
            }
        }
    }

    fun processamento() {
        val numeroVotos = vetor.sumOf { it.voto }
        for (jogador in vetor) {
            jogador.porcentagem = "${truncate((jogador.voto.toFloat() / numeroVotos) * 100)}%"
        }
        println(vetor)

        val jogadoresVotados = vetor.filter { it.voto != 0 }
    }

    fun output() {
    }

}