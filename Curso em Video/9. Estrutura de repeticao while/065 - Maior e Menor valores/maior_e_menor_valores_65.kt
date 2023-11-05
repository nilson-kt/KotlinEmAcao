/**
 * Programa que lê vários números inteiros pelo teclado e mostra a média entre todos
 * os valores e qual foi o maior e o menor valores lidos. O programa pergunta ao usuário
 * se ele quer ou não continuar a digitar valores.
 */

import java.util.Locale

fun main() {
    var resposta = "S"
    var qntNumeros = 0
    var soma = 0
    var maior = 0
    var menor = 0
    while (resposta == "S") {
        print("Digite um número: ")
        val numero = readln().toInt()
        ++qntNumeros
        if (qntNumeros == 1) menor = numero
        soma += numero
        if (numero > maior) maior = numero
        if (numero < menor) menor = numero
        print("Deseja continuar? [S/N]: ")
        resposta = readln().trim().uppercase()
        while (resposta !in "NS" || resposta == "") {
            print("Opção inválida. ")
            print("Deseja continuar? [S/N]: ")
            resposta = readln().trim().uppercase()
        }
    }
    val media = soma.toFloat() / qntNumeros.toFloat()
    println("Quantidade de números: $qntNumeros")
    println("Maior número: $maior")
    println("Menor número: $menor")
    print("Média entre os números: ${String.format(Locale.US, "%.2f", media)}")
}
