import java.lang.IllegalStateException

object Leitor {
    fun lerOpcao(frase: String, menu: Boolean = false, departamentos: Boolean = false,
                 cursos: Boolean = false): Int {
        var contador = 0
        while (true) {
            if (contador == 2) {
                if (menu) println(Interface.menu) else if (departamentos) println(Interface.departamentos)
                else if (cursos) println(Interface.cursos)
            }
            try {
                print(frase)
                val opcao = readln().toIntOrNull()
                checkNotNull(opcao) { "Opção inválida. Digite um número inteiro de 1 a 3." }
                if (opcao !in 1..3) {
                    println(Cores.vermelho("Opção inválida. Digite um número inteiro de 1 a 3."))
                    contador++
                    continue
                }
                return opcao
            } catch (e: IllegalStateException) {
                println(e.message?.let { Cores.vermelho(it) })
                contador++
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

    fun lerInteiro(frase: String): Int {
        while (true) {
            try {
                print(frase)
                val numero = readln().toIntOrNull()
                checkNotNull(numero) { "Digite uma ID válida." }
                return numero
            } catch (e: IllegalStateException) {
                println(e.message)
                continue
            }
        }
    }

    fun mensagemDeRetorno() {
        print(Cores.cinza("Pressione Enter para retornar ao Menu "))
        readln()
    }
}