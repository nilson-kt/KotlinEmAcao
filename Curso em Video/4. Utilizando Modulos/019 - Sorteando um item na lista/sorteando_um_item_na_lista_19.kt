// Programa que lê o nome de quatro alunos e exibe aleatoriamente o nome de um
// dos alunos.

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
    print("O aluno escolhido foi: " + listaAlunos.random())
}
