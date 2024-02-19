package utilidadescev

fun leiaDinheiro(frase: String): Float {
    /** Valida a entrada para aceitar apenas valores monetários.
     * @param frase Uma expressão que antecede a entrada.
     * @return Um número válido.
     */
    var valor: Float?
    do {
        print(frase)
        var entradaString = readln()
            if ("," in entradaString) {
                entradaString = entradaString.replace(",", ".")
            }
        valor = entradaString.toFloatOrNull()
        if (valor == null) println("\"${entradaString.trim()}\" é um preço inválido!")
    } while (valor == null)
    if (valor < 0) valor = 0.0f
    return valor
}
