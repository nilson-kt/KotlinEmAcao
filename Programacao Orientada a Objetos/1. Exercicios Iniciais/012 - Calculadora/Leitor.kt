object Leitor {
    fun lerNumero(frase: String): Number {
        while (true) {
            print(frase)
            try {
                val numero = readln().toDoubleOrNull()
                checkNotNull(numero)
                return numero
            } catch (e: IllegalStateException) {
                println(Cores.vermelho("Entrada inválida. Digite um número."))
                continue
            }
        }
    }
}