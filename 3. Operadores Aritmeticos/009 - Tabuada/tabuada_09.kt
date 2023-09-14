// Programa que lê um número inteiro e exibe sua tabuada.

fun main() {
    println("""
        =============
        ===TABUADA===
        =============
    """.trimIndent())
    print("Digite um número inteiro para ver sua tabuada: ")
    val numero = readln().toInt()
    println("$numero x 1 = ${numero*1}")
    println("$numero x 2 = ${numero*2}")
    println("$numero x 3 = ${numero*3}")
    println("$numero x 4 = ${numero*4}")
    println("$numero x 5 = ${numero*5}")
    println("$numero x 6 = ${numero*6}")
    println("$numero x 7 = ${numero*7}")
    println("$numero x 8 = ${numero*8}")
    println("$numero x 9 = ${numero*9}")
    println("$numero x 10 = ${numero*10}")
}