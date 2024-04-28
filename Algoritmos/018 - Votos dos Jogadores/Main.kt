fun main() {
    Sistema.entrada()
    Sistema.processamento()
    val vetor = Array<Int>(3) { 0 }
}

data class Jogador(val nome: String, var voto: Int = 0, val porcentagem: Float = 0f) {

}

object Sistema {
    var totalVotos = 0
    val vetor = List(23) {Jogador("Jogador ${it+1}", 0, 0f)}

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
        println(vetor)

    }

    fun output() {

    }

}