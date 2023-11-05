/**
 * Programa que lê o primeiro termo e a razão de uma progressão aritmética
 * e exibe na tela os 10 primeiros termos da P.A.
 */

fun main() {
    println("Gerador de P.A.")
    println("-=".repeat(15))
    print("Digite o primeiro termo: ")
    var primeiroTermo = readln().toInt()
    print("Digite a razão: ")
    val razao = readln().toInt()
    var contador = 10
    while (contador != 0) {
        print("$primeiroTermo > ")
        primeiroTermo += razao
        --contador
    }
    print("FIM")
}
