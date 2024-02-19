import java.io.File
import java.io.FileNotFoundException
import java.io.BufferedWriter
import java.io.FileWriter
import java.io.IOException

fun receberArquivo (): File? {
    val caminho = "src/main/resources/pessoas.txt"
    return if (existeArquivo(caminho)) {
        File(caminho)
    } else {
        criarArquivo(caminho)
    }
}

fun existeArquivo(caminho: String): Boolean {
    return try {
        val arquivo = File(caminho)
        if (arquivo.exists()) {
            true
        } else {
            throw(FileNotFoundException(cor("Arquivo não encontrado", vermelho = true)))
        }
    } catch (e: FileNotFoundException) {
        println(cor("Ocorreu um erro: ${e.message}", vermelho = true))
        false
    }

}

fun criarArquivo(caminho: String): File? {
    return try {
        val arquivo = File(caminho)
        if (arquivo.createNewFile()) {
            println(cor("Arquivo ${arquivo.name} criado com sucesso em ${arquivo.path}", verde = true))
        }
        arquivo
    } catch (e: IOException) {
        println(cor("Ocorreu um erro ao criar o arquivo: ${e.message}.", vermelho = true))
        return null
    }

}

fun escreverArquivo(arquivo: File, frase: String) {
    BufferedWriter(FileWriter(arquivo, true)).use { writer ->
        writer.write(frase)
        writer.newLine()
    }
}