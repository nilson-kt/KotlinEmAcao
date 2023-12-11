fun main() {
    val usp = Escola()
    while (true) {
        println(Menu.painel)
        val opcao = Leitor.lerOpcao("Sua opção: ")
        when (opcao) {
            1 -> usp.visualizarDepartamentos()
            2 -> usp.adicionarDepartamento()
            3 -> break
        }
    }
}
