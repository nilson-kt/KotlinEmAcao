/**
 * Programa que lê o peso de cinco pessoas e exibe na tela
 * qual é o maior e o menor peso lido.
 */

import java.util.Locale

fun main() {
    var menorPeso = 0.0F
    var maiorPeso = 0.0F
    for (contador in 1..5) {
        print("Digite o peso da ${contador}ª pessoa (kg): ")
        val peso = readln().toFloat()
        if (contador == 1) menorPeso = peso else if (peso < menorPeso) menorPeso = peso
        if (contador == 1) maiorPeso = peso else if (peso > maiorPeso) maiorPeso = peso
    }
    println("O maior peso é ${String.format(Locale.US, "%.1f", maiorPeso)}")
    print("O menor peso é ${String.format(Locale.US, "%.1f", menorPeso)}")
}
