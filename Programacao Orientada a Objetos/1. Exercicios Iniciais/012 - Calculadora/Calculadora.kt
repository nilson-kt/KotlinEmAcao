import java.util.Locale

object Calculadora {

    private fun mensagem(numero1: Number, numero2: Number, resultado: Number, operacao: String) {
        val resultadoFormatado = String.format(Locale.US, "%.2f", resultado )
        println(Cores.azul("$numero1 $operacao $numero2 é igual a $resultadoFormatado"))
    }

    private fun conversaoNumerica(numero1: Number, numero2: Number, operacao: String): Number {
        var resultado: Number = 0
        when (operacao) {
            "+" ->  {
                resultado = when (numero1) {
                    is Int -> numero1.toInt() + numero2.toInt()
                    is Float -> numero1.toFloat() + numero2.toFloat()
                    is Double -> numero1.toDouble() + numero2.toDouble()
                    else -> throw IllegalArgumentException("Tipo numérico não suportado.")
                }
            }
            "-" -> {
                resultado = when (numero1) {
                    is Int -> numero1.toInt() - numero2.toInt()
                    is Float -> numero1.toFloat() - numero2.toFloat()
                    is Double -> numero1.toDouble() - numero2.toDouble()
                    else -> throw IllegalArgumentException("Tipo numérico não suportado.")
                }
            }

            "*" -> {
                resultado = when (numero1) {
                    is Int -> numero1.toInt() * numero2.toInt()
                    is Float -> numero1.toFloat() * numero2.toFloat()
                    is Double -> numero1.toDouble() * numero2.toDouble()
                    else -> throw IllegalArgumentException("Tipo numérico não suportado.")
                }
            }

            "/" -> {
                resultado = when (numero1) {
                    is Int -> numero1.toInt() / numero2.toInt()
                    is Float -> numero1.toFloat() / numero2.toFloat()
                    is Double -> numero1.toDouble() / numero2.toDouble()
                    else -> throw IllegalArgumentException("Tipo numérico não suportado.")
                }
            }
        }
        return resultado
    }

    private fun tratarDivisao(resultado: Number): String? {
        if ( (resultado is Float && resultado.isNaN()) || (resultado is Double && resultado.isNaN()) ) {
            return "Divisão por Zero!"
        } else if ( (resultado is Float && resultado.isInfinite()) ||
            (resultado is Double && resultado.isInfinite()) ) {
            return "Divisor é um Zero!"
        }
        return null
    }

    fun somar(numero1: Number, numero2: Number) {
        val resultado = conversaoNumerica(numero1, numero2, "+")
        mensagem(numero1, numero2, resultado, "+")
    }

    fun subtrair(numero1: Number, numero2: Number) {
        val resultado = conversaoNumerica(numero1, numero2, "-")
        mensagem(numero1, numero2, resultado, "-")
    }

    fun multiplicar(numero1: Number, numero2: Number) {
        val resultado = conversaoNumerica(numero1, numero2, "*")
        mensagem(numero1, numero2, resultado, "*")
    }

    fun dividir(numero1: Number, numero2: Number) {
        val resultado = conversaoNumerica(numero1, numero2, "/")
        val aviso = tratarDivisao(resultado)
        if (aviso == null) {
            mensagem(numero1, numero2, resultado, "/")
        } else {
            println(Cores.azul("$numero1 / $numero2 é igual a ") + Cores.vermelho(aviso))
        }
    }
}