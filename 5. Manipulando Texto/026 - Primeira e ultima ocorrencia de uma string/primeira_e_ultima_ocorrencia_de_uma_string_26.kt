/**
 * Programa que lê uma frase qualquer e mostra na tela:
 * -a quantidade de ocorrências da letra "A";
 * -a posição da primeira ocorrência;
 * -a posição da última ocorrência
 */

fun main() {
    print("Digite uma frase qualquer: ")
    val frase = readln().trim().uppercase()
    val quantidadeLetraA = frase.count{ it == 'A' }
    val posicaoInicialA = frase.indexOf("A") + 1
    val posicaoFinalA = frase.lastIndexOf("A") + 1
    println("Quantidade de ocorrências da letra \"A\": $quantidadeLetraA")
    println("Posição da primeira aparição: $posicaoInicialA")
    print("Posição da última aparição: $posicaoFinalA")
}