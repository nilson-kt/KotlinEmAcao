import java.io.File

fun menu(onlyVisual: Boolean = false) {
   fun visual() {
      cabecalho(cor("MENU PRINCIPAL"), 12)
      println(cor("1 - ", amarelo = true) + cor("Ver pessoas cadastradas", azul = true))
      println(cor("2 - ", amarelo = true) + cor("Cadastrar nova pessoa", azul = true))
      println(cor("3 - ", amarelo = true) + cor("Sair do Sistema", azul = true))
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
            if (opcao == 3) cabecalho(cor("Saindo do sistema... Até logo", azul = true), 5)
            when (opcao) {
               1 -> exibirPessoas(arquivo)
               2 -> cadastrar(arquivo)
               3 -> break
            }
         }
      }
   } catch (e: IllegalStateException) {
      println(cor("Ocorreu um erro: ${e.message}", vermelho = true))
   } catch (e: Exception) {
      println(cor("Ocorreu um erro: ${e.message}", vermelho = true))
   }
}


fun main() {
   menu()
}