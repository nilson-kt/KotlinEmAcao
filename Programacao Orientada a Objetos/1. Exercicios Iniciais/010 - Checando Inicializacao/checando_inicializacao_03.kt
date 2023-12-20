package poo

class PerfilUsuario {
    lateinit var nome: String

    fun checarInicializacao() {
        if (::nome.isInitialized) {
            println("Nome inicializado!")
            println("Nome: ${this.nome}")
        } else {
            println("O nome não foi inicializado ainda.")
        }
    }
}


object Leitor {
    fun lerNome(frase: String): String? {
        print(frase)
        val nome = readln()
        if (nome.isBlank()) {
            println("Nome vazio.")
        } else if (!nome.all { (it.isLetter() || it == ' ') }) {
            println("Somente é aceito letras e espaços.")
        } else {
            return nome
        }
        return null
    }
}

fun main() {
    val user1 = PerfilUsuario()
    val nome = Leitor.lerNome("Digite um nome: ")
    if (nome != null) user1.nome = nome
    user1.checarInicializacao()
}
