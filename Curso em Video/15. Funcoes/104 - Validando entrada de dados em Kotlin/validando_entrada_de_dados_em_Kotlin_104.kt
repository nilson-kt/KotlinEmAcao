/**
 * Programa que lê um número fornecido pelo usuário. Caso a entrada não seja um número, o programa se
 * repetirá até que o usuário forneça uma entrada válida.
 */

fun leiaInt(frase: String): Int {
    /** Exibe uma sequência de caracteres, solicita uma entrada ao usuário, aceitando somente
     * valores inteiros e retorna o que foi digitado.
     * @param frase Uma string que vai ser mostrada na tela.
     * @return A entrada do usuário.
     */
    var conteudo: Int?
    do {
        print(frase)
        conteudo = readln().toIntOrNull()
        if (conteudo == null) println("ERRO! Digite um número inteiro.")
    } while (conteudo == null)
    return conteudo
}

fun main() {
    /**
     * Lê um número e o exibe na tela.
     */
    val numero = leiaInt("Digite um número: ")
    print("Você acabou de digitar o número $numero.")
}
