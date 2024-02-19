/**
 * Este programa calcula a área de um terreno retangular com base na largura e no comprimento fornecido
 * pelo usuário.
 *
 * Ele solicita que o usuário insira a largura e o comprimento em metros e, em seguida, calcula e exibe
 * a área em metros quadrados (m²).
 */

fun calcularArea(largura: Float, comprimento: Float) {
    val area = largura * comprimento
    print("A área de um terreno ${largura}x$comprimento é de ${area}m².")
}

fun main() {
    print("LARGURA (m): ")
    val largura = readln().toFloat()
    print("COMPRIMENTO (m): ")
    val comprimento = readln().toFloat()
    calcularArea(largura,comprimento)
}
