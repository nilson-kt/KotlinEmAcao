import kotlin.system.exitProcess

fun main() {
    val vetor = arrayOf("Telefonou para a vítima?", "Esteve no local do crime?",  "Mora perto da vítima?",
        "Devia para a vítima?", "Já trabalhou com a vítima?")
    for (pergunta in vetor) {
        print("$pergunta [1] Sim [2] Não")
        val resposta = readln().toIntOrNull() ?: loop(pergunta)
    }
}

fun loop(pergunta: String): Int {
    do {
        print("Resposta inválida. Digite 1 para Sim e 2 para Não ou digite 0 para passar para a próxima pergunta: ")
        val resposta = readln().toInt()
        if (resposta in setOf(1, 2)) return resposta
    } while (resposta != 0)
    println("Programa encerrado.")
    exitProcess(0)
}