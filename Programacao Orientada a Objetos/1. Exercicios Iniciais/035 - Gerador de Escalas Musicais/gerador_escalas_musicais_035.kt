fun main() {
    val escalas = GeradorDeEscalas.gerarEscalas()
    GeradorDeEscalas.exibirEscalas(escalas, "Escalas Maiores")
}


object GeradorDeEscalas {
    private val notasNaturais = listOf("dó", "ré", "mi", "fá", "sol", "lá", "si")
    private var padraoDeIntervalo = listOf("T", "T", "ST", "T", "T", "T", "ST")

    private fun gerarEscalasSemAcidentes(): List<List<String>> {
        val escalasSemAcidentes = mutableListOf<List<String>>()

        for (contador in 0..6) {
            val escala = notasNaturais.subList(contador, notasNaturais.size) + notasNaturais
            escalasSemAcidentes.add(escala.take(7).toMutableList())
        }
        return escalasSemAcidentes
    }

    private fun aplicarAcidentes(escalas: List<List<String>>): List<List<String>> {
        val escalasModificadas = mutableListOf<String>()

        for (escala in escalas) {
            val notasIndexIntervalos = escala.zip(padraoDeIntervalo).toMap()

            var distancia = ""

            for (nota in notasIndexIntervalos) {
                var ultimaNota = ""
                if (escalasModificadas.isNotEmpty()) ultimaNota = escalasModificadas.last()

                when (distancia) {
                    "T" -> {
                        escalasModificadas.add(
                            when {
                                ultimaNota in listOf("mi", "si") || ultimaNota.endsWith("#") -> "${nota.key}#"
                                ultimaNota.endsWith("♭") && ultimaNota !in listOf("mi♭", "si♭") -> "${nota.key}♭"
                                else -> nota.key
                            }
                        )
                    }
                    "ST" -> escalasModificadas.add(
                        when {
                            !ultimaNota.endsWith("#") && ultimaNota !in listOf("mi", "si") -> "${nota.key}♭"
                            else -> nota.key
                        }
                    )
                    else -> escalasModificadas.add(nota.key)
                }
                distancia = nota.value
            }
        }
        return escalasModificadas.chunked(7)
    }

    fun gerarEscalas(escalaMenor: Boolean = false): List<List<String>> {
        var mensagem = "Escalas maiores geradas com sucesso!"
        val escalasSemAcidentes = gerarEscalasSemAcidentes()

        if (escalaMenor)  {
            padraoDeIntervalo = listOf("T", "ST", "T", "T", "ST", "T", "T")
            mensagem = "Escalas menores geradas com sucesso!"
        }
        println(mensagem)
        println("-".repeat(40))
        return aplicarAcidentes(escalasSemAcidentes)
    }

    fun exibirEscalas(escalas: List<List<String>>, mensagem: String = "") {
        if (mensagem.isNotEmpty()) println(mensagem)
        escalas.forEach { println(it) }
    }
}