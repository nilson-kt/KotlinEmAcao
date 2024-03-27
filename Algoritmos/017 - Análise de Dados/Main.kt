fun main() {
    val lista = mutableListOf<Int>()
    val entrada = readln().toIntOrNull().let {
        print("Dado inválido. Digite um número inteiro: ")

    }
    println(entrada)
}