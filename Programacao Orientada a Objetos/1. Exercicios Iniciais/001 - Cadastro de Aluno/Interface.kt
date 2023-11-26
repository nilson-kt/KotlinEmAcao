import java.util.Locale

class Linha {
    var caractere = ""

    fun repetirLinha(tamanho: Int) {
        println(caractere.repeat(tamanho))
    }
}

fun cor(frase: String, vermelho: Boolean = false, amarelo: Boolean = false,
        azul: Boolean = false, verde: Boolean = false): String {
    if (vermelho) {
        return "\u001B[31m$frase\u001B[0m"
    } else if (amarelo) {
        return "\u001B[33m$frase\u001B[0m"
    } else if (azul) {
        return "\u001B[34m$frase\u001B[0m"
    } else if (verde) {
        return "\u001B[32m$frase\u001B[0m"
    }
    return frase
}

fun exibirAlunos(alunos: MutableList<Aluno>) {
    val linha = Linha()
    linha.caractere = "-"

    linha.repetirLinha(64)
    println("ALUNOS CADASTRADOS".padStart(40))
    linha.repetirLinha(64)
    println(buildString  {
        append("Matrícula".padEnd(13))
        append("Nome".padEnd(30))
        append("Média".padEnd(10))
        append("Situação")
    })
    if (alunos.isEmpty()) {
        println(cor("Não há alunos cadastrados.", amarelo = true))
    } else {
        for (aluno in alunos) {
            val media = aluno.calcularMedia()
            val situacao = aluno.verificarSituacao(aluno.calcularMedia())
            println(buildString {
                append(aluno.matricula.toString().padEnd(13))
                append(aluno.nome.padEnd(30))
                append(String.format(Locale.US, "%.2f", media).padEnd(10))
                append(situacao)
            })
        }
    }
    Thread.sleep(1300)
}

fun menu(onlyVisual: Boolean = false) {
    val alunos = mutableListOf<Aluno>()
    val linha = Linha()
    linha.caractere = "-"
    val leitor = Leitor()

    fun visual() {
        linha.repetirLinha(64)
        println("MENU".padStart(32))
        linha.repetirLinha(64)
        println(cor("1 - Exibir alunos", azul = true))
        println(cor("2 - Cadastrar alunos", azul = true))
        println(cor("3 - Sair do programa", azul = true))
        linha.repetirLinha(64)
    }
    if (onlyVisual) {
        visual()
    } else {
        while (true) {
            visual()
            leitor.mensagem = "Escolha uma opção: "
            val opcao = leitor.lerOpcao()
            when (opcao) {
                1 -> exibirAlunos(alunos)
                2 -> cadastrar(alunos)
                3 -> {
                    linha.repetirLinha(64)
                    print("Finalizando o programa... Tenha um ótimo dia!")
                    break
                }
            }

        }
    }
}