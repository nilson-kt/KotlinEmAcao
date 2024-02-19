/**
 * Este programa permite ao usuário digitar números inteiros repetidamente até que
 * o número 999 seja inserido. Em seguida, ele exibe a quantidade de números digitados
 * e a soma dos números inseridos, desconsiderando o 999.
 */

fun main() {
    var numero: Int
    var qntNumeros = 0
    var soma = 0
    while (true) {
        print("Digite um número: ")
        numero = readln().toInt()
        if (numero == 999) {
            break
        } else {
            ++qntNumeros
            soma += numero
        }
    }
    println("Quantidade de números: $qntNumeros")
    print("Soma: $soma")
}
