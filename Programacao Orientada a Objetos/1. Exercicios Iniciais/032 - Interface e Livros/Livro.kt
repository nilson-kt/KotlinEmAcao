class Livro(private var _titulo: String, private var _autor: String,
            private var _totPaginas: Int, private var _leitor: Pessoa): Publicacao {

    var titulo: String
        get() {
            return _titulo
        }
        set(valor) {
            _titulo = valor
        }

    var autor: String
        get() {
            return _autor
        }
        set(valor) {
            _autor = valor
        }

    var totPaginas: Int
        get() {
            return _totPaginas
        }
        set(valor) {
            _totPaginas = valor
        }

    private var _pagAtual = 0
    var pagAtual: Int
        get() {
            return _pagAtual
        }
        set(valor) {
            _pagAtual = valor
        }

    private var _aberto = false
    var aberto: Boolean
        get() {
            return _aberto
        }
        set(valor) {
            _aberto = valor
        }

    var leitor: Pessoa
        get() {
            return _leitor
        }
        set(valor) {
            _leitor = valor
        }


    fun detalhes(): String {
        return """
            ${"-".repeat(40)}
            Título: $titulo
            Autor: $autor
            Total de Páginas: $totPaginas, Página Atual: $pagAtual
            Aberto: $aberto
            Leitor: ${leitor.nome}, Idade: ${leitor.idade}, Sexo: ${leitor.sexo}
        """.trimIndent()
    }

    override fun abrir() {
        aberto = true
    }

    override fun fechar() {
        aberto = false
        pagAtual = 0
    }

    override fun folhear(p: Int) {
        if (!aberto) {
            println("O livro não pode ser folheado, pois encontra-se fechado.")
        } else if (p > totPaginas) {
            println("Não se pode folhear além do número de páginas do livro.")
        } else if (p <= 0) {
            println("Não é possível folhear abaixo da primeira página do livro.")
        } else {
            pagAtual = p
        }
    }

    override fun avancarPag() {
        if (!aberto) {
            println("Não é possível avançar a página, pois o livro encontra-se fechado.")
        } else if (pagAtual == totPaginas) {
            println("Não se pode ir além da última de página do livro.")
        } else {
            pagAtual++
        }

    }

    override fun voltarPag() {
        if (!aberto) {
            println("Não é possível voltar a página, pois o livro encontra-se fechado.")
        } else if (pagAtual == totPaginas) {
            println("Não se pode ir antes da primeira página do livro.")
        } else {
            pagAtual--
        }
    }

}