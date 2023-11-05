/**
 * Programa que lê o primeiro termo e a razão de uma progressão aritmética
 * e exibe na tela os 10 primeiros termos.
 *
 * Ao finalizar a exibição dos 10 primeiros termos, o programa pergunta ao
 * usuário quantos termos a mais ele quer que sejam mostrador. O sistema
 * será encerrado quando o usuário responder que ele quer que sejam exibidos
 * 0 termos.
 */

fun main() {
    println("Gerador de P.A.")
    println("-=".repeat(15))
    var resposta = 10
    print("Digite o primeiro termo: ")
    var primeiroTermo = readln().toInt()
    print("Digite a razão: ")
    val razao = readln().toInt()
    var qntTermosMostrados = 10
    while (resposta != 0) {
        var contador = resposta
        while (contador != 0) {
            print("$primeiroTermo > ")
            primeiroTermo += razao
            --contador
        }
        println("PAUSA")
        print("Quantos termos você quer mostrar a mais?: ")
        resposta = readln().toInt()
        qntTermosMostrados += resposta
    }
    print("Progressão finalizada com $qntTermosMostrados termos mostrados.")
}
