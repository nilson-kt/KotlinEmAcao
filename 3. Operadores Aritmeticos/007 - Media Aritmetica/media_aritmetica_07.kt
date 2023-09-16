// Programa que lê duas notas de um aluno e exibe a média aritmética entre elas.

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    print("Digite a primeira nota: ")
    val nota1 = readln().toFloat()
    print("Digite a segunda nota: ")
    val nota2 = readln().toFloat()
    val media = (nota1+nota2)/2
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    print("A média entre $nota1 e $nota2 é igual a ${formato.format(media)}")
}