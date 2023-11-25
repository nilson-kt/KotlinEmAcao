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
                println(cor("Opção inválida. Digite um número de 1 a 3.", vermelho = true))
                ++numeroTentativas
                continue
            } else {
                return opcao
            }
        } catch (e: IllegalStateException) {
            println(cor("Opção inválida. Digite um número inteiro de 1 a 3.", vermelho = true))
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
            println(cor("Campo vazio. Digite um nome alfabético.", vermelho = true))
        } else if (!nome.all { it.isLetter() || it == ' '}){
            println(cor("Nome inválido. Digite um nome alfabético.", vermelho = true))
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
                println(cor("Idade inválida. Digite um número inteiro não negativo.", vermelho = true))
                continue
            } else {
                return idade
            }
        } catch (e: IllegalStateException) {
            println(cor("Idade inválida. Digite um número inteiro.", vermelho = true))
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
        println(cor("Registro de $nome adicionado.", verde = true))
        Thread.sleep(800)
    } catch (e: Exception) {
        println(cor("Ocorreu um erro: ${e.message}", vermelho = true))
    }
}
