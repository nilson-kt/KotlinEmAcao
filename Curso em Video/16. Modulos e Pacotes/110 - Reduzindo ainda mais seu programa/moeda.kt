import java.util.Locale

/**
 * Funções matemáticas simples.
 */

fun moeda(numero: Number, moeda: String = "R$"): String {
    /**
     * @numero Um número qualquer.
     * @moeda A abreviatura de alguma moeda. Por padrão é R$.
     * @return Uma string formatada.
     */
    return "$moeda${String.format(Locale.US, "%.2f", numero)}"
}

fun aumentar(numero: Number, porcentagem: Int, formatar: Boolean = false): Any {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @formatar A opção de formatar.
     * @return Um aumento conforme o número e a porcentagem fornecida, de maneira formatada, opcionalmente.
     */
    val aumento = numero.toFloat() * porcentagem.toFloat() / 100
    val resultado = numero.toFloat() + aumento
    return if (formatar) moeda(resultado) else resultado
}

fun diminuir(numero: Number, porcentagem: Int, formatar: Boolean = false): Any {
    /**
     * @param numero Um número qualquer.
     * @porcentagem Uma porcentagem para o cálculo.
     * @formatar A opção de formatar.
     * @return Uma redução conforme o número e a porcentagem fornecida, de maneira formatada, opcionalmente.
     */
    val desconto = numero.toFloat() * porcentagem.toFloat()/100
    val resultado = numero.toFloat() - desconto
    return if (formatar) moeda(resultado) else resultado
}

fun dobro(numero: Number, formatar: Boolean = false): Any {
    /**
     * @numero Um número qualquer.
     * @formatar A opção de formatar.
     * @return O dobro do número, formatado opcionalmente.
     */
    val resultado = (numero.toFloat()*2)
    return if (formatar) moeda(resultado) else resultado
}

fun metade(numero: Number, formatar: Boolean = false): Any {
    /**
     * @numero Um número qualquer.
     * @formatar A opção de formatar.
     * @return A metade do número, formatado opcionalmente.
     */
    val resultado = numero.toFloat()/2
    return if (formatar) moeda(resultado) else return resultado
}

fun resumo(preco: Number, aumento: Int, desconto: Int) {
    /**
     * @preco O preço dado como entrada.
     * @aumento Uma representação de porcentagem para realizar o aumento.
     * @desconto Uma representação de porcentagem para realizar o desconto.
     * @return Não retorna nada. Apenas imprime um painel com as informações.
     */
    fun mostrarLinha() {
        /**
         * Uma linha para melhorar o visual.
         */
        println("-".repeat(40))
    }
    mostrarLinha()
    println("RESUMO DO VALOR".padStart(15 + 12))
    mostrarLinha()
    println("A metade de R$$preco é ${metade(preco, true)}")
    println("O dobro de R$$preco é ${dobro(preco, true)}")
    println("Aumentando 10%, temos ${aumentar(preco, aumento, true)}")
    println("Reduzindo 13%, temos ${diminuir(preco, desconto, true)}")
    mostrarLinha()
}
