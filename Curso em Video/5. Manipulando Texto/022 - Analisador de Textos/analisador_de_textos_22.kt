// Programa que lê um nome completo e exibe na tela o mesmo nome em
// maiúsculo, minúsculo, bem como a quantidade de caracteres na String
// (desconsiderando os espaços) e o número de caracteres no primeiro nome.

fun main() {
    print("Olá! Tudo bem? Digite seu nome completo, por favor: ")
    val nome = readln().trim()
    println("Certo, agora faremos uma análise do seu nome: ")
    println("Em Maiúsculo: ${nome.uppercase()}")
    println("Em Minúsculo: ${nome.lowercase()}")
    val nomeListado = nome.split(" ")
    val numeroLetras = nomeListado.joinToString("").length
    println("Número de letras: $numeroLetras")
    println("Número de letras do primeiro nome: ${nomeListado[0].length}")
}