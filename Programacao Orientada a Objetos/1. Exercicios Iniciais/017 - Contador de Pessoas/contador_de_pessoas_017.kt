fun main() {
    while (true) {
        println(ContadorPessoas.menu)
        print("Sua opção: ")
        val opcao = readln().toInt()
        when (opcao) {
            1 -> ContadorPessoas.entrar()
            2 -> ContadorPessoas.sair()
            3 -> ContadorPessoas.mostrarQuantidade()
            4 -> break
        }
    }
}

object ContadorPessoas {
    private var pessoas = 0
    val menu = """
        ${"-".repeat(30)}
        CONTADOR DE PESSOAS
        ${"-".repeat(30)}
        1- Entrar
        2- Sair
        3- Mostrar quantidade de pessoas
        4- Encerrar programa
        ${"-".repeat(30)}
    """.trimIndent()

    fun entrar() {
        pessoas++
    }

    fun sair() {
        pessoas--
    }

    fun mostrarQuantidade() {
        println(pessoas)
        print("Pressione Enter para voltar ao Menu ")
        readln()
    }
}