/**
 * Programa que recebe várias notas de vários alunos, calcula o total de notas, bem como
 * a maior e menor, assim como a média da turma. Além disso, mostra opcionalmente a situação da
 * turma.
 *
 * No final, exibe um mapa informativo na tela.
 */

fun notas(vararg notas: Float, situacao: Boolean = false): MutableMap<String, Any> {
    /**
     * Cria um mapa informativo em relações a notas e o retorna.
     * @param notas Várias notas colocadas numa array.
     * @param situacao Caso o usuário queira ver uma avaliação das notas da turma.
     * @return Um mapa contendo informações sobre as notas.
     */
    val registro = mutableMapOf<String, Any>(
        "Total" to notas.size,
        "Maior" to notas.max(),
        "Menor" to notas.min(),
        "Média" to notas.sum() / notas.size,
    )
    if (situacao) {
        val nota = registro["Média"] as Float
        if (nota >= 7) {
            registro["Situação"] = "Boa"
        } else if (nota >= 5) {
            registro["Situação"] = "Razoável"
        } else {
            registro["Situação"] = "Ruim"
        }
    }
    return registro
}

fun main() {
    /**
     * Recebe um mapa informativo acerca das notas fornecidas e exibe-o na tela.
     */
    val registroNotas = notas(3.5f, 2.0f, 6.5f, 2.0f, 7.0f, 4.0f, situacao=true)
    print(registroNotas)
}
