package Interface

object Painel {

    private fun cabecalho(frase: String, padStartLength: Int): String {
        return """
            |${"-".repeat(40)}
            |${frase.padStart(padStartLength)}
            |${"-".repeat(40)}
        """.trimMargin()
    }

    val menu = """${cabecalho(Cores.aplicarNegrito("MENU PRINCIPAL"), 35)}
        |1 - Departamentos
        |2 - Cursos
        |3 - Sair do Programa
    """.trimMargin()

    val departamentos = """${cabecalho(Cores.aplicarNegrito(Cores.verde("DEPARTAMENTOS")), 39)}
        |1 - Visualizar Departamentos
        |2 - Adicionar Departamentos
        |3 - Voltar ao Menu
    """.trimMargin()

    val cursos = """${cabecalho(Cores.aplicarNegrito(Cores.verde("CURSOS")), 35)}
        |1 - Visualizar Cursos
        |2 - Adicionar Cursos
        |3 - Voltar ao Menu
    """.trimMargin()

    val adicaoDepartamento = cabecalho(Cores.azul("CADASTRO DE DEPARTAMENTO"), 41)

    val adicaoCurso = cabecalho(Cores.azul("CADASTRO DE CURSO"), 37)

    val exibicaoDepartamento = cabecalho(Cores.azul("LISTA DE DEPARTAMENTOS"), 40)
}