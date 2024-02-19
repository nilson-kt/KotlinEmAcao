import Interface.Cores
import Interface.Painel
import java.lang.IllegalStateException

object Leitor {
    fun lerOpcao(frase: String, menu: Boolean = false, departamentos: Boolean = false,
                 cursos: Boolean = false): Int {
        var contador = 0
        while (true) {
            if (contador == 2) {
                contador = 0
                if (menu) println(Painel.menu) else if (departamentos) println(Painel.departamentos)
                else if (cursos) println(Painel.cursos)
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

    fun lerString(frase: String, cursos: Boolean = false, departamentos: Boolean = false): String {
        var contador = 0
        while (true) {
            if (contador == 2) {
                contador = 0
                if (cursos) println(Painel.adicaoCurso) else if (departamentos)
                    println(Painel.adicaoDepartamento)
            }
            print(frase)
            val nome = readln().trim()
            if (nome == "0") return nome
            if (nome.isEmpty()) {
                println(Cores.vermelho(("Nome vazio. Digite um nome.")))
                contador++
                continue
            } else if (!nome.all { (it.isLetter() || it == ' ') }) {
                println(Cores.vermelho("Somente letras e espaços são aceitos."))
                contador++
                continue
            } else {
                return nome.split(" ")
                    .filter { it.isNotBlank()}.joinToString(" ")
            }
        }
    }

    fun lerIdDepartamento(frase: String, escola: Escola): Int? {
        var contador = 0
        while (true) {
            try {
                if (contador == 2) {
                    escola.visualizarDepartamentos(false)
                    contador = 0
                }
                print(frase)
                val numero = readln().toIntOrNull()
                if (numero == 0) return numero
                checkNotNull(numero) { Cores.amarelo("Campo vazio. Digite uma ID válida.") }
                val depBuscado = escola.departamentos.filter { it.keys.first() == numero }
                return if (depBuscado.isEmpty()) {
                    println(Cores.amarelo("Não existe nenhum departamento com essa ID."))
                    null
                } else {
                    numero
                }
            } catch (e: IllegalStateException) {
                println(e.message)
                contador++
                continue
            }
        }
    }

    fun mensagemDeRetorno(aba: String) {
        print(Cores.cinza("Pressione Enter para voltar à aba de $aba "))
        readln()
    }
}