import java.lang.IllegalStateException

object Leitor {
    fun lerOpcao(frase: String): Int {
        while (true) {
            try {
                print(frase)
                val opcao = readln().toIntOrNull()
                checkNotNull(opcao) { "Opção inválida. Digite um número inteiro de 1 a 3." }
                if (opcao !in 1..3) {
                    println(Cores.vermelho("Opção inválida. Digite um número inteiro de 1 a 3."))
                    continue
                }
                println("-".repeat(40))
                return opcao
            } catch (e: IllegalStateException) {
                println(e.message?.let { Cores.vermelho(it) })
                continue
            }
        }
    }

    fun lerString(frase: String): String {
        while (true) {
            print(frase)
            val nome = readln().trim()
            if (nome.isEmpty()) {
                println(Cores.vermelho(("Nome vazio. Digite um nome.")))
                continue
            } else if (!nome.all { (it.isLetter() || it == ' ') }) {
                println(Cores.vermelho("Somente letras e espaços são aceitos."))
                continue
            } else {
                return nome.split(" ")
                    .filter { it.isNotBlank()}.joinToString(" ")
            }
        }
    }
}