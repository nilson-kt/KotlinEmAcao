/**
 * Programa que lê o nome completo de uma pessoa e exibe o seu primeiro
 * e último nome.
 */

fun main() {
    print("Digite seu nome completo: ")
    val nome = readln().trim().uppercase().split(" ")
    val primeiroNome = nome.first()
    val ultimoNome = nome.last()
    println("Primeiro nome: $primeiroNome")
    print("Último nome: $ultimoNome")
}
