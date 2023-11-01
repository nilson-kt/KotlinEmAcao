/**
 * Este programa permite ao usuário registrar informações sobre um jogador de futebol,
 * incluindo o nome do jogador, o número de partidas jogadas e os gols marcados em cada partida.
 * Ele calcula o total de gols marcados pelo jogador e exibe os dados inseridos.
 */

fun main() {
    val mapa = mutableMapOf<String, Any>()
    val listaGols = mutableListOf<Int>()
    print("Nome do Jogador: ")
    mapa["Nome"] = readln()
    print("Número de partidas jogadas: ")
    mapa["Número de Partidas Jogadas"] = readln().toInt()
    var soma = 0
    for (contador in 0..<mapa["Número de Partidas Jogadas"] as Int) {
        print("Quantos gols na partida $contador?: ")
        val numeroGols = readln().toInt()
        listaGols.add(numeroGols)
        soma += numeroGols
    }
    mapa["Gols"] = listaGols
    mapa["Total de Gols"] = soma
    println("-=".repeat(40))
    println(mapa)
    println("-=".repeat(40))
    for ((chave, valor) in mapa.entries) {
        println("O campo $chave tem o valor $valor")
    }
    println("-=".repeat(40))
    println("O jogador ${mapa["Nome"]} jogou ${mapa["Número de Partidas Jogadas"]} partidas.")
    for ((indice, gols) in (mapa["Gols"] as List<*>).withIndex()) {
        println("=> Na partida $indice, fez $gols gols.")
    }
    print("Foi um total de ${mapa["Total de Gols"]} gols.")
}
