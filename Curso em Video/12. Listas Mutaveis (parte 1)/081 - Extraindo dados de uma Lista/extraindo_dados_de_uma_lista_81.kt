/**
 * Este programa permite que o usuário insira números e os armazene em uma lista. O programa
 * continuará solicitando números até que o usuário escolha parar. Uma vez que a entrada de
 * números é concluída, o programa fornece as seguintes informações:
 * 1. A quantidade total de números digitados.
 * 2. A lista dos números digitados, classificados em ordem decrescente.
 * 3. Se o valor '5' está na lista e, em caso afirmativo, quantas vezes ele aparece na lista.
 */

fun main() {
    val listaNumeros = mutableListOf<Int>()
    while (true) {
        var resposta = ""
        print("Digite um número: ")
        val numero = readln().toInt()
        listaNumeros.add(numero)
        while (resposta !in "SsNn" || resposta == "") {
            print("Deseja continuar? [S/N]: ")
            resposta = readln().trim()
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        }
        if (resposta in "Nn") break
    }
    println("-=".repeat(35))
    println("Quantidade de números digitados: ${listaNumeros.size}")
    println("A lista, em ordem decrescente: ${listaNumeros.sortedDescending()}")
    if (5 in listaNumeros) {
        print("Sobre o valor 5: está na lista e apareceu ${listaNumeros.count{it == 5}} vez(es).")
    } else {
        print("Sobre o valor 5: não está na lista.")
    }
}
