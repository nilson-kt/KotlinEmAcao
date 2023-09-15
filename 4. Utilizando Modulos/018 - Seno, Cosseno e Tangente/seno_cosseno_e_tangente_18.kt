// Programa que lê um ângulo e exibe o seu seno, cosseno e sua tangente.

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale
import kotlin.math.sin
import kotlin.math.cos
import kotlin.math.tan

fun main() {
    print("Digite um ângulo qualquer: ")
    val angulo = readln().toDouble()
    val anguloEmRadianos = Math.toRadians(angulo)
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    println("Seno: ${formato.format(sin(anguloEmRadianos))}")
    println("Cosseno: ${formato.format(cos(anguloEmRadianos))}")
    print("Tangente: ${formato.format(tan(anguloEmRadianos))}")
}
