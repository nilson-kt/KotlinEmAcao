package poo

import kotlin.random.Random

fun main() {
    class Linha {
        var caractere = ""

        fun repetirLinha(tamanho: Int) {
            println(caractere.repeat(tamanho))
        }
    }

    class Aluno {
        var nome = ""
        var matricula = 0
        var notas = mutableListOf<Int>()

        fun gerarMatricula() {
            val numero = Random.nextInt(1000000, 5000000)
            matricula = numero
        }

        fun calcularMedia(): Float {
            return notas.sum().toFloat() / notas.size
        }

        fun verificarSituacao(media: Float): String {
            return if (media >= 5) "Aprovado" else "Reprovado"
        }
    }

    val linha = Linha()
    linha.caractere = "-"

    //Entrada
    val aluno1 = Aluno()
    print("Digite o nome de um aluno: ")
    aluno1.nome = readln()
    print("Digite a primeira nota: ")
    aluno1.notas.add(readln().toInt())
    print("Digite a segunda nota: ")
    aluno1.notas.add(readln().toInt())

    //Processamento
    val media = aluno1.calcularMedia()
    val situacao = aluno1.verificarSituacao(media)

    //Painel Informativo
    linha.repetirLinha(30)
    println("Dados - Matrícula ${aluno1.matricula}".padStart(23))
    linha.repetirLinha(30)
    println("Nome: ".padEnd(10) + aluno1.nome)
    println("Média: ".padEnd(10)  + "$media")
    println("Situação: ".padEnd(10) + situacao)
}
