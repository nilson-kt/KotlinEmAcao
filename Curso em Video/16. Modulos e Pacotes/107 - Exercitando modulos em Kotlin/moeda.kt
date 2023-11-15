import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

/**
 * Funções matemáticas simples.
 */

fun formatar(numero: Number): String {
    /**
     * @numero Um número qualquer.
     * @return Uma string formatada.
     */
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    return "R$${formato.format(numero)}"
}

fun aumentar(numero: Number, porcentagem: Int): String {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @return Um aumento conforme o número e a porcentagem fornecida.
     */
    val aumento = numero.toFloat() * porcentagem.toFloat() / 100
    return formatar(numero.toFloat() + aumento)

}

fun diminuir(numero: Number, porcentagem: Int): String {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @return Uma redução conforme o número e a porcentagem fornecida.
     */
    val desconto = numero.toFloat() * porcentagem.toFloat()/100
    return formatar(numero.toFloat() - desconto)
}

fun dobro(numero: Number): String {
    /**
     * @numero Um número qualquer.
     * @return O dobro do número.
     */
    return formatar(numero.toFloat()*2)
}

fun metade(numero: Number): String {
    /**
     * @numero Um número qualquer.
     * @return A metade do número.
     */
    return formatar(numero.toFloat()/2)
}
