// Programa que lê o nome de 4 alunos e os exibe numa sequência aleatória.

fun main() {
    print("Primeiro aluno: ")
    val primeiroAluno = readln()
    print("Segundo aluno: ")
    val segundoAluno = readln()
    print("Terceiro aluno: ")
    val terceiroAluno = readln()
    print("Quarto aluno: ")
    val quartoAluno = readln()
    val listaAlunos = listOf(primeiroAluno, segundoAluno, terceiroAluno, quartoAluno)
    print("A ordem de apresentação será: " + listaAlunos.shuffled())
}
