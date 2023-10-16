/**
 * Programa que exibe informações sobre a Tabela do Brasileirão da Temporada de 2021.
 *
 * O programa inclui informações sobre os primeiros cinco colocados, os últimos 4 colocados,
 * e exibe os times em ordem alfabética. Também identifica a posição do time "Chapecoense".
 */

fun main() {
    val ranking = listOf("Atlético-MG", "Flamengo", "Palmeiras", "Fortaleza", "Corinthians", "Bragantino",
        "Fluminense", "América-MG", "Atlético-GO", "Santos", "Ceará SC", "Internacional", "São Paulo",
        "Athletico-PR", "Cuiabá", "Juventude", "Grêmio", "Bahia", "Sport Recife", "Chapecoense")
    println("Tabela do Brasileirão da Temporada de 2021")
    println("=".repeat(30))
    println("Primeiros cinco colocados:")
    for ((indice, time) in ranking.withIndex()) {
        println("${indice+1}º - $time")
        if (indice == 4) break
    }
    println("=".repeat(30))
    println("Últimos 4 colocados:")
    for (contador in 17..20) {
        println("${contador}º - ${ranking[contador-1]}")
    }
    println("=".repeat(30))
    println("Times em ordem alfabética:")
    println(ranking.sorted())
    println("=".repeat(30))
    print("O time Chapecoense está na ${ranking.indexOf("Chapecoense")+1}ª posição.")
}
