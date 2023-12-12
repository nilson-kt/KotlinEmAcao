fun main() {
    val usp = Escola()
    while (true) {
        println(Interface.menu)
        val opcao = Leitor.lerOpcao("Sua opção: ")
        when (opcao) {
            1 -> usp.visualizarDepartamentos()
            2 -> usp.adicionarDepartamento()
            3 -> {println("-".repeat(40))
                println(Cores.aplicarNegrito(Cores.azul("Programa encerrado.")))
                break
            }
            4 -> usp.adicionarCursos()
            5 -> usp.visualizarCursos()
        }
    }
}
