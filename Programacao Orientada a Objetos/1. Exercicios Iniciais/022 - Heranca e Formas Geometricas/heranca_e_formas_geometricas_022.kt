import kotlin.math.pow

fun main() {
    val ret = Retangulo(2.0, 5.0)
    val quad = Quadrado(2.0)
    quad.exibirArea()
    ret.exibirArea()
}



abstract class Forma {
    protected abstract fun calcularArea(): Double

    fun exibirArea() {
        when (this) {
            is Retangulo -> println("Área do Retãngulo: ${calcularArea()}²m")
            is Quadrado -> println("Área do Quadrado: ${calcularArea()}²m")
        }
    }
}

class Retangulo(private val base: Double, private val altura: Double) : Forma() {
    override fun calcularArea(): Double {
        return base*altura
    }
}

class Quadrado(private val comprimentoLado: Double) : Forma() {
    override fun calcularArea(): Double {
        return comprimentoLado.pow(2)
    }
}