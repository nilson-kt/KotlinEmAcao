/**
 * Programa que lê informações de um jogador num campeonato de futebol, seu nome e a quantidade de gols
 * feitos.
 *
 * No final, exibe a ficha do jogador com as informações fornecidas.
 */

fun ficha(nomeJogador: String? = "<desconhecido>", numeroGols: Int? = 0) {
    /**
     * Função que recebe um nome e um número de gols de um jogador e exibe essas informações na tela.
     * @param nomeJogador O nome do jogador. Por padrão é "<desconhecido>".
     * @param numeroGols O número de gols feito pelo jogador. Por padrão é 0.
     * @return Não retorna nada. Apenas imprime na tela o nome do jogador e o número de gols que
     * ele fez no campeonato.
     */
    println("O jogador $nomeJogador fez $numeroGols gols no campeonato.")
}

fun main() {
    /**
     * Função principal. Lê o nome de um jogador, o número de gols realizados por ele, e chama a função
     * "ficha()".
     *
     * O programa faz a seguinte validação dos dados:
     * Se o conteúdo digitado pelo usuário for vazio ou as variáveis "nome" ou "nGols" forem nulas, o
     * programa não a colocará no parâmetro da função ficha.
     */
    print("Nome do Jogador: ")
    val nome = readlnOrNull()
    print("Número de Gols: ")
    val nGols = readln().toIntOrNull()
    if (nome.isNullOrEmpty() && nGols == null) {
        ficha()
    } else if (nome.isNullOrEmpty() && nGols != null) {
        ficha(numeroGols = nGols)
    } else if (!nome.isNullOrEmpty() && nGols == null){
        ficha(nome)
    } else {
        ficha(nome, nGols)
    }
}
