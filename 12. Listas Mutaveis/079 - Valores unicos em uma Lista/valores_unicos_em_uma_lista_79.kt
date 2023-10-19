/**
 * Este programa permite que o usuário insira números inteiros únicos em uma lista.
 * Os números são solicitados repetidamente até que o usuário escolha não continuar.
 * O algoritmo verifica se o número fornecido já existe na lista antes de adicioná-lo.
 * Caso o valor já esteja presente, ele não é adicionado. No final, o programa
 * exibe a lista com os valores.
 */

fun main() {
    val listaValores = mutableListOf<Int>()

    while (true) {
        var resposta = ""
        print("Digite um número: ")
        val valor = readln().toInt()
        if (valor !in listaValores) {
            listaValores.add(valor)
            println("Valor adicionado com sucesso...")
        } else {
            println("Valor duplicado! Não vou adicionar...")
        }
        while (resposta !in "SsNn" || resposta == "") {
            print("Deseja continuar? [S/N]: ")
            resposta = readln().trim()
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        }
        if (resposta in "Nn") break
    }
    println("=-".repeat(30))
    print("Valores digitados: ${listaValores.sorted()}")
}
