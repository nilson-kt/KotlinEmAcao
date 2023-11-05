/**
 * Programa que lê a idade de 7 pessoas e exibe na tela a quantidade
 * de pessoas maiores de idade e de indivíduos que ainda não atingiram
 * a maioridade.
 */

import java.time.LocalDate

fun main(){
    var qntMaioresDeIdade = 0
    var qntMenoresDeIdade = 0
    val anoAtual = LocalDate.now().toString().split("-")[0].toInt()
    for (contador in 1..7) {
        print("Digite ano de nascimento da ${contador}ª pessoa: ")
        val anoNascimento = readln().toInt()
        val idade = anoAtual - anoNascimento
        if (idade >= 18) ++qntMaioresDeIdade else ++qntMenoresDeIdade
    }
    println("No total, $qntMaioresDeIdade são maiores de idade.")
    print("$qntMenoresDeIdade ainda não chegaram à maioridade.")
}
