fun main() {
    val lista = DiasDaSemana.entries
    println("DIAS DA SEMANA")
    println("-".repeat(45))
    for (dia in lista) {
        println(buildString {
            append("${dia.ordinal+1} ")
            append(dia.name.padEnd(10))
            append(dia.label.padEnd(15))
            append(dia.exibirRotina())
        })
    }
}

enum class DiasDaSemana(val label: String) {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo");

    fun exibirRotina(): String {
        return when (this) {
            SEGUNDA -> "Trabalhar!"
            TERCA -> "Estudar!"
            QUARTA, SEXTA -> "Trabalhar!"
            QUINTA -> "Exercitar!"
            SABADO -> "Ir para o shopping!"
            DOMINGO -> "Descansar!"
        }
    }
}
