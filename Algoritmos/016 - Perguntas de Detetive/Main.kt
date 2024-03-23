import kotlin.system.exitProcess

fun main() {
        try {
            Detetive.rodarPrograma()
        } catch (e: MaximoDeTentativasAtingido) {
            println()
            println(e.message)
        }
    }

object Detetive {

    private val perguntas = arrayOf("Telefonou para a vítima?", "Esteve no local do crime?",  "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?")
    private val respostas = mutableListOf<Int>()
    private var pontos = 0
    private var classificacao = ""

    private fun entrada() {
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

    private fun saida() {
        println("=".repeat(40))
        println("Você respondeu sim a $pontos perguntas e, como resultado, você é $classificacao.")
    }

    fun rodarPrograma() {
        entrada()
        processamento()
        saida()
    }
}

object Leitor {

    object Mensagens {
        const val RESPOSTA_INVALIDA = "Resposta inválida. Digite um número inteiro de 0, 1, 2: "
    }

    private const val MAX_TENTATIVA = 5

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean ): String {
        var tentativa = 0
        while (tentativa != MAX_TENTATIVA) {
            val entrada = readln()
            if (!validacao(entrada)) print(mensagem) else return entrada
            tentativa++
        }
        throw MaximoDeTentativasAtingido()
    }

    fun lerResposta(): Int {
        return lerEntrada(Mensagens.RESPOSTA_INVALIDA) {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero in setOf(0, 1, 2)
        }.toInt()
    }
}

class MaximoDeTentativasAtingido: Exception("Você excedeu o número máximo de tentativas. Programa encerrado.")
