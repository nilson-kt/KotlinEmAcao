fun main() {
    println("DIAS DAS SEMANA")
    println("-".repeat(31))
    for (dia in DiaDaSemana.entries) {
        println("${dia.ordinal+1} ${dia.name} ${dia.label}")
    }
}

enum class DiaDaSemana(val label: String) {
    SEGUNDA("Segunda-feira"),
    TERCA("Terça-feira"),
    QUARTA("Quarta-feira"),
    QUINTA("Quinta-feira"),
    SEXTA("Sexta-feira"),
    SABADO("Sábado"),
    DOMINGO("Domingo")
}