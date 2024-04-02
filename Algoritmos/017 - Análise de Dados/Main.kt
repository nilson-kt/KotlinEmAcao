fun main() {
    App.run()
}

object App {
    private val data = mutableListOf<Float>()
    private var processProduct = mapOf<String, Any>()

    private fun input() {
        print("Digite um número: ")
        while (true) {
            when (val entrada = readln().toFloatOrNull())  {
                null -> {
                    print("Entrada inválida. Digite um número inteiro: ")
                    continue
                }
                -1.0f -> break
                else -> data.add(entrada)
            }
        }
    }

    private fun process() {
        processProduct += mapOf(
            "total" to data.size,
            "valores em ordem" to data,
            "valores em ordem inversa" to data.reversed(),
            "soma" to data.sum(),
            "média" to data.average(),
            "valores acima da média" to data.filter { it > data.average() },
            "valores abaixo de sete" to data.filter { it < 7 }
        )
    }

    private fun output() {
        println(processProduct)
    }

    fun run() {
        input()
        process()
        output()
    }
}