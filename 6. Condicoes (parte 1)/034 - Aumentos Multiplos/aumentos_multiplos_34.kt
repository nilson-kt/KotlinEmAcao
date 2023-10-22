/**
 * Programa que lê um salário e mostra na tela o salário com
 * um aumento de 15% ou 10%.
 */

import java.util.Locale

fun main() {
    print("Digite o valor do seu salário: R$")
    val salario = readln().toFloat()
    val aumento: Double
    if (salario > 1250) {
        aumento = salario * 0.10
        println("O seu salário recebeu um aumento de 10%.")
    } else {
        aumento = salario * 0.15
        println("O seu salário recebeu um aumento de 15%.")
    }
    print("Seu salário passa a ser R$${String.format(Locale.US, "%.2f", salario+aumento)} reais")
}
