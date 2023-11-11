/**
 * Programa que encontra o maior número em arrays de inteiros e o exibe.
 *
 * A função `maior` aceita um número variável de argumentos do tipo Int e imprime o maior número
 * encontrado.
 *
 * Além disso, exibe uma lista completa de valores, a quantidade total de valores informados e uma linha
 * divisória.
 *
 * @param numeros Uma array de números inteiros.
 * @return Nenhum valor é retornado. A função imprime as estatísticas na console.
 */

fun main() {
    maior(1, 3, 4, 5)
    maior(7, 10, 3)
    maior(9, 1, 5, 3, 8, 2, 3, 10)
    maior(0)

}

fun maior(vararg numeros: Int) {
    val quantidadeValores = numeros.size
    println(numeros.toList())
    println("Foram informados $quantidadeValores valores ao todo.")
    println("O maior número é: ${numeros.max()}")
    println("=".repeat(40))
}
