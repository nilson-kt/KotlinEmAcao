/**
 * Programa que lê o nome, idade e sexo de 4 pessoas e exibe a
 * média de idade do grupo, o nome do homem mais velho e a quantidade
 * de mulheres com menos de 20 anos.
 */

import java.util.Locale

fun main() {
    var somaIdade = 0.0F
    var maiorIdadeHomens = 0
    var homemMaisVelho = ""
    var qntMulherMenores20 = 0
    for (contador in 1..4) {
        println("""
            ===========
            ${contador}ª PESSOA
            ===========
        """.trimIndent())
        print("Nome: ")
        val nome = readln()
        print("Idade: ")
        val idade = readln().toInt()
        print("[1] Masculino [2] Feminino: ")
        val sexo = readln().toInt()
        if (idade > maiorIdadeHomens && sexo == 1) {
            maiorIdadeHomens = idade
            homemMaisVelho = nome
        } else if (idade < 20 && sexo == 2) {
            ++qntMulherMenores20
        }
        somaIdade += idade
    }
    val mediaIdade = somaIdade / 4
    println("A média de idade do grupo é ${String.format(Locale.US, "%.1f", mediaIdade)}")
    println("O homem mais velho é $homemMaisVelho, com $maiorIdadeHomens anos.")
    print("No total, há $qntMulherMenores20 mulher(es) com menos de 20 anos de idade.")
}
