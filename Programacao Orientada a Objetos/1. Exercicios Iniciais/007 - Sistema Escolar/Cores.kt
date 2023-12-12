object Cores {

    fun aplicarNegrito(frase: String): String {
        return if ("\u001B" in frase) {
            "\u001B[1m$frase"
        } else {
            "\u001B[1m$frase\u001B[0m"
        }

    }
    fun vermelho(frase: String): String {
        return "\u001B[31m$frase\u001B[0m"
    }

    fun verde(frase: String): String {
        return "\u001B[32m$frase\u001B[0m"
    }

    fun azul(frase: String, negrito: Boolean = false): String {
        return "\u001B[34m$frase\u001B[0m"
    }

    fun amarelo(frase: String): String {
        return "\u001B[33m$frase\u001B[0m"
    }

    fun cinza(frase: String): String {
        return "\u001B[37m$frase\u001B[0m"
    }
}