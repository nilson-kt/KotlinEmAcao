fun main() {
    val valores = Menu.lerValores()
    val operacao = Menu.escolherOpcao()

    println("A ${operacao?.nome} entre ${valores.first} e ${valores.second} é igual " +
            "a: ${operacao?.calcula(valores.first, valores.second)}")
}

object Menu {
    private val painel = """
        1 - Soma
        2 - Subtração
        3 - Multiplicação
        4 - Divisão
    """.trimIndent()

    private fun exibirPainel() {
        println(painel)
    }

    fun lerValores(): Pair<Double, Double> {
        print("Digite o 1º valor: ")
        val a = readln().toDouble()
        print("Digite o 2º valor: ")
        val b = readln().toDouble()
        println("-".repeat(40))
        return Pair(a, b)
    }

    fun escolherOpcao(): OperacaoMatematica? {
        exibirPainel()
        println("Digite uma opção: ")
        val opcao = readln().toInt()
        val operacao = when (opcao) {
            1 -> Soma
            2 -> Subtracao
            3 -> Multiplicacao
            4 -> Divisao
            else -> null
        }
        return operacao
    }
}

interface OperacaoMatematica {
    val nome: String
    fun calcula(a: Double, b: Double): Number
}

object Soma : OperacaoMatematica {
    override val nome: String
        get() = "Soma"

    override fun calcula(a: Double, b: Double): Number {
        return a+b
    }
}

object Subtracao : OperacaoMatematica {
    override val nome: String
        get() = "Substração"

    override fun calcula(a: Double, b: Double): Number {
        return a-b
    }
}

object Multiplicacao : OperacaoMatematica {
    override val nome: String
        get() = "Multiplicação"

    override fun calcula(a: Double, b: Double): Number {
        return a*b
    }
}

object Divisao : OperacaoMatematica {
    override val nome: String
        get() = "Divisão"

    override fun calcula(a: Double, b: Double): Number {
        return a/b
    }
}