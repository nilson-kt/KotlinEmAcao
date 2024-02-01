fun main() {
    GeradorEscala.gerarEscalas()
}



object GeradorEscala {
    private val notasNaturais = listOf("dó", "ré", "mi", "fá", "sol", "lá", "si")
    private var padraoDeIntervalo = mutableListOf("T", "T", "ST", "T", "T", "T", "ST")

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

    fun gerarEscalas() {
        val escalasSemAcidentes = gerarEscalasSemAcidentes()
        val escalasModificadas =  aplicarAcidentes(escalasSemAcidentes)
        for (escala in escalasModificadas) {
            println(escala)
        }
    }
}