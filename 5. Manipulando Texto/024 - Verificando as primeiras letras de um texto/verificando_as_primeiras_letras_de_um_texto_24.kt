/**
 * Programa que lê o nome de uma cidade e mostra se esse nome
 * começa com a palavra "santo".
 */

fun main() {
    print("Digite o nome de uma cidade: ")
    val cidade = readln().trim().uppercase().split(" ")[0]
    var teste = (cidade.indexOf("SANTO") == 0).toString()
    teste = teste.replace("false", "Falso")
    teste = teste.replace("true", "Verdadeiro")
    print("Começa com a palavra SANTO?: $teste")
}