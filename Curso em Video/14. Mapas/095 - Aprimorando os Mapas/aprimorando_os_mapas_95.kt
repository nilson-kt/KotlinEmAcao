/**
 * Este programa permite ao usuário registrar informações sobre jogadores de futebol,
 * incluindo o nome do jogador, o número de partidas jogadas e os gols marcados em cada partida.
 *
 * Após a entrada, o programa exibe uma tabela com a ID de cada jogador, seus nomes, os gols que
 * fizeram em cada partida e a soma de todos os gols.
 *
 * Depois da tabela, o programa solicita um código para que o usuário possa consultar o registro de
 * um jogador. Ao fazer uma consulta, o usuário pode visualizar o número de gols marcados em cada
 * partida.
 *
 * Nota: O programa continuará solicitando códigos de jogador para consulta até que o usuário digite a
 * flag "999" para encerrar o programa.
 */

fun main() {
    val listaJogadores = mutableListOf<MutableMap<String, Any>>()
    while (true) {
        val mapaJogador = mutableMapOf<String, Any>()
        val listaGols = mutableListOf<Int>()
        print("Nome do Jogador: ")
        mapaJogador["Nome"] = readln()
        print("Número de partidas jogadas: ")
        val numeroPartidasJogadas = readln().toInt()
        for (contador in 1..numeroPartidasJogadas) {
            print("Quantos gols na partida $contador?: ")
            val numeroGols = readln().toInt()
            listaGols.add(numeroGols)
        }
        mapaJogador["Gols"] = listaGols
        mapaJogador["Total"] = listaGols.sum()
        listaJogadores.add(mapaJogador.toMutableMap())
        var resposta: String?
        do {
            print("Deseja continuar [S/N]: ")
            resposta = readlnOrNull()?.trim()
            if (resposta.isNullOrEmpty() || resposta !in "SsNn") print("Opção inválida. ")
        } while (resposta.isNullOrEmpty() || resposta !in "SsNn")
        if (resposta in "Nn") break
    }
    println("-=".repeat(40))
    for ((indice, jogador) in listaJogadores.withIndex()) {
        if (indice == 0) {
            println("cod " + "nome".padEnd(18) + "gols".padEnd(20) + "total")
            println("-".repeat(50))
        }
        println("$indice ".padStart(4) + "${jogador["Nome"]}".padEnd(18) +
                "${jogador["Gols"]}".padEnd(20) + jogador["Total"])
    }
    println("-".repeat(50))
    while (true) {
        var resposta: Int?
        do {
            print("Mostrar dados de qual jogador? (999) para parar: ")
            resposta = readln().toIntOrNull()
            if (resposta != null) {
                if (resposta == 999) {
                    println("-".repeat(55))
                    print("Programa Encerrado.")
                    break
                } else if (resposta > listaJogadores.size-1 || resposta < 0) {
                    println("ERRO! Não existe jogador com o código $resposta! Tente novamente.")
                }
            } else {
                println("ERRO! Resposta nula. Digite um código de algum jogador.")
            }
            println("-".repeat(55))
        } while (resposta == null || resposta > listaJogadores.size-1 || resposta < 0)
        if (resposta == 999) break
        for ((indice, gol) in (listaJogadores[resposta!!]["Gols"] as List<*>).withIndex()) {
            if (indice == 0) println("*** LEVANTAMENTO DO JOGADOR ${listaJogadores[resposta]["Nome"]}")
            println("No jogo ${indice+1} fez $gol gols.")
        }
        println("-".repeat(55))
    }
}
