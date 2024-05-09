fun main() {
    Sistema.rodar()
}

data class Jogador(val nome: String, var voto: Int = 0, var porcentagem: String = "") {

}

object Sistema {
    private var totalVotos = 0
    private val vetor = List(23) {Jogador("Jogador ${it+1}", 0, "")}
    private lateinit var jogadoresVotados: List<Jogador>
    private lateinit var melhorJogador: Jogador

    private fun entrada() {
        while (true) {
            print("Digite um número entre 1 e 23 (0 para encerrar): ")
            when (val numero = readln().toIntOrNull()) {
                null -> println("Número inválido. Digite um número inteiro.")
                !in (0..23) -> println("Número inválido. Digite um número entre 1 e 23 para votar ou digite" +
                        " 0 para encerrar.")
                0 -> break
                else -> vetor[numero-1].voto++
            }
        }
    }

    private fun processamento() {
        totalVotos = vetor.sumOf { it.voto }
        for (jogador in vetor) {
            jogador.porcentagem = "${((jogador.voto.toFloat() / totalVotos) * 100).toInt()}%"
        }
        jogadoresVotados = vetor.filter { it.voto != 0 }
        melhorJogador = vetor.maxBy { it.voto }

    }

    private fun output() {
        println("-".repeat(40))
        println("RESULTADO DA VOTAÇÃO")
        println("-".repeat(40))
        println("Foram computados $totalVotos votos.")
        jogadoresVotados.forEach {
            println(buildString {
                append(it.nome.padEnd(14))
                append(it.voto.toString().padEnd(6))
                append(it.porcentagem)
            })
        }
        melhorJogador.run {
            println("O melhor jogador foi o ${this.nome}, com ${this.voto} votos, correspondendo a ${this.porcentagem}" +
                    " do total de votos.")
        }
    }

    fun rodar() {
        entrada()
        processamento()
        output()
    }

}