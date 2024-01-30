import java.lang.IllegalStateException
import kotlin.random.Random

fun main() {
    JogoDaAdivinhacao.rodarMenu()


}

object JogoDaAdivinhacao {
    private val painel = """
        [1] Jogar
        [2] Sair
    """.trimIndent()

    object Computador {
        var pontos = 0
    }

    object Jogador {
        var pontos = 0
    }

    var opcao = 0

    fun exibirPainel() = println(painel)

    fun receberOpcao() {
        opcao = Leitor.lerOpcao("Digite uma opção: ")
    }

    fun processarOpcao() {
        when (opcao) {
            1 -> jogar()
            2 -> println("Saindo")
            0 -> println("Sem opção")
        }
    }

    fun rodarMenu() {
        exibirPainel()
        receberOpcao()
        processarOpcao()
    }


    fun jogar() {
        println("-".repeat(30))
        val numeroAleatorio = Random.nextInt(1, 10)
        println("O computador escolheu um número aleatório de 1 a 9. Tente adivinhar qual é!")
        val numeroUser = Leitor.lerNumero("Digite um número de 1 a 9: ")
        println("Você escolheu o número $numeroUser e o computador lançou o número $numeroAleatorio")
        if (numeroUser != numeroAleatorio) {
            Computador.pontos++
            println("Ponto para o computador!")
        } else {
            Jogador.pontos++
            println("Ponto para você!")
        }
    }


    
}

object Leitor {
    fun lerOpcao(frase: String): Int {
        var contadorDeInvalidade = 0
        while (true) {
            if (contadorDeInvalidade >= 2) contadorDeInvalidade = 0
            try {
                print(frase)
                val opcao = readln().toIntOrNull()
                checkNotNull(opcao) {"Opção inválida: digite um número inteiro."}
                if (opcao !in 1..2) {
                    println("Opção inválida: digite um número de 1 a 2")
                    contadorDeInvalidade++
                    continue
                }
                return opcao
            } catch(e: IllegalStateException) {
                println(e.message)
                contadorDeInvalidade++
                continue
            }
        }
    }

    fun lerNumero(frase: String): Int {
        while (true) {
            try {
                print(frase)
                val numero = readln().toInt()
                checkNotNull(numero) {"Número inválido. Digite um número inteiro"}
                if (numero !in 1..9) {
                    println("Número inválido. Digite um número de 1 a 9.")
                    continue
                }
                return numero
            } catch (e: IllegalStateException) {
                println(e.message)
                continue
            }
        }
    }
}