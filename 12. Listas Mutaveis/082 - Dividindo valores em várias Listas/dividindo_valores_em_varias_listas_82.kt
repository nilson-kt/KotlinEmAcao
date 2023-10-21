/**
 * Programa que permite ao usuário inserir números. O algoritmo continua solicitando números até que o
 * usuário escolha parar. À medida que o usuário fornece entradas, o valor digitado é adicionado a uma
 * lista. Após todas as entradas, o programa classifica esses números em duas listas separadas:
 * uma lista de números pares e outra lista de números ímpares. No final, todas as listas são exibidas na
 * tela.
 */

fun main() {
    val listaNumeros = mutableListOf<Int>()
    while (true) {
        var resposta = ""
        print("Digite um número: ")
        val numero = readln().toInt()
        listaNumeros.add(numero)
        while (resposta !in "SsNn" || resposta == "") {
            print("Deseja continuar [S/N]: ")
            resposta = readln().trim()
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        }
        if (resposta in "Nn") break
    }
    val listaPar = mutableListOf<Int>()
    val listaImpar = mutableListOf<Int>()
    for (numero in listaNumeros) {
        if (numero % 2 == 0 ) listaPar.add(numero) else listaImpar.add(numero)
    }
    println("Lista Geral dos Números: $listaNumeros")
    println("Lista dos Números Pares: $listaPar")
    print("Lista dos Números Ímpares: $listaImpar")
}
