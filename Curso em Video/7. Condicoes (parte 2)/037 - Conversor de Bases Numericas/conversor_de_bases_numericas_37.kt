/**
 * Programa que lê um número inteiro qualquer e converte para uma das
 * bases (binária, octal, hexadecimal).
 */

fun main() {
    print("Digite um número inteiro qualquer: ")
    val numeroDecimal = readln().toInt()
    println("[1] binário")
    println("[2] octal")
    println("[3] hexadecimal")
    print("Qual será a base de conversão: ")
    val opcao = readln()
    when (opcao) {
        "1" -> {
            print("Número decimal $numeroDecimal para binário: ${Integer.toBinaryString(numeroDecimal)}")
        }
        "2" -> {
            print("Número decimal $numeroDecimal para octal: ${Integer.toOctalString(numeroDecimal)}")
        }
        "3" -> {
            print("Número decimal $numeroDecimal para hexadecimal: ${Integer.toHexString(numeroDecimal)}")
        }
        else -> {
            print("Opção inválida. Por favor, execute o programa novamente.")
        }
    }
}
