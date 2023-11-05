/**
 * Este programa verifica se uma expressão matemática contém o mesmo número de parênteses
 * abertos e fechados, a fim de indicar se a expressão é válida ou inválida.
 */

fun main() {
    val lista = mutableListOf<Any>()
    print("Digite uma expressão matemática: ")
    val expressao = readln()
    for (elemento in expressao) {
        var qntAbre = 0
        var qntFecha = 0
        for (elementoB in expressao) {
            lista.add(elementoB)
            if (elementoB == '(') {
                ++qntAbre
            } else if (elementoB == ')')  {
                ++qntFecha
            }
        }
        if (qntAbre != qntFecha) {
            print("Expressão errada!")
        } else {
            print("Expressão válida.")
        }
        break
    }
}
