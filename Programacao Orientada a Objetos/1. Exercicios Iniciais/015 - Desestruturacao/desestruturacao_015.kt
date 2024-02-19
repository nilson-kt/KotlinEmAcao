data class Aluno(var nome: String, var nota: Float)

fun main() {
    val listaAlunos = mutableListOf<Aluno>()
    for (contador in 1..3) {
        print("Nome do ${contador}º aluno: ")
        val nome = readln()
        print("Nota de $nome: ")
        val nota = readln().toFloat()
        listaAlunos.add(Aluno(nome, nota))
    }
    println("-".repeat(30))
    println(buildString {
        append("NOME".padEnd(15))
        append("NOTA")
    })
    for (aluno in listaAlunos) {
        val (nome, nota) = aluno
        println(buildString {
            append(nome.padEnd(15))
            append(nota)
        })
    }
}