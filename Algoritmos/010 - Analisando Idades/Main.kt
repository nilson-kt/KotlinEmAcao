import kotlin.system.exitProcess

fun main() {
    val idades = mutableListOf<Pair<String, Int>>()
    (1..8).forEach { contador ->
        print("Digite o nome da ${contador}ª pessoa: ")
        val nome = Leitor.lerNome()
        print("Digite a idade de $nome: ")
        val idade = readln().toInt()

    }
}

object AnalisadorDeIdades {

    fun entrarDados() {

    }

}

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
    }

}