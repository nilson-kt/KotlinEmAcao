/**
 * Este programa solicita ao usuário que insira cinco números e os armazena em uma lista.
 * Após a entrada dos números, o programa exibe a lista com os números organizados em ordem
 * crescente.
 */

fun main() {
    val listaNumeros = mutableListOf<Int>()
    for (contador in 1..5) {
        print("Digite o ${contador}º número: ")
        val numero = readln().toInt()
        if (contador == 1) {
            listaNumeros.add(numero)
            println("O número foi adicionado ao final da lista...")
        } else {
            for (valorDaLista in listaNumeros) {
                val posicao = listaNumeros.indexOf(valorDaLista)
                if (valorDaLista > numero) {
                    listaNumeros.add(listaNumeros.indexOf(valorDaLista), numero)
                    println("O número foi adicionado à posição $posicao...")
                    break
                } else if (numero > listaNumeros.max()) {
                    listaNumeros.add(numero)
                    println("O número foi adicionado ao final da lista...")
                    break
                }
            }
        }
    }
    println("-=".repeat(30))
    print("Os valores digitados em ordem foram: $listaNumeros")
}
