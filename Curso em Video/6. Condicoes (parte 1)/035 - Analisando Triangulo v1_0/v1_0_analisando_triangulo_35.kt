/**
 * Programa que lê três segmentos de reta e exibe na tela
 * se, com eles, é possível formar um triângulo.
 */

import kotlin.math.abs

fun main() {
    print("Digite o valor da primeira reta: ")
    val r1 = readln().toFloat()
    print("Digite o valor da segunda reta: ")
    val r2 = readln().toFloat()
    print("Digite o valor da terceira reta: ")
    val r3 = readln().toFloat()
    if (abs(r2-r3) < r1 && r1 < (r2+r3) && abs(r1-r3) < r2 && r2 < (r1+r3) && abs(r1-r2) < r3 && r3 < (r1+r2)) {
        print("É POSSÍVEL formar um triângulo!")
    } else {
        print("NÃO é possível formar um triângulo!")
    }
}
