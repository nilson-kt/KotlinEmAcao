/**
 * Programa que lê três segmentos de reta de um triângulo e exibe
 * na tela se é possível formar um triângulo. Se for possível, o
 * programa ainda exibe se o triângulo é escaleno, equilátero ou
 * isósceles.
 */

fun main() {
    print("Primeiro lado: ")
    val A = readln().toFloat()
    print("Segundo lado: ")
    val B = readln().toFloat()
    print("Terceiro lado: ")
    val C = readln().toFloat()
    var tipo = "ESCALENO"
    if (A + B > C && B + C > A && A + C > B) {
        if (A == B) {
            tipo = "EQUILÁTERO"
        } else if (A == B && B != C || B == C && C != A || C == A && A != B) {
            tipo = "ISÓSCELES"
        }
        print("É POSSÍVEL formar um triângulo! O triângulo é $tipo!")
    } else {
        print("NÃO é possível formar um triângulo!")
    }
}
