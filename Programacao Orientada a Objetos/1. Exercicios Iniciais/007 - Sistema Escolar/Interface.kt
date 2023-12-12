object Interface {

    private fun cabecalho(frase: String, padStartLength: Int): String {
        return """
            |${"-".repeat(40)}
            |${frase.padStart(padStartLength)}
            |${"-".repeat(40)}
        """.trimMargin()
    }

    val menu = """${cabecalho(Cores.aplicarNegrito("MENU PRINCIPAL"), 34)}
        |1 - Visualizar Departamentos
        |2 - Adicionar Departamentos
        |3 - Sair do Programa
    """.trimMargin()

    val adicaoDepartamento = cabecalho(Cores.azul("CADASTRO DE DEPARTAMENTO"), 41)

    val exibicaoDepartamento = cabecalho(Cores.azul("LISTA DE DEPARTAMENTOS"), 38)


}