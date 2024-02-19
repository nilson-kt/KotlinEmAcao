/**
 * Este programa cria uma matriz 3x3, solicita ao usuário que insira valores para cada elemento da matriz
 * e, em seguida, exibe a matriz formatada com os valores inseridos.
 * 
 * Após a exibição da matriz, o programa exibe a soma de todos os números pares digitados, a soma
 * dos valores da terceira coluna e, por último, exibe-se o maior valor da segunda linha.
 */

fun main() {
    val lista = mutableListOf<MutableList<Int>>(
        mutableListOf(),
        mutableListOf(),
        mutableListOf()
    )
    var somaPar = 0
    var somaColuna3 = 0
    var maiorLinha2 = 0
    for (contador in 0..2) {
        for (contador2 in 0..2) {
            print("Digite um valor para [$contador, $contador2]: ")
            lista[contador].add(readln().toInt())
        }
    }
    println("=".repeat(50))
    for (contador in 0..2) {
        for (contador2 in 0..2) {
            val numero = lista[contador][contador2]
            print("[   ${numero.toString().padEnd(3)} ] ")
            if (numero % 2 == 0) somaPar += numero
            if (contador2 == 2) somaColuna3 += numero
            if (contador == 1 && numero > maiorLinha2) maiorLinha2 = numero
        }
        println()
    }
    println("=".repeat(50))
    println("Soma de todos os números pares: $somaPar")
    println("Soma dos valores da terceira coluna: $somaColuna3")
    print("Maior valor da segunda linha: $maiorLinha2")
}
