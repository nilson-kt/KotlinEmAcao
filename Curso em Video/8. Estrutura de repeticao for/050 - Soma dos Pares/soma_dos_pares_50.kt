/**
 * Programa que lê seis números e mostra na tela a soma de todos
 * os números pares digitados. O programa desconsidera números ímpares.
 */

fun main() {
    var numerosPares = ""
    var quantidadePares = 0
    var soma = 0
    for (contador in 1..6) {
        print("Digite o ${contador}º número: ")
        val numero = readln().toInt()
        if (numero % 2 == 0) {
            numerosPares += numero.toString()
            ++quantidadePares
            soma += numero
        }
    }
    println("Você digitou $quantidadePares número(s) par(es)! Agora vou mostrar a soma entre eles: ")
    for (numeroPar in numerosPares) {
        if (numeroPar != numerosPares.last()) print("$numeroPar+") else print("$numeroPar ")
    }
    print("= $soma")
}
