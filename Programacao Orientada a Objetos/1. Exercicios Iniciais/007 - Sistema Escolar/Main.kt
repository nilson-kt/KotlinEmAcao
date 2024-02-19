import Interface.Cores
import Interface.Painel

fun main() {
    val usp = Escola()
    while (true) {
        println(Painel.menu)
        val opcao = Leitor.lerOpcao("Sua opção: ", menu = true)
        when (opcao) {
            1 -> {
                while (true) {
                    println(Painel.departamentos)
                    val opcaoDep = Leitor.lerOpcao("Sua opção: ", departamentos = true)
                    when (opcaoDep) {
                        1 -> usp.visualizarDepartamentos()
                        2 -> usp.adicionarDepartamento()
                        3 -> break
                    }
                }
            }
            2 -> {
                while (true) {
                    println(Painel.cursos)
                    val opcaoCursos = Leitor.lerOpcao("Sua opção: ", cursos = true)
                    when (opcaoCursos) {
                        1 -> usp.visualizarCursos()
                        2 -> usp.adicionarCursos()
                        3 -> break
                    }
                }
            }
            3 -> {
                println("-".repeat(40))
                println(Cores.aplicarNegrito(Cores.azul("Programa encerrado.")))
                break
            }
        }
    }
}
