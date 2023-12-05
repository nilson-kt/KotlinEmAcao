package poo

class Pais(iso: String, nome: String, dimensao: Double) {
    private var _iso: String
    private var _nome: String
    private var _dimensao: Double
    private var _fronteiras = mutableListOf<String>()

    companion object {
        val listaPaises = mutableListOf<Pais>()

        fun selecionarPais(listaPaises: MutableList<Pais>): Pais {
            val iso = lerIso(listaPaises)
            return listaPaises.first { it.iso == iso }
        }
    }

    init {
        _iso = iso
        _nome = nome
        _dimensao = dimensao
        listaPaises.add(this)
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

    fun verificarFronteira(pais: Pais): Boolean {
        return (pais._nome in _fronteiras)
    }

    fun verificarFronteirasEmComum(pais: Pais): MutableList<String> {
        return pais._fronteiras.intersect(_fronteiras.toSet()).toMutableList()
    }

    fun verificarIgualdade(pais: Pais): Boolean {
        return this == pais
    }


}

fun lerIso(listaPaises: MutableList<Pais>): String {
    while (true) {
        exibirPaises(listaPaises)
        print("Digite a ISO de um país: ")
        val iso = readln()
        try {
            checkNotNull(Pais.listaPaises.firstOrNull { it.iso == iso}) { "País não encontrado. Digite uma ISO válida." }
            return iso
        } catch (e: IllegalStateException) {
            println(e.message)
            continue
        }
    }

}


fun exibirPaises(listaPaises: MutableList<Pais>, retornoAomenu: Boolean = false) {
    println("-".repeat(45))
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
    if (retornoAomenu) {
        print("Pressione Enter para voltar ao Menu ")
        readln()
    }
}

fun menu(paisSelecionado: Pais?) {
    println("-".repeat(45))
    println("MENU".padEnd(40))
    println("-".repeat(45))
    paisSelecionado?.let {
        println("PAÍS SELECIONADO: ${paisSelecionado?.nome}")
        println("1 - Selecionar outro país")
    } ?: run {
        println("1 - Selecionar um país")
    }
    println("2 - Exibir países")
    println("3 - Verificar fronteira com outro país")
    println("4 - Verificar fronteiras em comum com outro país")
    println("5 - Sair do Programa")
    println("-".repeat(45))
}

fun main() {
    //Definição dos Países e das Fronteiras
    val brasil = Pais("BRA", "Brasil", 8_510_417.771)
    val venezuela = Pais("VEN", "Venezuela", 912_050.0)
    val chile = Pais("CHL", "Chile", 756_945.0)
    val equador = Pais("ECU", "Equador", 283_561.0)
    val paraguai = Pais("PRY", "Paraguai", 406_752.0)
    val listaPaises = mutableListOf(brasil, venezuela, chile, equador, paraguai)
    brasil.fronteiras = mutableListOf("Venezuela", "Chile")
    venezuela.fronteiras = mutableListOf("Equador", "Chile")


    //Menu e Opções
    var paisSelecionado: Pais? = null
    while (true) {
        menu(paisSelecionado)
        print("Sua opção: ")
        val opcao = readln().toInt()
        when (opcao) {
            1 -> {
                paisSelecionado = Pais.selecionarPais(listaPaises)
            }

            2 -> {
                exibirPaises(listaPaises, true)
            }

            3 -> {
                paisSelecionado?.let {
                    var pais2 = Pais.selecionarPais(listaPaises)
                    do {
                        if (paisSelecionado.verificarIgualdade(pais2)) {
                            println("Escolha um país diferente do selecionado")
                            Thread.sleep(1400)
                            pais2 = Pais.selecionarPais(listaPaises)
                        }
                    } while (paisSelecionado.verificarIgualdade(pais2))
                    if (paisSelecionado.verificarFronteira(pais2)) {
                        println("Sim. ${paisSelecionado.nome} faz fronteira com ${pais2.nome}")
                    } else {
                        println("Não faz fronteira.")
                    }
                    Thread.sleep(1400)
                } ?: run {
                    println("Selecione um país primeiro.")
                    Thread.sleep(1400)
                }
            }

            4 -> {
                paisSelecionado?.let {
                    var pais2 = Pais.selecionarPais(listaPaises)
                    do {
                        if (paisSelecionado.verificarIgualdade(pais2)) {
                            println("Escolha um país diferente do selecionado")
                            Thread.sleep(1400)
                            pais2 = Pais.selecionarPais(listaPaises)
                        }
                    } while (paisSelecionado.verificarIgualdade(pais2))
                    println(paisSelecionado.verificarFronteirasEmComum(pais2))
                } ?: run {
                    println("Selecione um país primeiro.")
                    Thread.sleep(1400)
                }

            }

            5 -> break
        }
    }
}