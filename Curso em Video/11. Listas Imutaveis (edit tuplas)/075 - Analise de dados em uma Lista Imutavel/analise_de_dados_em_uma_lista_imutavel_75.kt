/**
 * Este programa solicita ao usuário a inserção de 4 números em sequência. O valor de cada entrada
 * é armazenado em uma lista imutável. Em seguida, o programa realiza as seguintes operações:
 * 1. Verifica quantas vezes o número 9 aparece na lista e exibe o resultado.
 * 2. Determina se o número 3 está presente na lista e, se sim, exibe sua posição.
 * 3. Exibe os números pares digitados.
 */

fun main() {
    println("Digite 4 números em sequência: ")
    val listaNumeros = listOf(readln().toInt(), readln().toInt(), readln().toInt(), readln().toInt())
    val posicaoN3 = listaNumeros.indexOf(3)+1
    println("Valores digitados: $listaNumeros")
    println("O valor 9 apareceu ${listaNumeros.count{ it == 9}} vezes.")
    if (posicaoN3 != 0) {
        println("O valor 3 está na ${listaNumeros.indexOf(3)+1}ª posição")
    } else {
        println("O valor 3 não apareceu em nenhuma posição.")
    }
    print("Números pares digitados: ")
    for (numero in listaNumeros) {
        if (numero % 2 == 0) print("$numero ")
    }
}
