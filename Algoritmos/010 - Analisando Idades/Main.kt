fun main() {
    try {
        AnalisadorDeIdades.rodarPrograma()
    } catch (e: MaxTentativasExcedidasException) {
        println(e.message)
    }
}

object AnalisadorDeIdades {
    private const val NUMERO_DE_PESSOAS = 8
    private const val LARGURA_LINHA_SEPARACAO = 40

    private fun entrarDados(): MutableList<Pessoa> {
        val candidatos = mutableListOf<Pessoa>()
        for (contador in 1..NUMERO_DE_PESSOAS) {
            print("Nome da ${contador}ª pessoa: ")
            val nome = Leitor.lerNome()
            print("Idade de $nome: ")
            val idade = Leitor.lerIdade()
            candidatos.add(Pessoa(nome, idade))
        }
        return candidatos
    }

    private fun analisarDados(candidatos: MutableList<Pessoa>): List<Any> {
        val mediaIdade = candidatos.sumOf { it.idade } / candidatos.size
        val posicoesComMaisDe25 = candidatos.indices.filter { candidatos[it].idade > 25}
        val maiorIdadeDigitada = candidatos.maxOf { it.idade }
        val posicoesMaiorIdade = candidatos.indices.filter { candidatos[it].idade == maiorIdadeDigitada}
        return listOf(mediaIdade, posicoesComMaisDe25, maiorIdadeDigitada, posicoesMaiorIdade)
    }

    private fun exibirInformacoes(analise: List<Any>) {
        val (mediaIdade, posicoesComMaisDe25, maiorIdadeDigitada, posicoesMaiorIdade) = analise
        println("-".repeat(LARGURA_LINHA_SEPARACAO))
        println("RESULTADO DA ANÁLISE DOS DADOS")
        println("-".repeat(LARGURA_LINHA_SEPARACAO))
        println("""
            Média das Idades: $mediaIdade
            Índices de Pessoas com Mais de 25 anos: $posicoesComMaisDe25
            Maior Idade Digitada: $maiorIdadeDigitada
            Índices de Pessoas Com a Maior Idade: $posicoesMaiorIdade
        """.trimIndent())
    }

    fun rodarPrograma() {
        exibirInformacoes(analisarDados(entrarDados()))
    }


}

data class Pessoa(val nome: String, val idade: Int)

object Leitor {
    private const val MAX_TENTATIVAS = 5

    object Mensagens {
        const val QNT_TENTATIVA_EXCEDIDA = "Você excedeu o número máximo de tentativas. O programa foi encerrado."
        const val NOME_INVALIDO = "Erro: Nome Inválido. Digite apenas letras e espaços: "
        const val IDADE_INVALIDA = "Erro: Idade Inválida. Digite apenas números inteiros acima de 0: "
    }

    private fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        var tentativas = 0
        while (tentativas != MAX_TENTATIVAS) {
            val entrada = readln().trim()
            if (!validacao(entrada)) {
                print(mensagem)
            } else {
                return entrada
            }
            tentativas++
        }
        println()
        throw MaxTentativasExcedidasException(Mensagens.QNT_TENTATIVA_EXCEDIDA)

    }

    fun lerNome(): String {
        val nome = lerEntrada(Mensagens.NOME_INVALIDO) { string ->
            string.all { it.isLetter() || it.isWhitespace() } && string.isNotEmpty()
        }
        return nome.split(" ").filter { it.isNotBlank() }.joinToString(" ")
    }

    fun lerIdade(): Int {
        return lerEntrada(Mensagens.IDADE_INVALIDA) {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero > 0
        }.toInt()
    }

}

class MaxTentativasExcedidasException(message: String) : Exception(message)