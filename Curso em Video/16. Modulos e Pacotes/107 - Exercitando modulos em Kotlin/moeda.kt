/**
 * Funções matemáticas simples.
 */

fun aumentar(numero: Number, porcentagem: Int): Float {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @return Um aumento conforme o número e a porcentagem fornecida.
     */
    val aumento = numero.toFloat() * porcentagem.toFloat() / 100
    return numero.toFloat() + aumento

}

fun diminuir(numero: Number, porcentagem: Int): Float {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @return Uma redução conforme o número e a porcentagem fornecida.
     */
    val desconto = numero.toFloat() * porcentagem.toFloat()/100
    return numero.toFloat() - desconto
}

fun dobro(numero: Number): Float {
    /**
     * @numero Um número qualquer.
     * @return O dobro do número.
     */
    return numero.toFloat()*2
}

fun metade(numero: Number): Float {
    /**
     * @numero Um número qualquer.
     * @return A metade do número.
     */
    return numero.toFloat()/2
}
