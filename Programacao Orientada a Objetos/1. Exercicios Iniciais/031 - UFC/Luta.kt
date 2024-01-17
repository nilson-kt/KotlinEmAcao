import kotlin.random.Random

class Luta {
    private var _desafiado: Lutador? = null
    var desafiado: Lutador?
        get() = _desafiado
        set(valor) { _desafiado = valor }

    private var _desafiante: Lutador? = null
    var desafiante: Lutador?
        get() = _desafiante
        set(valor) { _desafiante = valor }

    private var _rounds = 0
    var rounds: Int
        get() = _rounds
        set(valor) { _rounds = valor }

    private var _aprovada = false
    var aprovada: Boolean
        get() = _aprovada
        set(valor) { _aprovada = valor }

    fun marcarLuta(l1: Lutador, l2: Lutador) {
        aprovada = if (l1 != l2 && l1.categoria == l2.categoria) {
            desafiado = l1
            desafiante = l2
            true
        } else {
            desafiado = null
            desafiante = null
            false
        }
    }

    fun lutar() {
        when (aprovada) {
            true -> {
                println("-".repeat(45))
                println("### DESAFIADO ###")
                desafiado?.apresentar()
                println("*".repeat(42))
                println("### DESAFIANTE ###")
                desafiante?.apresentar()
                val vencedor = Random.nextInt(0, 3)
                println("-".repeat(45))
                when (vencedor) {
                    0 -> {
                        println("A luta empatou!")
                        desafiado?.empatarLuta()
                        desafiante?.empatarLuta()
                    }
                    1 -> {
                        println("Vitória do ${desafiado?.nome}")
                        desafiado?.ganharLuta()
                        desafiante?.perderLuta()
                    }
                    2 -> {
                        println("Vitória do ${desafiante?.nome}")
                        desafiante?.ganharLuta()
                        desafiado?.perderLuta()
                    }
                }
            } else -> {
                println("Luta não pode acontecer")
            }
        }
    }
}