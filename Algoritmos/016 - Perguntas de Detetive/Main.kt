import kotlin.system.exitProcess

fun main() {
        Detetive.entrada()
    }


object Detetive {
    val perguntas = arrayOf("Telefonou para a vítima?", "Esteve no local do crime?",  "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?")

    fun entrada() {
        for (pergunta in perguntas) {
            print("$pergunta ([1] Sim [2] Não [0] Encerrar programa):  ")
            val resposta = Leitor.lerNumero()
        }
    }
}

object Leitor {
    private const val MAX_TENTATIVA = 5
    private var tentativa = 0

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean ) {
        while (tentativa != MAX_TENTATIVA) {
            val entrada = readln()
            if (!validacao(entrada)) print(mensagem)
            tentativa++
        }
        throw MaximoDeTentativasAtingido()
    }

    fun lerNumero() {
        val numero = lerEntrada("Resposta inválida. Digite um número inteiro de 0, 1, 2: ") {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero in setOf(0, 1, 2)
        }
    }
}

class MaximoDeTentativasAtingido: Exception("Você atingiu o número máximo de tentativas. Programa encerrado.")
