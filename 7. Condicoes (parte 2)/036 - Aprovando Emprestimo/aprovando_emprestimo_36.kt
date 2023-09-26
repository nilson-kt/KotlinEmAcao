/**
 * Programa que nega ou aceita um pedido de empréstimo para a compra
 * de uma casa, com base no valor do imóvel, no salário do comprador e
 * no tempo estabelecido para a quitação do empréstimo.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    print("Qual é o valor da casa?: R$")
    val valorCasa = readln().toFloat()
    print("Qual é o seu salário? R$")
    val salarioComprador = readln().toFloat()
    print("Em quantos anos você irá pagar?: ")
    val anos = readln().toInt()
    val anosEmMeses = anos * 12
    val mensalidade = valorCasa / anosEmMeses
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    print("Para pagar uma casa de R$${formato.format(valorCasa)}")
    println(", a prestação será de ${formato.format(mensalidade)}")
    if (mensalidade > salarioComprador * 0.30) {
        print("Empréstimo negado!")
    } else {
        print("O empréstimo pode ser concedido!")
    }
}
