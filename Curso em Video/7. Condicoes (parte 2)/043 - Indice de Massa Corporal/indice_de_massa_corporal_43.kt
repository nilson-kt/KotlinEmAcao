/**
 * Programa que pergunta o peso e a altura de uma pessoa, calcula
 * o IMC (Índice de Massa Corporal) e exibe, conforme esse índice,
 * se a pessoa está abaixo do peso, no peso ideal, em sobrepeso,
 * em obesidade ou em obesidade mórbida.
 */

import kotlin.math.pow
import java.util.Locale

fun main() {
    print("Qual é o seu peso? (kg): ")
    val peso = readln().toFloat()
    print("Qual é a sua altura? (m): ")
    val altura = readln().toFloat()
    val imc = peso / altura.pow(2)
    val status = if (imc < 18.5) {
        "Você está abaixo do peso!"
    } else if (imc in 25.0..30.0) {
        "Você está em sobrepeso!"
    } else if (imc in 30.0..40.0) {
        "Você está em obesidade!"
    } else if (imc > 40.0) {
        "Você está em obesidade mórdida! Cuidado!"
    } else {
        "PARABÉNS! Você está no peso normal!"
    }
    println("Seu IMC é ${String.format(Locale.US, "%.1f", imc)}")
    print(status)
}
