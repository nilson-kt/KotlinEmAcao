class Visualizacao(private var espectador: Gafanhoto, private var filme: Video) {

    init {
        espectador.totAssistido++
        filme.views++
    }

    fun avaliar() {
        filme.avaliacao = 5
    }

    fun avaliar(nota: Int) {
        filme.avaliacao = nota
    }

    fun avaliar(porc: Float) {
        val total = if (porc <= 20) {
            3
        } else if (porc <= 50) {
            5
        } else if (porc <= 90) {
            8
        } else {
            10
        }
        filme.avaliacao = total
    }

    override fun toString(): String {
        return "Visualizacao(espectador=$espectador, filme=$filme)"
    }
}
