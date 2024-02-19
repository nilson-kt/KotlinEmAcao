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
    init {
        atualizarCategoria(_peso)
    }

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
            atualizarCategoria(valor)
        }

    private lateinit var _categoria: String
    var categoria: String
        get() = _categoria
        private set(valor) {
            _categoria = valor
        }

    private fun atualizarCategoria(peso: Float) {
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
            Apresentando o lutador $nome
            diretamente de $nacionalidade
            com $idade anos de idade e ${altura}m de altura
            pesando ${peso}kg
            $vitorias vitórias
            $derrotas derrotas e
            $empates empates!!
        """.trimIndent())
    }

    fun status() {
        println("""
            ${"-".repeat(45)}
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
        derrotas++
    }

    fun empatarLuta() {
        empates++
    }
}