/**
 * Programa que lê a velocidade de um carro (Km/h) e verifica se essa
 * velocidade está acima de 80 Km/h. Caso esteja, o programa exibe ao
 * usuário que ele ultrapassou o limite e que deve pagar uma multa de
 * 7 reais a cada kilômetro ultrapassado.
 * No final, o programa exibe uma mensagem de bom dia.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    println("=".repeat(45))
    println("RADAR ELETRÔNICO")
    print("Digite a velocidade do carro (km/h): ")
    val velocidadeCarro = readln().toInt()
    println("=".repeat(45))
    if (velocidadeCarro > 80) {
        val multa = ((velocidadeCarro - 80) * 7).toFloat()
        val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
        println("""
            Você ultrapassou 80km/h e, por isso, foi multado!
            Sua multa é equivalente ao valor de R$${formato.format(multa)} reais!
        """.trimIndent())
    }
    print("Tenha um bom dia, dirija com segurança.")
}
