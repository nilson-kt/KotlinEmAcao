/**
 * Programa que lê um ano e mostra na tela se ele é um ano bissexto ou não.
 */

fun main() {
    print("Digite um ano: ")
    val ano = readln().toInt()
    if (ano % 4 == 0 && ano % 100 != 0 || ano % 100 == 0 && ano % 400 == 0) {
        print("$ano é um ano bissexto!")
    } else {
        print("$ano não é um ano bissexto.")
    }
}
