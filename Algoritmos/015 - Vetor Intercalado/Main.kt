fun main() {
    println("Primeiro vetor: ")
    val lista1 = List(5) { print("Posição $it: "); readln() }
    println("Segundo vetor: ")
    val lista2 = List(5) { print("Posição $it: "); readln() }
    println("Terceiro vetor: ")
    println(lista1.zip(lista2).flatMap { it.toList() })
}
