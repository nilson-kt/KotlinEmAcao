// Programa que lê o comprimento de um cateto oposto e de um cateto adjacente e exibe
// na tela o comprimento da hipotenusa.

import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Comprimento do cateto oposto: ")
    val catetoOposto = readln().toFloat()
    print("Comprimento do cateto adjacente: ")
    val catetoAdjacente = readln().toFloat()
    val comprimentoHipot = String.format("%.2f", sqrt(catetoOposto.pow(2)+catetoAdjacente.pow(2)))
    print("O comprimento da hipotenusa é: $comprimentoHipot")

}