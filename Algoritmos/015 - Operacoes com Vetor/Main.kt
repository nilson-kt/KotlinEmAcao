fun main() {
    val lista = mutableListOf<Any>(1, 2)
    adicionarElemento(lista, 3, 0)
    println(lista)

}


fun adicionarElemento(lista: MutableList<Any>, elemento: Any, posicao: Int = 0) {
    if (posicao == 0) lista.add(elemento) else lista.add(posicao, elemento)
}

fun removerEm(lista: MutableList<Any>, elemento: Any, posicao: Int) {
    lista.removeAt(posicao)
}

fun removerTodos(lista: MutableList<Any>, valor: Any) {
    lista.removeAll { it == valor}
}

fun gerarUnicidade(lista: MutableList<Any>): MutableList<Any> {
    return lista.distinct() as MutableList<Any>
}


