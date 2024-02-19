/**
 * Programa que lê dois números fornecidos pelo usuário e os exibe na tela. Caso a entrada seja inválida,
 * o programa continuará solicitando um número, até que o usuário forneça uma entrada válida.
 */

fun leiaInt(frase: String): Int {
    /** Exibe uma sequência de caracteres, solicita uma entrada ao usuário, aceitando somente
     * valores inteiros.
     * @param frase Uma string que vai ser mostrada na tela.
     * @return Um número inteiro.
     */
    while (true) {
        val numero: Int?
        print("Digite um número inteiro: ")
        try {
            numero = readlnOrNull()?.toIntOrNull()
            checkNotNull(numero)
        } catch (excecao: IllegalStateException) {
            println("ERRO! Número inteiro inválido.")
            continue
        }
        return numero
    }
}

fun leiaFloat(frase: String): Float {
    /** Exibe uma sequência de caracteres, solicita uma entrada ao usuário, aceitando somente
     * valores reais.
     * @param frase Uma string que vai ser mostrada na tela.
     * @return Um número float.
     */
    while (true) {
        val numero: Float?
        print("Digite um número real: ")
        try {
            numero = readlnOrNull()?.toFloatOrNull()
            checkNotNull(numero)
        } catch (excecao: IllegalStateException) {
            println("ERRO! Número real inválido.")
            continue
        }
        return numero
    }
}

fun main() {
    /**
     * Lê dois números e os exibe na tela.
     */
    val numeroInt = leiaInt("Digite um número: ")
    println("Você acabou de digitar o número $numeroInt.")
    val numeroFloat = leiaFloat("Digite um número: ")
    print("Você acabou de digitar o número $numeroFloat.")
}
