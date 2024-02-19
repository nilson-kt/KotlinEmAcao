Copie essa lista, que contém vários mapas, cada um correspondendo a um filme, com título, nota e gênero:
~~~
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
~~~
Em seguida, realize três filtragens:

A - Filmes de ação com uma nota acima de 4.0;

B - Filmes de drama com nota abaixo de 3.0;

C - Filmes de "D" a "O" pertencentes ao gênero ação, com a nota acima de 4.5.

Exemplo de Output:
~~~
Filmes de ação com uma nota acima de 4.0:
[{Título=Filme A, Nota=4.5, Gênero=Ação}, {Título=Filme G, Nota=4.6, Gênero=Ação}, {Título=Filme J, Nota=5.0, Gênero=Ação}, {Título=Filme M, Nota=4.2, Gênero=Ação}, {Título=Filme P, Nota=5.0, Gênero=Ação}]
====================================================================================================
Fimes de drama com nota abaixo de 3.0: 
[{Título=Filme L, Nota=2.8, Gênero=Drama}]
====================================================================================================
Filmes de 'D' a 'O' do gênero ação com nota acima de 4.5
[{Título=Filme G, Nota=4.6, Gênero=Ação}, {Título=Filme J, Nota=5.0, Gênero=Ação}]
~~~