/**
 * Programa que lê um salário e mostra na tela o salário com
 * um aumento de 15% ou 10%.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    print("Digite o valor do seu salário: R$")
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    val salario = readln().toFloat()
    val aumento: Double
    if (salario > 1250) {
        aumento = salario * 0.10
        println("O seu salário recebeu um aumento de 10%.")
    } else {
        aumento = salario * 0.15
        println("O seu salário recebeu um aumento de 15%.")
    }
    print("Seu salário passa a ser R$${formato.format(salario+aumento)} reais")
}
