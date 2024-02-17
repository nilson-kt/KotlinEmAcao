fun main() {
    val lista = mutableListOf<Int>()
    for (contador in 0..14) {
        print("índice ${contador}: ")
        lista.add(readln().toIntOrNull() ?: 0)
    }
    println(lista)
    println("-".repeat(40))
    println("Segue abaixo os índices dos valores digitados que são múltiplos de dez:")
    lista.forEachIndexed { index, it ->
        if (it % 10 == 0) {
            print("$index ")
        }
    }
}