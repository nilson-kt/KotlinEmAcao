object Cores {
    fun vermelho(frase: String): String {
        return "\u001B[31m$frase\u001B[0m"
    }

    fun azul(frase: String): String {
        return "\u001B[34m$frase\u001B[0m"
    }
}