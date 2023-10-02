/**
 * Programa que exibe na tela todos os números pares que estão no
 * intervalo entre 1 e 50.
 */

fun main() {
    for (numero in 1..50) {
        if (numero % 2 == 0) print("$numero ")
    }
}
