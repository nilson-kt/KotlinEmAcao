import kotlin.system.exitProcess

fun main() {
    AtualizadorDeSalario.rodarPrograma()
}

object AtualizadorDeSalario {

    private fun entrarDados(): Triple<Float, Sexo, Int> {
        print("Digite o salário atual (999 para encerrar): ")
        val salarioAtual = Leitor.lerSalario()
        print("Digite o sexo [M/F] (999) para encerrar): ")
        val sexo = Leitor.lerSexo()
        print("Digite o número de anos trabalhados na empresa (999) para encerrar: ")
        val qntAnosNaEmpresa = Leitor.lerAnosTrabalhados()
        return Triple(salarioAtual, sexo, qntAnosNaEmpresa)
    }


    private fun calcularNovoSalario(salarioAtual: Float, sexo: Sexo, qntAnosNaEmpresa: Int): Pair<Float, Float> {
        val porcentagem = when (sexo) {
            Sexo.F -> when {
                qntAnosNaEmpresa < 15 -> 0.05f
                qntAnosNaEmpresa <= 20 -> 0.12f
                else -> 0.23f
            }
            Sexo.M -> when {
                qntAnosNaEmpresa < 20 -> 0.03f
                qntAnosNaEmpresa <= 30 -> 0.13f
                else -> 0.25f
            }
        }
        return Pair(salarioAtual * porcentagem + salarioAtual, porcentagem)
    }

    private fun exibirDados(novoSalario: Float, sexo: Sexo, anosNaEmpresa: Int, porcentagem: Float) {
        val porcentagemString = "${(porcentagem * 100).toInt()}%"
        val sexoString = if (sexo == Sexo.M) "masculino" else "feminino"
        println("-".repeat(50))
        println("""
            Você é do sexo $sexoString e trabalhou por $anosNaEmpresa anos, por isso obteve um aumento de $porcentagemString
            Seu novo salário é: ${String.format("R$%.2f", novoSalario)}
            """.trimIndent())
    }

    fun rodarPrograma() {
        val (salarioAtual, sexo, qntAnosNaEmpresa) = entrarDados()
        val (novoSalario, porcentagem) = calcularNovoSalario(salarioAtual, sexo, qntAnosNaEmpresa)
        exibirDados(novoSalario, sexo, qntAnosNaEmpresa, porcentagem)
    }
}

object Leitor {

    private const val ENCERRAR_PROGRAMA = "999"

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        var tentativas = 0
        while (tentativas < MAX_TENTATIVAS) {
            try {
                val entrada = readln().trim()
                when (entrada) {
                    ENCERRAR_PROGRAMA -> {
                        println(Mensagens.MENSAGEM_ENCERRAR_PROGRAMA)
                        exitProcess(0)
                    } else -> {
                        if (!validacao(entrada)) throw IllegalArgumentException(mensagem)
                    }
                }
                return entrada
            } catch (e: IllegalArgumentException) {
                print("Erro: ${e.message}")
            }
            tentativas++
        }
        println("\n${Mensagens.MENSAGEM_MAX_TENTATIVAS}")
        exitProcess(0)
    }


    fun lerSalario(): Float {
        val mensagem = Mensagens.MENSAGEM_SALARIO_INVALIDO
        return lerEntrada(mensagem) {it.toFloatOrNull() != null}.toFloat()
    }

    fun lerSexo(): Sexo {
        val mensagem = Mensagens.MENSAGEM_SEXO_INVALIDO
        return lerEntrada(mensagem) { it.uppercase() in listOf("M", "F")}.uppercase().let {
            if (it == "M") Sexo.M else Sexo.F
        }
    }

    fun lerAnosTrabalhados(): Int {
        val mensagem = Mensagens.MENSAGEM_QNT_ANOS_INVALIDA
        return lerEntrada(mensagem) { it.toIntOrNull() != null}.toInt()
    }
}

enum class Sexo { M, F }

private const val MAX_TENTATIVAS = 5

object Mensagens {
    const val MENSAGEM_QNT_ANOS_INVALIDA = "Dado inválido. Digite um número inteiro. (999 para encerrar): "
    const val MENSAGEM_SEXO_INVALIDO = "Sexo inválido. Digite uma das opções [M/F]. (999 para encerrar): "
    const val MENSAGEM_SALARIO_INVALIDO = "Salário inválido. Digite um número. (999 para encerrar): "
    const val MENSAGEM_ENCERRAR_PROGRAMA = "Programa encerrado pelo usuário."
    const val MENSAGEM_MAX_TENTATIVAS = "Você excedeu o número máximo de tentativas. Programa encerrado."
}

