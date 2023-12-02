package poo

class Pais(iso: String, nome: String, dimensao: Double) {
    private var _iso: String
    private var _nome: String
    private var _dimensao: Double

    private var _fronteiras = mutableListOf<String>()

    init {
        _iso = iso
        _nome = nome
        _dimensao = dimensao
    }

    var iso: String
        get() {
            return _iso
        }
        set(valor) {
            _iso = valor
        }

    var nome: String
        get() {
            return _nome
        }
        set(valor) {
            _nome = valor
        }

    var dimensao: Double
        get() {
            return _dimensao
        }
        set(valor) {
            _dimensao = valor
        }

    var fronteiras: MutableList<String>
        get() {
            return _fronteiras
        }
        set(valor) {
            _fronteiras = valor
        }

    fun verificarIgualdade(pais: Pais): Boolean {
        return _iso == pais._iso
    }

    fun verificarFronteira(pais: Pais): Boolean {
        return (pais._nome in fronteiras)
    }

}


fun main() {
    val brasil = Pais("BRA", "Brasil", 8510417.771)
    brasil.fronteiras = mutableListOf("Bolívia, Peru, Venezuela")
    println(brasil.iso)
    println(brasil.fronteiras)

}