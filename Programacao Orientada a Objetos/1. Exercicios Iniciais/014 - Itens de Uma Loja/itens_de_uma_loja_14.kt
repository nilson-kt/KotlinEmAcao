fun main() {
    println("-".repeat(30))
    println("LISTA DE ITENS DA LOJA")
    println("-".repeat(30))
    ItemLoja("Lápis")
    ItemLoja("Caderno")
    ItemLoja("Borracha")
    ItemLoja.listaItens.forEach {
        println("${it.id} ${it.nome}")
    }

}

data class ItemLoja(var nome: String) {
    val id: Int

    init {
        id = if (listaItens.firstOrNull() == null) {
            1
        } else {
            listaItens.last().id + 1
        }
        listaItens.add(this)
    }

    companion object {
        val listaItens = mutableListOf<ItemLoja>()
    }
}
