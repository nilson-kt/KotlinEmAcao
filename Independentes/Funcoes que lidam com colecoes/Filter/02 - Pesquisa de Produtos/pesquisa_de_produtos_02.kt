/**
 * Este programa permite aos usuários pesquisar produtos em uma lista.
 * Ele exibe uma lista de produtos disponíveis e solicita ao usuário a inserção de um termo de pesquisa.
 * O algoritmo responderá com os produtos que contêm o termo de pesquisa, ignorando maiúsculas e minúsculas.
 *
 * O programa continuará a pesquisar até que o usuário decida encerrá-lo digitando "999".
 */

fun main () {
    val produtos = listOf("Maçã", "Celular", "Televisão", "Caderno", "Chocolate", "Violão", "Boné",
        "Violino", "Flauta Doce", "Papel", "Livro", "Cama", "Sofá", "Maleta", "Notebook", "Lápis",
        "Caneta", "Máquina de Café")
    println("Lista de produtos: $produtos")
    println("-".repeat(100))
    while (true) {
        print("Pesquisar (999 para encerrar): ")
        val cheque = readln().trim().lowercase()
        if (cheque == "999") {
            println("-".repeat(100))
            print("Programa Encerrado.")
            break
        } else {
            println(produtos.filter { it.lowercase().contains(cheque) })
        }
    }
}
