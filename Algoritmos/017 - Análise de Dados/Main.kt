fun main() {
    Sistema.lerEntrada()
}

object Sistema {
    private val lista = mutableListOf<Int>()

    fun lerEntrada() {
        print("Digite um número inteiro: ")
        while (true) {
            when (val entrada = readln().toIntOrNull())  {
                null -> {
                    print("Entrada inválida. Digite um número inteiro: ")
                    continue
                }
                -1 -> break
                else -> lista.add(entrada)
            }
        }
    }

    fun processar() {

    }
}