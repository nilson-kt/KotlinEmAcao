import kotlin.math.pow

fun main() {
    val vetor = arrayOf(Quadrado(543.0), Retangulo(4.2, 5.4), Circulo(4.3))
    val nomes = arrayOf("Quadrado", "Retângulo", "Círculo")
    for ((indice, formaGeometrica) in vetor.withIndex()) {
        println("Área do ${nomes[indice]}: ${formaGeometrica.calculaArea()}")
    }
}

interface AreaCalculavel {

    fun calculaArea(): Double
}

class Quadrado(private val lado: Double) : AreaCalculavel {
    override fun calculaArea(): Double {
        return lado.pow(2)
    }
}

class Retangulo(private val base: Double, private val altura: Double) : AreaCalculavel {
    override fun calculaArea(): Double {
        return base * altura
    }
}

class Circulo(private val raio: Double) : AreaCalculavel {
    override fun calculaArea(): Double {
        return kotlin.math.PI * raio.pow(2)
    }
}