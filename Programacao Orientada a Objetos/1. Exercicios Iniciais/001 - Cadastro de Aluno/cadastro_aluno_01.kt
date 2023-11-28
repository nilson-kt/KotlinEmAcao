fun main() {
    class Aluno {
        var matricula = 0
        var nome = ""
        var notasProva = mutableListOf<Float>()
        var notaTrabalho = 0.0f
        var situacao = "Pendente"

        fun media(): Float {
            val somaNotasProvaPonderadas = notasProva.map { it * 2.5f }.sum()
            val somaNotaTrabalhoPonderada = notaTrabalho * 2
            return (somaNotasProvaPonderadas + somaNotaTrabalhoPonderada) / 7

        }

        fun final() {
            situacao = if (media() >= 5) "Aprovado" else "Reprovado"
        }
    }

    val estudante = Aluno()
    print("Nome do Aluno: ")
    val nome = readln()
    print("Matrícula: ")
    val matricula = readln().toInt()
    print("Primeira nota: ")
    val n1 = readln().toFloat()
    print("Segunda nota: ")
    val n2 = readln().toFloat()
    print("Nota do trabalho: ")
    val nTrabalho = readln().toFloat()

    estudante.nome = nome
    estudante.matricula = matricula
    estudante.notasProva = mutableListOf(n1, n2)
    estudante.notaTrabalho = nTrabalho

    val media = estudante.media()
    estudante.final()
    println("-".repeat(30))
    println("A média de ${estudante.nome} é: $media")
    println("O aluno está ${estudante.situacao}.")
}
