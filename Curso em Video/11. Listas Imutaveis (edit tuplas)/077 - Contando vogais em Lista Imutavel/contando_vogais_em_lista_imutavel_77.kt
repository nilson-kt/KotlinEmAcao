/**
 * Este programa analisa uma lista de palavras e identifica as vogais (A, E, I, O, U) em cada palavra.
 * Ele percorre a lista de palavras, converte cada palavra em maiúsculas e, em seguida, verifica cada letra
 * na palavra. Se a letra for uma vogal, ela é impressa. O programa produz a saída em formato tabular,
 * indicando as vogais encontradas em cada palavra.
 */

fun main() {
    val palavras = listOf("O", "sucesso", "e", "sobre", "ser", "consistente", "acreditar",
        "e", "nunca", "desistir")

    for (palavra in palavras) {
        print("Na palavra ${palavra.uppercase()}, temos: ")
        for (letra in palavra) {
            if (letra.uppercase() in "AIUEO") {
                print("$letra ")
            }
        }
        println()
    }
}
