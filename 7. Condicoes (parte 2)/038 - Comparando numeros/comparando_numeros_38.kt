/**
 * Programa que lê dois números e inteiros e mostra na tela qual
 * dos dois é o maior. Caso os valores sejam iguais, o programa
 * mostra que esses valores são iguais.
 */

fun main() {
    print("Digite o primeiro número: ")
    val primeiroNumero = readln().toInt()
    print("Agora, digite o segundo número: ")
    val segundoNumero = readln().toInt()
    if (segundoNumero > primeiroNumero) {
        print("O SEGUNDO valor é maior!")
    } else if (segundoNumero == primeiroNumero) {
        print("Os dois valores são IGUAIS!")
    } else {
        print("O PRIMEIRO valor é maior!")
    }
}
