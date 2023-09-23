/**
 * Programa que lê a distância de uma viagem em km e exibe na tela
 * o preço dessa viagem dependendo da distância que será percorrida.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main(){
    println("=".repeat(70))
    println("""
        O preço da passagem é de R$0.50 por km para viagens de até 200km.
        Para viagens acima de 200km, o valor cobrado é $0.45 por km.
    """.trimIndent())
    println("=".repeat(70))
    print("Qual a distância da viagem em km?: ")
    val distancia = readln().toInt()
    println("=".repeat(70))
    val valorViagem = if (distancia > 200) {
        0.45 * distancia
    } else {
        0.50 * distancia
    }
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    print("O valor da viagem fica: R$${formato.format(valorViagem)}")
}
