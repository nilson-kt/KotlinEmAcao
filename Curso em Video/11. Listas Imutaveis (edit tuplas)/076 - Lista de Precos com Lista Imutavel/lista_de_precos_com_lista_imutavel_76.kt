/**
 * Este programa gera uma lista de preços. Cada produto é representado por um nome seguido
 * de seu preço. O programa formata a listagem, alinhando os nomes dos produtos à esquerda
 * e os preços à direita.
 */

import java.util.Locale

fun main() {
    val produtos = listOf("Lápis", 1.50, "Borracha", 2.00, "Caderno", 15.90, "Estojo", 25.00,
    "Transferidor", 4.20, "Compasso", 9.99, "Mochila", 120.32, "Canetas", 22.30, "Livro", 34.90)
    println("-".repeat(40))
    println("LISTAGEM DE PREÇOS")
    println("-".repeat(40))
    for (produto in produtos) {
        if (produto.toString().all { it.isLetter() })
            print("$produto".padEnd(30, '.'))
        else {
            println("R$${String.format(Locale.US, "%.2f", produto).padStart(7)}")
        }
    }
    print("-".repeat(40))
}
