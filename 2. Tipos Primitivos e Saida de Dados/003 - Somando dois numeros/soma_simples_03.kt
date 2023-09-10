// Programa que lê dois números fornecidos pelo usuário e exibe
// a soma entre eles.

fun main() {
    print("Digite o primeiro número: ")
    val numero1 = readln().toInt()
    print("Digite o segundo número: ")
    val numero2 = readln().toInt()
    print("A soma entre $numero1 e $numero2 é igual a ${numero1 + numero2}")
}