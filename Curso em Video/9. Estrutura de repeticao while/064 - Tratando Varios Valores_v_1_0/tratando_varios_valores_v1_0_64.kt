/**
 * Programa que lê vários números inteiros digitados pelo usuário. O programa
 * só se encerra quando o usuário digita 999. No final, é exibido a quantidade
 * dos números digitados, bem como a soma entre eles - desconsiderando a flag "999".
 */

fun main() {
    var numero = 0
    var soma = 0
    while (numero != 999) {
        soma += numero
        print("Digite  um número [999 para parar]: ")
        numero = readln().toInt()
    }
    print("A soma de todos os números é igual a $soma")
}
