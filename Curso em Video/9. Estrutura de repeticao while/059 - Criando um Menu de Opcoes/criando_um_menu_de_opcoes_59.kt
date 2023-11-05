/**
 * Programa que lê dois valores e mostra na tela um menu com opções, como
 * somar, multiplicar, maior, novos números, sair do programa. O usuário poderá
 * interagir com o menu, escolhendo uma opção. Ao escolher uma opção, o
 * programa executará a função relacionada a ela.
 */


fun main() {
    print("Digite o primeiro número: ")
    var primeiroNumero = readln().toInt()
    print("Digite o segundo número: ")
    var segundoNumero = readln().toInt()
    var opcao = ""
    while (opcao != "5") {
        println(
            """${"=".repeat(30)}
            |[1] somar
            |[2] multiplicar
            |[3] maior
            |[4] novos números
            |[5] sair do programa
            |${"=".repeat(30)}
        """.trimMargin()
        )
        print("Opção: ")
        opcao = readln()
        when (opcao) {
            "1" -> {
                val soma = primeiroNumero + segundoNumero
                println("A soma entre $primeiroNumero e $segundoNumero é igual a $soma")
            }
            "2" -> {
                val produto = primeiroNumero * segundoNumero
                println("O produto entre $primeiroNumero e $segundoNumero é igual a $produto")
            }
            "3" -> {
                val maior = if (segundoNumero > primeiroNumero) segundoNumero else primeiroNumero
                println("O maior número é $maior")
            }
            "4" -> {
                print("Digite o primeiro valor: ")
                primeiroNumero = readln().toInt()
                print("Digite o segundo valor: ")
                segundoNumero = readln().toInt()
            }
            "5" -> {
                print("Tenha um ótimo dia. Volte sempre!")
            } else -> {
                println("Opção inválida. Digite uma opção de 1 a 5.")
            }
        }
    }
}
