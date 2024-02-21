import kotlin.system.exitProcess

fun main() {
    AnalisadorDeIdades.rodarPrograma()

}

object AnalisadorDeIdades {

    private fun entrarDados(): MutableList<Pessoa> {
        val candidatos = mutableListOf<Pessoa>()
        for (contador in 1..3) {
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
        val posicoesComMaisDe25 = candidatos.mapIndexedNotNull { index, pessoa ->
            if (pessoa.idade > 25) index else null}
        val maiorIdadeDigitada = candidatos.maxOf { it.idade }
        val posicoesMaiorIdade = candidatos.mapIndexedNotNull { index, pessoa ->
            if (pessoa.idade == maiorIdadeDigitada) index else null }
        return listOf(mediaIdade, posicoesComMaisDe25, maiorIdadeDigitada, posicoesMaiorIdade)
    }

    private fun exibirInformacoes(analise: List<Any>) {
        val (mediaIdade, posicoesComMaisDe25, maiorIdadeDigitada, posicoesMaiorIdade) = analise
        println("-".repeat(40))
        println("RESULTADO DA ANÁLISE DOS DADOS")
        println("-".repeat(40))
        println("""
            Média das Idades: $mediaIdade
            Posições com Pessoas com Mais de 25 anos: $posicoesComMaisDe25
            Maior Idade Digitada: $maiorIdadeDigitada
            Posições com Pessoas Com a Maior Idade: $posicoesMaiorIdade
        """.trimIndent())
    }

    fun rodarPrograma() {
        exibirInformacoes(analisarDados(entrarDados()))
    }


}

data class Pessoa(val nome: String, val idade: Int)

object Leitor {
    fun lerEntrada(mensagem: String, validacao: (String) -> Boolean): String {
        val MAX_TENTATIVAS = 5
        var tentativas = 0
        while (tentativas != 5) {
            val entrada = readln().trim()
            if (!validacao(entrada)) {
                print(mensagem)
            } else {
                return entrada
            }
            tentativas++
        }
        println("Você excedeu o número máximo de tentativas. O programa foi encerrado.")
        exitProcess(0)
    }

    fun lerNome(): String {
        val nome = lerEntrada("Erro. Digite apenas letras e espaços: ") { string ->
            string.all { it.isLetter() || it.isWhitespace() } && string.isNotEmpty()
        }
        return nome.split(" ").filter { it.isNotBlank() }.joinToString(" ")
    }

    fun lerIdade(): Int {
        return lerEntrada("Erro. Digite apenas números inteiros acima de 0: ") {
            val possivelNumero = it.toIntOrNull()
            possivelNumero != null && possivelNumero > 0
        }.toInt()
    }

}