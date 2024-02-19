import java.io.File

fun cor(frase: String, azul: Boolean = false, verde: Boolean = false, vermelho: Boolean = false,
        ciano: Boolean = false, amarelo: Boolean = false): String {
    if (azul) {
        return "\u001B[34m$frase\u001B[0m"
    } else if (verde) {
        return "\u001B[32m$frase\u001B[0m"
    } else if (vermelho) {
        return "\u001B[31m$frase\u001B[0m"
    } else if (ciano) {
        return "\u001B[36m$frase\u001B[0m"
    } else if (amarelo) {
        return "\u001B[33m$frase\u001B[0m"
    }
    return frase
}

fun mostrarLinha() {
    println("-".repeat(40))
}

fun cabecalho(frase: String, espacoAntecedente: Int) {
    mostrarLinha()
    println(cor(frase).padStart(cor(frase).length + espacoAntecedente))
    mostrarLinha()
}

fun exibirPessoas(arquivo: File) {
    cabecalho("PESSOAS CADASTRADAS", 10)
    if (arquivo.length() == 0L) {
        println(cor("Não há pessoas cadastradas.", amarelo = true))
    } else {
        arquivo.bufferedReader().use { reader ->
            reader.forEachLine { linha ->
                val (nome, idade) = linha.split(";")
                println("${nome.padEnd(30)} ${idade.padStart(2)} anos")
            }
        }
    }
    Thread.sleep(1500)
}
