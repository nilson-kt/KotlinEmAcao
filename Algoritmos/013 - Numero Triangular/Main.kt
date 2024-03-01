fun main() {
    val numero = readln().toInt()
    val ax = (1..numero).filter { numero % it == 0 }
    val lista = (1..numero).filter { numero % it == 0 }.chunked(2) { (a, b) -> if (b > a+1) null else Pair(a, b)}
    val teste = lista.filterNotNull().map {it.toList()}.flatten()
    println(ax)
    println(teste.windowed(3))
    teste.windowed(3).forEach {
        print("$it == ")
        println(it.reduce{acc, a -> acc * a} )
    }

}
