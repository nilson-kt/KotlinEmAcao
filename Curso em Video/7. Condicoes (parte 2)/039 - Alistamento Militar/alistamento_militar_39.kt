/**
 * Programa que lê o ano de nascimento de uma pessoa e exibe na tela
 * se a pessoa precisa ou não se alistar. O programa também mostra
 * o tempo que falta para se alistar, se já passou do prazo ou ou não,
 * de alistamento.
 */

import java.time.LocalDate
import kotlin.math.abs

fun main() {
    print("Digite o seu ano de nascimento: ")
    val anoNascimento = readln().toInt()
    val anoAtual = LocalDate.now().toString().split("-")[0].toInt()
    val idade = anoAtual - anoNascimento
    val anoAlistamento = (anoAtual - idade) + 18
    val tempoDeAlistar = abs(anoAlistamento - anoAtual)
    if (idade == 18) {
        print("Você tem $idade anos. Você deve se alistar esse ano!")
    } else if (idade > 18) {
        print("Você tem $idade anos. Você deveria ter se alistado em $anoAlistamento. ")
        print("Passou do prazo faz $tempoDeAlistar anos!")
    } else {
        print("Você só precisará se alistar quando tiver 18 anos. ")
        print("Você tem $idade anos. Falta $tempoDeAlistar ano(s) ")
        print("para chegar à data de alistamento ($anoAlistamento).")
    }
}
