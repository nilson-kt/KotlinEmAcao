/**
 * Programa que lê um número de 0 a 9999 e exibe na tela o milhar, a centena, dezena
 * e a unidade referente a esse número.
 */

fun main() {
    print("Digite um número de 0 a 9999: ")
    val numero = readln()
    val numeroModificado = "000$numero"
    val unidade = numeroModificado[numeroModificado.length-1]
    val dezena = numeroModificado[numeroModificado.length-2]
    val centena = numeroModificado[numeroModificado.length-3]
    val milhar = numeroModificado[numeroModificado.length-4]
    println("Unidade: $unidade")
    println("Dezena: $dezena")
    println("Centena: $centena")
    println("Milhar: $milhar")
}