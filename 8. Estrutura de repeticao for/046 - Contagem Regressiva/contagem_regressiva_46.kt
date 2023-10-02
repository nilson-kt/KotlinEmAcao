/**
 * Programa que faz uma contagem regressiva de 10 a 0 e, no final,
 * apresenta uma mensagem que denota a explosão de fogos de artifício.
 */

fun main() {
    for (numero in 10 downTo 1) {
        println(numero)
        Thread.sleep(1000)
    }
    println(0)
    print("KABOOM!")
}
