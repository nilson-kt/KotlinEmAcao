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
        return (pais._nome in _fronteiras)
    }

    fun verificarFronteirasEmComum(pais: Pais): MutableList<String> {
        return pais._fronteiras.union(_fronteiras).toMutableList()
    }

}


fun main() {
    val brasil = Pais("BRA", "Brasil", 8_510_417.771)
    val venezuela = Pais("VEN", "Venezuela", 912_050.0)
    val chile = Pais("CHL", "Chile", 756_945.0)
    val equador = Pais("ECU", "Equador", 283_561.0)
    val paraguai = Pais("PRY", "Paraguai", 406_752.0)
    val listaPaises = mutableListOf(brasil, venezuela, chile, equador, paraguai)
    println("-".repeat(42))
    println(buildString {
        append("ISO".padEnd(5))
        append("Nome".padEnd(20))
        append("Dimensão")
    })
    listaPaises.forEach {
        println(buildString {
            append(it.iso.padEnd(5))
            append(it.nome.padEnd(20))
            append(it.dimensao)
        })
    }
    println("-".repeat(42))
}