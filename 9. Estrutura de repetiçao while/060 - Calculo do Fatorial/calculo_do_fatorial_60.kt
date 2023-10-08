/**
 * Programa que lê um número digitado pelo usuário e exibe o seu fatorial.
 */

fun main() {
    print("Digite um número para ver seu fatorial: ")
    val numero = readln().toInt()
    var contador = numero-1
    var fatorial = numero
    println("Calculando $numero!")
    while (contador != 1) {
        if (contador == numero-1) print("${numero}x")
        print("${contador}x")
        fatorial *= contador
        --contador
    }
    print("1 = $fatorial")
}
