import kotlin.system.exitProcess

fun main() {


}

object AnalisadorDeIdades {

    fun entrarDados(): MutableList<Pessoa> {
        val candidatos = mutableListOf<Pessoa>()
        for (contador in 1..8) {
            print("Digite o nome da ${contador}ª pessoa: ")
            val nome = Leitor.lerNome()
            print("Digite a idade de $nome: ")
            val idade = Leitor.lerIdade()
            candidatos.add(Pessoa(nome, idade))
        }
        return candidatos
    }

    fun analisarDados(candidatos: MutableList<Pessoa>): List<Any> {
        return listOf<Any>(
            candidatos.run {
                val mediaIdade = this.sumOf { it.idade } / candidatos.size
                val posicoesComMaisDe20 = this.filter { it.idade > 25 }.map { indexOf(it) }
                val maiorIdadeDigitada = this.maxOf { it.idade }
                val posicoesMaiorIdade = this.filter { it.idade == maiorIdadeDigitada }.map { indexOf(it) }
            }
        )
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