import kotlin.system.exitProcess

fun main() {
    val vetor = arrayOf("Telefonou para a vítima?", "Esteve no local do crime?",  "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?")
    var pontos = 0
    for (pergunta in vetor) {
        do {
            print("$pergunta ([1] Sim [2] Não [0] Encerrar programa):  ")
            val resposta = readln().toIntOrNull()
            when (resposta) {
                null -> println("Digite um número inteiro 0, 1, 2.")
                !in setOf(0, 1, 2) -> println("Opção inválida.")
                0 -> exitProcess(0)
                1 -> pontos++
            }
        } while (resposta !in setOf(0, 1, 2))
    }
}

