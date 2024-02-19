/**
 * Este programa contém uma função principal (main) que demonstra o uso da função personalizada
 * 'escreva'.
 *
 * A função 'escreva' recebe uma mensagem como parâmetro, adiciona uma moldura decorativa e a
 * imprime no console. A mensagem é centralizada dentro da moldura.
 */

fun main() {
    escreva("Curso em Vídeo Python Guanabara")
    escreva("Prática de Kotlin")
    escreva("KotlinEmAcao")
}

fun escreva(msg: String) {
    val tamanhoMsg = msg.length + 5
    println("~".repeat(tamanhoMsg))
    println(msg.padStart(tamanhoMsg - 2))
    println("~".repeat(tamanhoMsg))
}
