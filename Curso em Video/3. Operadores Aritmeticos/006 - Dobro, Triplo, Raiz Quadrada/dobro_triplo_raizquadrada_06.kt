// Programa que lê um número e exibe na tela o seu dobro, triplo e sua raiz quadrada.

import kotlin.math.sqrt

fun main() {
    print("Digite um número qualquer: ")
    val numero = readln().toDouble()
    println("Dobro: ${numero*2}")
    println("Triplo: ${numero*3}")
    println("Raiz quadrada: ${sqrt(numero)}")
}