/**
 * Programa que lê o primeiro termo e a razão de uma progressão
 * aritmética e exibe os 10 primeiros termos dessa progressão.
 */

fun main() {
    print("Digite o primeiro termo: ")
    var termoInicial = readln().toInt()
    print("Digite a razão: ")
    val razao = readln().toInt()
    for (numero in 1..10) {
        print("$termoInicial > ")
        termoInicial += razao
    }
    print("Acabou!")
}
