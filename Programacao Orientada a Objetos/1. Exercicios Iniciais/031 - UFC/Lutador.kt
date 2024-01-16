class Lutador(
    private var _nome: String,
    private var _nacionalidade: String,
    private var _idade: Int,
    private var _altura: Float,
    private var _peso: Float,
    private var _vitorias: Int,
    private var _derrotas: Int,
    private var _empates: Int
) {

    var nome: String
        get() = _nome
        set(valor) { _nome = valor }

    var nacionalidade: String
        get() = _nacionalidade
        set(valor) { _nacionalidade = valor }

    var idade: Int
        get() = _idade
        set(valor) { _idade = valor }

    var altura: Float
        get() = _altura
        set(valor) { _altura = valor }

    var peso: Float
        get() = _peso
        set(valor) {
            _peso = valor
            atualizarCategoria()
        }

    private var _categoria = ""
    var categoria: String
        get() = _categoria
        private set(valor) {
            _categoria = valor
        }

    private fun atualizarCategoria() {
        categoria = if (peso < 52.2f) {
            "Inválido"
        } else if (peso <= 70.3f) {
            "Leve"
        } else if (peso <= 83.9f) {
            "Médio"
        } else if (peso <= 120.2f) {
            "Pesado"
        } else {
            "Inválido"
        }
    }

    var vitorias: Int
        get() = _vitorias
        set(valor) { _vitorias = valor }

    var derrotas: Int
        get() = _derrotas
        set(valor) { _derrotas = valor }

    var empates: Int
        get() = _empates
        set(valor) { _empates = valor }

    fun apresentar() {
        println("""
            Lutador: $nome
            Origem: $nacionalidade
            Idade: $idade anos
            Altura: ${altura}m
            Peso: ${peso}kg
            Ganhou: $vitorias
            Perdeu: $derrotas
            Empatou: $empates
        """.trimIndent())
    }

    fun status() {
        println("""
            $nome
            é um peso $categoria
            $vitorias vitórias
            $derrotas derrotas
            $empates empates
        """.trimIndent())
    }

    fun ganharLuta() {
        vitorias++
    }

    fun perderLuta() {
        derrotas--
    }

    fun empatarLuta() {
        empates++
    }
}