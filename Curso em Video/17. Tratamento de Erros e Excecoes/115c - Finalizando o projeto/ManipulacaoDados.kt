import java.io.File

fun lerOpcao(frase: String): Int {
    var numeroTentativas = 0
    while (true) {
        if (numeroTentativas >= 2 && numeroTentativas % 2 == 0) {
            Thread.sleep(800)
            menu(true)
        }
        print(frase)
        val opcao = readln().toIntOrNull()
        try {
            checkNotNull(opcao)
            if (opcao !in (1..3)) {
                println("Opção inválida. Digite um número de 1 a 3.")
                ++numeroTentativas
                continue
            } else {
                return opcao
            }
        } catch (e: IllegalStateException) {
            println("Opção inválida. Digite um número inteiro de 1 a 3.")
            ++numeroTentativas
            continue
        }
    }
}

fun lerNome(frase: String): String {
    while (true) {
        print(frase)
        val nome = readln().trim()
        if (nome.isEmpty()) {
            println("Campo vazio. Digite um nome alfabético.")
        } else if (!nome.all { it.isLetter() || it == ' '}){
            println("Nome inválido. Digite um nome alfabético.")
        } else {
            return nome.split(" ")
                .filter { it.isNotBlank() }.joinToString(" ")
        }
    }
}

fun lerIdade(frase: String): Int {
    while (true) {
        print(frase)
        val idade = readln().toIntOrNull()
        try {
            checkNotNull(idade)
            if (idade < 0) {
                println("Idade inválida. Digite um número inteiro não negativo.")
                continue
            } else {
                return idade
            }
        } catch (e: IllegalStateException) {
            println("Idade inválida. Digite um número inteiro.")
            continue
        }
    }
}

fun cadastrar(arquivo: File) {
    try {
        cabecalho("CADASTRO", 15)
        val nome = lerNome("Digite seu nome: ")
        val idade = lerIdade("Digite sua idade: ").toString()
        escreverArquivo(arquivo, "$nome;$idade")
        println("Registro de $nome adicionado.")
        Thread.sleep(800)
    } catch (e: Exception) {
        println("Ocorreu um erro: ${e.message}")
    }
}
