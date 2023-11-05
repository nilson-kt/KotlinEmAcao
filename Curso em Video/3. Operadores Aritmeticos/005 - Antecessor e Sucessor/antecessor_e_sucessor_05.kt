// Algoritmo que lê um número e exibe na tela o sucessor e o antecessor dele.

fun main() {
    print("Digite um número: ")
    val numero = readln().toInt()
    println("=".repeat(30))
    println("ANTECESSOR E SUCESSOR DE $numero")
    println("=".repeat(30))
    println("Antecessor: ${numero - 1}")
    println("Sucessor: ${numero + 1}")
}