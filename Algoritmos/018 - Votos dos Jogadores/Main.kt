fun main() {
    Sistema.rodar()
}

data class Jogador(val nome: String, var voto: Int = 0, var porcentagem: String = "") {

}

object Sistema {
    var totalVotos = 0
    val vetor = List(23) {Jogador("Jogador ${it+1}", 0, "")}
    lateinit var jogadoresVotados: List<Jogador>
    lateinit var melhorJogador: Jogador

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
        totalVotos = vetor.sumOf { it.voto }
        for (jogador in vetor) {
            jogador.porcentagem = "${((jogador.voto.toFloat() / totalVotos) * 100).toInt()}%"
        }
        jogadoresVotados = vetor.filter { it.voto != 0 }
        melhorJogador = vetor.maxBy { it.voto }

    }

    fun output() {
        println("Foram computados $totalVotos votos.")
        jogadoresVotados.forEach {
            println(buildString {
                append(it.nome.padEnd(14))
                append(it.voto.toString().padEnd(4))
                append(it.porcentagem)
            })
        }
        melhorJogador.run {
            println("O melhor jogador foi o ${this.nome}, com ${this.voto} votos, correspondnedo a ${this.porcentagem}" +
                    " do total de votos.")
        }
    }

    fun rodar() {
        entrada()
        processamento()
        output()
    }

}