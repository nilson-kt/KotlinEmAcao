class Leitor {
    var mensagem = ""

    fun lerString(): String {
        while (true) {
            print(mensagem)
            val nome = readln().trim()
            if (nome.isEmpty()) {
                println(cor("Campo vazio. Digite um nome. ", vermelho = true))
                continue
            } else if (!nome.all { it.isLetter() || it == ' '}) {
                println(cor("Nome inválido. Digite um nome alfabético.", vermelho = true))
                continue
            }
            val nomeModificado = nome.split(" ").filter {
                it.isNotBlank()
            }.joinToString(" ")
            return nomeModificado
        }

    }

    fun lerNota(): Float {
        while (true) {
            print(mensagem)
            return try {
                val numero = readln().toFloatOrNull()
                checkNotNull(numero) {"Nota inválida. Digite um número."}
                if (numero < 0 || numero > 10) {
                    println(cor("Nota invalida. Digite um número de 1 a 10", vermelho = true))
                    continue
                }
                numero
            } catch (e: IllegalStateException) {
                println(cor("${e.message}", vermelho = true))
                continue
            }
        }
    }

    fun lerOpcao(): Int {
        var ntentativas = 0
        while (true) {
            if (ntentativas >= 2 && ntentativas % 2 == 0) {
                Thread.sleep(1200)
                menu(true)
            }
            return try {
                print(mensagem)
                val numero = readln().toIntOrNull()
                checkNotNull(numero) { "Opção nula. Digite uma opção válida." }
                if (numero > 3 || numero < 1) {
                    println(cor("Opção inválida. Digite um número de 1 a 3.", vermelho = true))
                    ++ntentativas
                    continue
                }
                numero
            } catch (e: IllegalStateException) {
                println(cor("${e.message}", vermelho = true))
                ++ntentativas
                continue
            }
        }
    }
}

fun cadastrar(alunos: MutableList<Aluno>) {
    val linha = Linha()
    linha.caractere = "-"
    val leitor = Leitor()
    val estudante = Aluno()

    linha.repetirLinha(64)
    println("CADASTRO".padStart(34))
    linha.repetirLinha(64)

    leitor.mensagem = "Digite o nome de um aluno: "
    estudante.nome = leitor.lerString()
    for (contador in 1..4) {
        leitor.mensagem = "Digite a ${contador}ª nota: "
        estudante.notas.add(leitor.lerNota())
    }
    estudante.gerarMatricula()
    alunos.add(estudante)
    println(cor("Aluno ${estudante.nome} cadastrado com sucesso.", verde = true))
    Thread.sleep(1300)
}