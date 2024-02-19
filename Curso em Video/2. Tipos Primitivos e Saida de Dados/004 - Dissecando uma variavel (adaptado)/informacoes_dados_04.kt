// Programa que lê um dado qualquer e exibe informações sobre ele.

fun main() {
    print("Digite uma dado qualquer: ")
    val dado = readln()
    println("=".repeat(30))
    println("Informações")
    println("=".repeat(30))
    println("É numérico?: ${dado.all { it.isDigit() }}")
    println("É alfabético?: ${dado.all { it.isLetter() }}")
    println("É alfanumérico?: ${dado.all { it.isLetterOrDigit() }}")
    println("Está tudo em maiúsculo?: ${dado.all { it.isUpperCase() }}")
    println("Está tudo em minúsculo?: ${dado.all { it.isLowerCase() }}")
    println("É espaço?: ${dado.all { it.isWhitespace() }}")
}