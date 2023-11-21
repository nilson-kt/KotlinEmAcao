fun mostrarLinha() {
    println("-".repeat(40))
}

fun cabecalho(frase: String, espacoAntecedente: Int) {
    mostrarLinha()
    println(frase.padStart(frase.length + espacoAntecedente))
    mostrarLinha()
}

fun exibirPessoas(listaPessoas: MutableList<MutableMap<String, Any>>) {
    cabecalho("PESSOAS CADASTRADAS", 10)
    if (listaPessoas.isEmpty()) {
        println("Não há pessoas cadastradas.")
    } else {
        listaPessoas.forEach { pessoa ->
            val nome = pessoa["Nome"]
            val idade = pessoa["Idade"]
            print("$nome".padEnd(30))
            println("$idade anos")
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
    val pessoas = mutableListOf<MutableMap<String, Any>>()
    if (onlyVisual) {
        visual()
    } else {
        while (true) {
            visual()
            val opcao = lerOpcao("Sua opção: ")
            when (opcao) {
                1 -> exibirPessoas(pessoas)
                2 -> pessoas.add(cadastrar())
                3 -> break
            }
        }
        cabecalho("Saindo do sistema... Até logo", 5)
    }
}
