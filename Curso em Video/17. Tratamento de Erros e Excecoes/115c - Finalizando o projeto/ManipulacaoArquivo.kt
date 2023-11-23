import java.io.File
import java.io.FileNotFoundException
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
            throw(FileNotFoundException("Arquivo não encontrado"))
        }
    } catch (e: FileNotFoundException) {
        println("Ocorreu um erro: ${e.message}")
        false
    }

}

fun criarArquivo(caminho: String): File? {
    return try {
        val arquivo = File(caminho)
        if (arquivo.createNewFile()) {
            println("Arquivo ${arquivo.name} criado com sucesso em ${arquivo.path}")
        }
        arquivo
    } catch (e: IOException) {
        println("Ocorreu um erro ao criar o arquivo: ${e.message}.")
        return null
    }

}

fun escreverArquivo(arquivo: File, frase: String) {
    arquivo.appendText("$frase\n")
}