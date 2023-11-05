/**
 * Este programa permite ao usuário registrar alunos: seus nomes e as suas notas referentes aos semestres
 * do ano letivo.
 *
 * Após as entradas do usuário, o programa exibe uma tabela com um número de identificação de cada aluno,
 * bem como seu nome e sua média. Depois, é perguntado ao usuário de qual aluno ele deseja ver as notas. O
 * usuário deverá digitar o ID que corresponde ao aluno.
 *
 * Obs.: o programa continuará solicitando ao usuário um ID e exibindo as respectivas notas até que o
 * usuário digite "999".
 */

import java.util.Locale

fun main() {
    val ficha = mutableListOf<MutableList<Any>>()
    while (true) {
        print("Nome: "); val nome = readln()
        print("Nota 1: "); val nota1 = readln().toFloat()
        print("Nota 2: "); val nota2 = readln().toFloat()
        val media = (nota1 + nota2) / 2
        ficha.add(mutableListOf(nome, mutableListOf(nota1, nota2), media))
        var resposta: String
        do {
            print("Deseja continuar? [S/N]: ")
            resposta = readlnOrNull()?.trim() ?: ""
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        } while (resposta !in "SsNn" || resposta == "")
        if (resposta in "Nn") break
    }
    println("-=".repeat(30))
    println("No.".padEnd(5) + "NOME".padEnd(18) + "MÉDIA")
    println("_".repeat(30))
    for ((id, sublista) in ficha.withIndex()) {
        println("$id".padEnd(5) + "${sublista[0]}".padEnd(18) +
                String.format(Locale.US, "%.1f", sublista[2]).padStart(4))
    }
    println("_".repeat(30))
    while (true) {
        print("Deseja ver a nota de qual aluno? (999 interrompe): "); var id = readln().toInt()
        while ((id > ficha.size-1 || id < 0)  && id != 999) {
            print("O ID $id não corresponde a nenhum aluno. Digite um ID válido: ")
            id = readln().toInt()
        }
        if (id == 999) break
        println("As notas de ${ficha[id][0]} são ${ficha[id][1]}.")
    }
    println("-=".repeat(30))
    print("FIM DO PROGRAMA. ATÉ MAIS.")
}
