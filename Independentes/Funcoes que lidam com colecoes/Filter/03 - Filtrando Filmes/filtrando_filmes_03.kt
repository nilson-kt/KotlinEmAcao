/**
 * Programa que trabalha com uma lista de filmes, cada um representado por um mapa contendo informações
 * como título, nota e gênero. O algoritmo realiza diferentes filtragens na lista de filmes e imprime os
 * resultados.
 *
 * Funcionalidades:
 * 1. Filtra e imprime os filmes de ação com uma nota acima de 4.0.
 * 2. Filtra e imprime os filmes de drama com nota abaixo de 3.0.
 * 3. Filtra e imprime os filmes do gênero "Ação" com nota acima de 4.5, cujo título tem a sexta letra
 *    entre 'D' e 'O'.
 *
 * 4. Função auxiliar 'linha()' imprime uma linha de caracteres '=' para separar visualmente os resultados.
 */

fun main () {
    val listaFilmes = listOf(
        mapOf("Título" to "Filme A", "Nota" to 4.5f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme B", "Nota" to 3.2f, "Gênero" to "Comédia"),
        mapOf("Título" to "Filme C", "Nota" to 4.8f, "Gênero" to "Drama"),
        mapOf("Título" to "Filme D", "Nota" to 2.7f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme E", "Nota" to 5.0f, "Gênero" to "Ficção Científica"),
        mapOf("Título" to "Filme F", "Nota" to 3.9f, "Gênero" to "Drama"),
        mapOf("Título" to "Filme G", "Nota" to 4.6f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme H", "Nota" to 1.2f, "Gênero" to "Comédia"),
        mapOf("Título" to "Filme I", "Nota" to 4.8f, "Gênero" to "Drama"),
        mapOf("Título" to "Filme J", "Nota" to 5.0f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme K", "Nota" to 1.3f, "Gênero" to "Ficção Científica"),
        mapOf("Título" to "Filme L", "Nota" to 2.8f, "Gênero" to "Drama"),
        mapOf("Título" to "Filme M", "Nota" to 4.2f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme N", "Nota" to 2.7f, "Gênero" to "Comédia"),
        mapOf("Título" to "Filme O", "Nota" to 4.4f, "Gênero" to "Drama"),
        mapOf("Título" to "Filme P", "Nota" to 5.0f, "Gênero" to "Ação"),
        mapOf("Título" to "Filme Q", "Nota" to 2.6f, "Gênero" to "Ficção Científica"),
        mapOf("Título" to "Filme R", "Nota" to 4.2f, "Gênero" to "Drama")

    )
    println("Filmes de ação com uma nota acima de 4.0:")
    println(listaFilmes.filter { filme -> val nota = filme["Nota"] as Float
        nota > 4.0 && filme["Gênero"] == "Ação"} )
    linha()
    println("Fimes de drama com nota abaixo de 3.0: ")
    println(listaFilmes.filter { filme -> val nota = filme["Nota"] as Float
        nota < 3.0 && filme["Gênero"] == "Drama"})
    linha()
    println("Filmes de 'D' a 'O' do gênero ação com nota acima de 4.5")
    println(listaFilmes.filter {
        val nota = it["Nota"] as Float
        val isLetra = (it["Título"].toString())[6] in "DEFGHIJKLMNO"
        val genero = it["Gênero"] == "Ação"
        nota > 4.5 && isLetra && genero
    })
}

fun linha() {
    println("=".repeat(100))
}
