/**
 * Programa que lê uma string e vê se há o nome "Silva" dentro dela.
 */

fun main() {
    print("Digite seu nome: ")
    val nome = readln().uppercase()
    print("Tem \"SILVA\" no nome?: ${"SILVA" in nome}")
}
