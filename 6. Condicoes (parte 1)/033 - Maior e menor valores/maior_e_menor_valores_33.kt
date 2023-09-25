/**
 * Programa que lê três números e exibe qual é o maior e qual é o menor.
 */

fun main() {
    print("Primeiro número: ")
    val primeiroNumero = readln().toInt()
    print("Segundo número: ")
    val segundoNumero = readln().toInt()
    print("Terceiro número: ")
    val terceiroNumero = readln().toInt()
    var menorNumero = primeiroNumero
    var maiorNumero = primeiroNumero
    if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
        menorNumero = segundoNumero
    }
    if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
        menorNumero = terceiroNumero
    }
    if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
        maiorNumero = segundoNumero
    }
    if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
        maiorNumero = terceiroNumero
    }
    println("Maior número: $maiorNumero")
    print("Menor número: $menorNumero")
}
