/**
 * Programa que lê um número digitado pelo usuário e exibe-o por extenso.
 *
 * Obs.: o programa só aceita números entre 0 e 20.
 */

fun main() {
    val numerosPorExtenso = listOf("zero", "um", "dois", "três", "quatro", "cinco", "seis", "sete",
        "oito", "nove", "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis",
        "dezessete", "dezoito", "dezenove", "vinte")
    var numero = -1
    while (numero < 0 || numero > 20) {
        print("Digite um número entre 0 e 20: ")
        numero = readln().toInt()
        if (numero < 0 || numero > 20) {
            print("Esse número não está na lista. ")
        }
    }
    print("Número por extenso: ${numerosPorExtenso[numero]}")
}
