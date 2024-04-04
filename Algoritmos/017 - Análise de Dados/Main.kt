fun main() {
    App.run()
}

object App {
    private val data = mutableListOf<Float>()
    private var processProduct = mapOf<String, Any>()

    private fun input() {
        while (true) {
            print("Digite um número (digite -1 para parar): ")
            when (val entrada = readln().toFloatOrNull())  {
                null -> {
                    println("Entrada inválida. Digite um número inteiro.")
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
        println("-".repeat(40))
        println("RESULTADO".padStart(9+14))
        println("-".repeat(40))
        processProduct.forEach { (key, value) ->
            println("$key = $value")
        }
    }

    fun run() {
        input()
        process()
        output()
    }
}