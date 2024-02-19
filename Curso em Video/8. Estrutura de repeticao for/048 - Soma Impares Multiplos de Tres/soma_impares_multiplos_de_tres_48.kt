/**
 * Programa que calcula e exibe na tela a soma de todos os números ímpares
 * que são múltiplos de 3 e que se encontram no intervalo de 1 até 500.
 */

fun main() {
    var contador = 0
    var soma = 0
    for (numero in 1..<501) if (numero % 2 != 0 && numero % 3 == 0) {
        soma += numero
        ++contador
    }
    print("A soma dos $contador valores é igual a $soma")
}
