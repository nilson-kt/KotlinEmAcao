import kotlin.random.Random

class Aluno(var nome: String = "") {
    val matricula: Int
    var notas = mutableListOf<Float>()

    init {
        val numero = Random.nextInt(1000000, 5000000)
        matricula = numero
    }

    fun calcularMedia(): Float {
        return notas.sum()/ notas.size
    }

    fun verificarSituacao(media: Float): String {
        return if (media >= 5) "Aprovado" else "Reprovado"
    }
}

fun main() {
    menu()
}
