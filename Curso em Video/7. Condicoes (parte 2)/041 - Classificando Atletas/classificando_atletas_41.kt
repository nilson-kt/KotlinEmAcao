/**
 * Programa que calcula a idade de uma pessoa baseada no nome e
 * exibe na tela a classificação em que a pessoa está na Confederação
 * Nacional de Natação (fictício).
 */

import java.time.LocalDate

fun main() {
    print("Digite seu ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val dataAtual = LocalDate.now().toString().split("-")[0].toInt()
    val idade = dataAtual - anoNascimento
    val classificacao = if (idade < 9) {
        "MIRIM"
    } else if (idade in 9..13) {
        "INFANTIL"
    } else if (idade in 14..18) {
        "JÚNIOR"
    } else if (idade in 19..25) {
        "SÊNIOR"
    } else {
        "MASTER"
    }
    println("Você tem $idade anos.")
    print("Sua classificação é $classificacao!")
}
