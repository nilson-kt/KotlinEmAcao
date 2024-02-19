package funcoes_colecoes

/**
 * Este programa cria uma lista de números de 1 a 10 e utiliza a função filter
 * para separar esses números em duas categorias: pares e ímpares. Em seguida,
 * ele cria um mapa que associa cada categoria aos números correspondentes.
 * O programa finaliza imprimindo as categorias e seus respectivos números.
 */

fun main() {
    val numeros = (1..10).toList()
    val numerosPares = numeros.filter { it % 2 == 0 }
    val numerosImpares = numeros.filter { it % 2 != 0 }
    val mapaNumeros = mapOf(
        "Geral" to numeros,
        "Pares" to numerosPares,
        "Ímpares" to numerosImpares
    )
    mapaNumeros.forEach { (chave, valor) ->
        println("$chave: $valor")
    }
}
