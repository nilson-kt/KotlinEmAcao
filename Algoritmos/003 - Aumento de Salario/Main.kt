fun main() {
    AtualizadorDeSalario.rodarPrograma()
}

object AtualizadorDeSalario {

    private fun entrarDados(): Array<Any> {
        print("Digite o salário atual: ")
        val salarioAtual = readln().toFloat()
        print("Digite o sexo [M/F]: ")
        val sexo = readln().uppercase().trim()
        print("Digite o número de anos trabalhados na empresa: ")
        val qntAnosNaEmpresa = readln().toInt()
        return arrayOf(salarioAtual, sexo, qntAnosNaEmpresa)
    }


    private fun calcularNovoSalario(salarioAtual: Float, sexo: String, qntAnosNaEmpresa: Int): Array<Any> {
        val porcentagem = when (sexo) {
            "F" -> when {
                qntAnosNaEmpresa < 15 -> 0.05f
                qntAnosNaEmpresa <= 20 -> 0.12f
                else -> 0.23f
            }
            "M" -> when {
                qntAnosNaEmpresa < 20 -> 0.03f
                qntAnosNaEmpresa <= 30 -> 0.13f
                else -> 0.25f
            }
            else -> 1f
        }
        return arrayOf(salarioAtual * porcentagem + salarioAtual, porcentagem)
    }

    private fun exibirDados(novoSalario: Float, sexo: String, anosNaEmpresa: Int, porcentagem: Float) {
        val porcentagemString = "${(porcentagem * 100).toInt()}%"
        println("-".repeat(50))
        println("""
            Você é do sexo $sexo e trabalhou por $anosNaEmpresa anos, por isso obteve um aumento de $porcentagemString
            Seu novo salário é: ${String.format("R$%.2f", novoSalario)}
            """.trimIndent())
    }

    fun rodarPrograma() {
        val (salarioAtual, sexo, qntAnosNaEmpresa) = entrarDados()
        salarioAtual as Float; sexo as String; qntAnosNaEmpresa as Int
        val (novoSalario, porcentagem) = calcularNovoSalario(salarioAtual, sexo, qntAnosNaEmpresa)
        novoSalario as Float; porcentagem as Float
        exibirDados(novoSalario, sexo, qntAnosNaEmpresa, porcentagem)
    }
}
