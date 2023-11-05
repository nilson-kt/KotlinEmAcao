/**
 * Este programa solicita informações pessoais de um usuário, incluindo nome, ano de nascimento e
 * número da carteira de trabalho. Se a carteira estiver disponível (ou seja, diferente de 0),
 * informações adicionais, como ano de contratação e salário, são solicitadas.
 *
 * Com base nessas informações, o programa calcula a idade do usuário e estima a idade em que
 * o trabalhador se aposentará, considerando que a aposentadoria ocorra após 35 anos de trabalho a
 * partir do ano de contratação.
 *
 * Ao final, o programa exibe todas as informações coletadas.
 */

import java.time.LocalDate
import java.util.Locale
import kotlin.math.abs

fun main() {
    print("Nome: ")
    val nome = readln()
    print("Ano de Nascimento: ")
    val anoNascimento = readln().toInt()
    val anoAtual = LocalDate.now().toString().slice(0..3).toInt()
    print("Carteira de Trabalho: ")
    val ctps = readln().toInt()
    val mapa = mutableMapOf<String, Any>(
        "Nome" to nome,
        "Idade" to anoAtual - anoNascimento,
        "Carteira de Trabalho" to ctps
    )
    if (ctps != 0) {
        print("Ano de Contratação: ")
        val anoContratacao = readln().toInt()
        print("Salário: R$")
        val salario = readln().toFloat()
        mapa["Ano de Contratação"] = anoContratacao
        mapa["Salário"] = String.format(Locale.US, "%.2f", salario)
        mapa["Aposentadoria"] = abs((anoContratacao+35) - anoNascimento)
    }
    println("-=".repeat(50))
    println(mapa)
    for ((chave, valor) in mapa.entries) {
        println("- $chave tem o valor $valor")
    }
}
