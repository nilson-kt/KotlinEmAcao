import kotlin.random.Random

fun buscarSistema(): LoggerInterface {
    val numeroAleatorio = Random.nextInt(1, 3)
    return when (numeroAleatorio) {
        1 -> SistemaConsole()
        else -> SistemaSuperTerminal()
    }
}

fun main() {
    val user1 = Usuario(buscarSistema())
    user1.criarPublicacao()

    val user2 = Usuario(buscarSistema())
    user2.criarPublicacao()

}

interface LoggerInterface {
    fun exibirMensagem(message: String)
}

class SistemaConsole: LoggerInterface {
    init {
        println("Eu sou o Sistema Console")
    }

    override fun exibirMensagem(message: String) {
        println(Cores.verde(message))
    }
}

class SistemaSuperTerminal : LoggerInterface {
    init {
        println("Eu sou o Sistema Super Terminal")
    }

    override fun exibirMensagem(message: String) {
        println(Cores.azul(message))
    }

}

class Usuario(private val loggerSistema: LoggerInterface) {
    init {
        loggerSistema.exibirMensagem("Usuário criado!")
    }

    fun criarPublicacao() {
        loggerSistema.exibirMensagem("Publicação criada!")
    }

}

object Cores {

    fun verde(message: String): String {
        return "\u001B[32m$message\u001B[0m"
    }

    fun azul(message: String): String {
        return "\u001B[34m$message\u001B[0m"
    }
}