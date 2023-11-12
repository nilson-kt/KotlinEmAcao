/**
 * Programa que lê um ano de nascimento fornecido pela entrada, calcula a idade e mostra se o voto é
 * obrigatório, opcional ou negado.
 */

import java.time.LocalDate

fun voto(anoNascimento: Int): String {
    /**
     * Faz o cálculo da idade com base no ano de nascimento fornecido pelo usuário e no ano atual
     * provido pelo sistema. Após isso, ela retorna se, mediante a idade, o voto eleitoral é obrigatório,
     * opcional ou negado.
     * @param anoNascimento Armazena o ano de nascimento como um número inteiro.
     * @return Retorna uma String que informa se o voto é obrigatório, opcional ou negado a depender da idade
     * calculada.
     */
    val anoAtual = LocalDate.now().toString().split("-")[0].toInt()
    val idade = anoAtual - anoNascimento
    val tipoVoto = if (idade in 18..<70) {
        "Com $idade anos: VOTO OBRIGATÓRIO."
    } else if (idade in 16..17 || idade > 70) {
        "Com $idade anos: VOTO OPCIONAL"
    } else {
        "Com $idade anos: VOTO NEGADO"
    }
    return tipoVoto
}

fun main () {
    /**
     * Função principal que solicita ao usuário seu ano de nascimento, chama a função voto
     * e imprime o resultado.
     */
    print("Em que ano você nasceu?: ")
    val anoNascimento = readln().toInt()
    val tipoVoto = voto(anoNascimento)
    print(tipoVoto)
}
