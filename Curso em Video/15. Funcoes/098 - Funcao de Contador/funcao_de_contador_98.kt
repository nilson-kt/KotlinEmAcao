/**
 * Este programa apresenta uma função principal (main) que realiza contagens de acordo com diferentes
 * argumentos na função invocada 'contador'.
 *
 * Essa função 'contador' é responsável por imprimir uma contagem progressiva ou regressiva, com um
 * intervalo específico entre os números.
 *
 * Além disso, a função aceita valores padrão para o parâmetro 'passo', assumindo 1 caso não seja
 * especificado. O usuário é incentivado a fazer uma contagem personalizada, fornecendo o início,
 * fim e passo desejados através da entrada do console.
 *
 */

import kotlin.math.abs

fun main() {
    contador(1, 10)
    contador(10, 0, 2)
    println("Agora é sua vez de fazer uma contagem personalizada!:")
    print("Início: ")
    val inicio = readln().toInt()
    print("Fim: ")
    val fim = readln().toInt()
    print("Passo: ")
    var passo = abs(readln().toInt())
    if (passo == 0) passo = 1
    contador(inicio, fim, passo)
}

fun contador(inicio: Int, fim: Int, passo: Int = 1) {
    println("=".repeat(30))
    fun pausa() {
        Thread.sleep(350)
    }

    if (inicio < fim) {
        for (contador in inicio..fim step passo) {
            print("$contador ")
            pausa()
        }
    } else if (inicio > fim) {
        for (contador in inicio downTo fim step passo) {
            print("$contador ")
            pausa()
        }
    }
    println("FIM !")
    println("=".repeat(30))
}
