import kotlin.random.Random

fun main() {
    val valor = Random.nextInt(0,11)

    val mes = Meses.entries[valor]

    val estacao = when (mes) {
        Meses.DEZEMBRO, Meses.JANEIRO, Meses.FEVEREIRO, Meses.MARCO -> "Verão"
        Meses.ABRIL, Meses.MAIO, Meses.JUNHO -> "Outono"
        Meses.JULHO, Meses.AGOSTO, Meses.SETEMBRO -> "Inverno"
        else -> "Primavera"
    }

    println("Mês é $mes e estação é $estacao.")
}

enum class Meses(var label: String) {
    JANEIRO("Janeiro"),
    FEVEREIRO("Fevereiro"),
    MARCO("Março"),
    ABRIL("Abril"),
    MAIO("Maio"),
    JUNHO("Junho"),
    JULHO("Julho"),
    AGOSTO("Agosto"),
    SETEMBRO("Setembro"),
    OUTUBRO("Outubro"),
    NOVEMBRO("Novembro"),
    DEZEMBRO("Dezembro")
}
