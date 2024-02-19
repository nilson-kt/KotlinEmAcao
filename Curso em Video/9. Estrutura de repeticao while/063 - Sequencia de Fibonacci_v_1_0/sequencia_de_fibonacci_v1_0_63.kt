/**
 * Programa que exibe termos da Sequência de Fibonacci de acordo com
 * a quantidade digitada pelo usuário.
 */

fun main() {
    print("Quantos termos você quer mostrar?: ")
    val numero = readln().toInt()
    var contador1 = 1
    var contador2 = 0
    var A = 0
    var B = 0
    var C = 1
    var string = ""
    while (contador1 < numero+1) {
        string += "$B $C "
        if (contador2 < contador1) {
            A = C
            C += B
        }
        contador2 += 1
        if (contador2 == contador1) {
            B = C
            C += A
        }
        contador2 -= 1
        contador2 += 1
        contador1 += 1
    }
    val listaString = string.split(" ")
    for (elemento in 0..<numero) {
        print("${listaString[elemento]} > ")
    }
    print("FIM")
}
