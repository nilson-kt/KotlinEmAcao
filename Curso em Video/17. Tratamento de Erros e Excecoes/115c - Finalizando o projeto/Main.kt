import java.io.File

fun menu(onlyVisual: Boolean = false) {
   fun visual() {
      cabecalho("MENU PRINCIPAL", 12)
      println("1 - Ver pessoas cadastradas")
      println("2 - Cadastrar nova pessoa")
      println("3 - Sair do Sistema")
      mostrarLinha()
   }

   try {
      val arquivo: File? = receberArquivo()
      checkNotNull(arquivo)
      if (onlyVisual) {
         visual()
      } else {
         while (true) {
            visual()
            val opcao = lerOpcao("Sua opção: ")
            if (opcao == 3) cabecalho("Saindo do sistema... Até logo", 5)
            when (opcao) {
               1 -> exibirPessoas(arquivo)
               2 -> cadastrar(arquivo)
               3 -> break
            }
         }
      }
   } catch (e: IllegalStateException) {
      println("Ocorreu um erro: ${e.message}")
   } catch (e: Exception) {
      println("Ocorreu um erro: ${e.message}")
   }
}


fun main() {
   menu()
}