import java.io.File

fun mostrarLinha() {
    println("-".repeat(40))
}

fun cabecalho(frase: String, espacoAntecedente: Int) {
    mostrarLinha()
    println(frase.padStart(frase.length + espacoAntecedente))
    mostrarLinha()
}

fun exibirPessoas(arquivo: File?) {
    cabecalho("PESSOAS CADASTRADAS", 10)
    if (arquivo != null) {
        if (arquivo.length() == 0L) {
            println("Não há pessoas cadastradas.")
        } else {
            val listaPessoas = arquivo.readLines().map {
                val nome = it.substringBeforeLast(" ")
                val idade = it.substringAfterLast(" ")
                listOf(nome, idade)
            }
            listaPessoas.forEach { pessoa ->
                val nome = pessoa[0]
                val idade = pessoa[1]
                println("${nome.padEnd(30)} $idade anos")
            }
        }
    }
    Thread.sleep(1500)
}

fun menu(onlyVisual: Boolean = false) {
    fun visual() {
        cabecalho("MENU PRINCIPAL", 12)
        println("1 - Ver pessoas cadastradas")
        println("2 - Cadastrar nova pessoa")
        println("3 - Sair do Sistema")
        mostrarLinha()
    }
    val arquivo = criarArquivo()
    if (onlyVisual) {
        visual()
    } else {
        while (true) {
            visual()
            val opcao = lerOpcao("Sua opção: ")
            when (opcao) {
                1 -> exibirPessoas(arquivo)
                2 -> arquivo?.let { cadastrar(it) }
                3 -> break
            }
        }
        cabecalho("Saindo do sistema... Até logo", 5)
    }
}
