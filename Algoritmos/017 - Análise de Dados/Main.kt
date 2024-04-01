fun main() {
    Sistema.lerEntrada()
}

object Sistema {
    private val lista = mutableListOf<Float>()

    fun lerEntrada() {
        print("Digite um número: ")
        while (true) {
            when (val entrada = readln().toFloatOrNull())  {
                null -> {
                    print("Entrada inválida. Digite um número inteiro: ")
                    continue
                }
                -1.0f -> break
                else -> lista.add(entrada)
            }
        }
    }

    fun processar() {
        val mapa = mapOf(
            "total" to lista.size,
            "soma" to lista.sum(),
            "média" to lista.average(),
            "valores acima da média" to lista.filter { it > lista.average() },
            "valores abaixo de sete" to lista.filter { it < 7 }
        )


    }
}