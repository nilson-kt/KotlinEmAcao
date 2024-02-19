package curso_em_video

/**
 * Programa que calcula o fatorial de um número e exibe ou o resultado, ou o processo de cálculo e o
 * resultado, dependendo da solicitação do usuário.
 */

fun fatorial(numero: Int, show: Boolean = false): Any {
    /**
     * Função que calcula o fatorial de um número e retorna o seu resultado. A função permite ao usuário
     * escolher se quer ver o processo do cálculo ou não.
     * @param numero O número a ser calculado.
     * @show Se for true, o programa armazenará o processo de cálculo juntamente com o fatorial numa String,
     * do contrário, armazenará o fatorial como Int.
     * @return Retorna, a depender da condição do parâmetro show, o fatorial como Int ou como uma
     * String com o processo de cálculo e o resultado.
     */

    println("-".repeat(30))
    var fatorial = numero
    return if (!show) {
        for (contador in numero - 1 downTo 1) {
            fatorial *= contador
        }
        fatorial
    } else {
        var resultado = "$fatorial! = "
        for (contador in numero - 1 downTo 1) {
            fatorial *= contador
            resultado += if (contador != 1) "$contador x " else "1 = $fatorial"

        }
        resultado
    }
}

fun main() {
    /**
     * Função principal. Solicita ao usuário de qual número ele gostaria de ver o fatorial e pergunta
     * se ele gostaria de ver também o processo de cálculo.
     *
     * No final, aciona a função fatorial, armazena seu retorno na variável produto e exibe o conteúdo.
     */
    print("Digite um número para ver seu fatorial: ")
    val numero = readln().toInt()

    var resposta: String?
    do {
        print("Deseja ver o processo de cálculo? [S/N]: ")
        resposta = readlnOrNull()?.trim()
        if (resposta.isNullOrEmpty() || resposta !in "SsNn")
            print("Opção inválida. ")
    } while (resposta.isNullOrEmpty() || resposta !in "SsNn")
    val produto = fatorial(numero, resposta in "Ss")
    print(produto)
}
