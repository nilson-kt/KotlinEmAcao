import kotlin.system.exitProcess

fun main() {
        Detetive.rodarPrograma()
    }


object Detetive {
    val perguntas = arrayOf("Telefonou para a vítima?", "Esteve no local do crime?",  "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?")

    val respostas = mutableListOf<Int>()

    var pontos = 0

    var classificacao = ""

    fun entrada() {
        for (pergunta in perguntas) {
            print("$pergunta ([1] Sim [2] Não [0] Encerrar programa):  ")
            val resposta = Leitor.lerResposta()
            if (resposta == 0) exitProcess(0) else respostas.add(resposta)
        }
    }

    private fun processamento() {
        respostas.forEach { if (it == 1) pontos++ }
        classificacao = when (pontos) {
            2 -> "suspeito"
            3, 4 -> "cúmplice"
            5 -> "assassino"
            else -> "inocente"
        }
    }

    fun saida() {
        println("Você é $classificacao")
    }

    fun rodarPrograma() {
        entrada()
        processamento()
        saida()
    }
}

object Leitor {
    private const val MAX_TENTATIVA = 5
    private var tentativa = 0

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean ): String {
        while (tentativa != MAX_TENTATIVA) {
            val entrada = readln()
            if (!validacao(entrada)) print(mensagem) else return entrada
            tentativa++
        }
        throw MaximoDeTentativasAtingido()
    }

    fun lerResposta(): Int {
        return lerEntrada("Resposta inválida. Digite um número inteiro de 0, 1, 2: ") {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero in setOf(0, 1, 2)
        }.toInt()
    }
}

class MaximoDeTentativasAtingido: Exception("Você atingiu o número máximo de tentativas. Programa encerrado.")
