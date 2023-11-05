/**
 * Este programa simula o processo de saque de dinheiro em um banco. O usuário
 * fornece o valor desejado a ser sacado em reais brasileiros (R$), e o programa calcula
 * a quantidade de cédulas de diferentes denominações (R$50, R$20, R$10 e R$1) necessárias
 * para atender ao pedido de saque.
 */

import kotlin.math.pow

fun main() {
    print("Qual o valor a ser sacado? (número inteiro): ")
    var valor = readln()
    valor = "000$valor"
    var dezenaUnidade = valor.slice(valor.length-2..<valor.length).toInt()
    var restoDoNumero = 0
    var cedulas50 = 0
    var cedulas20 = 0
    var cedulas10 = 0
    var cedulas1 = 0
    if (valor.length > 5) {
        restoDoNumero = valor.slice(3..valor.length - 3).toInt() *
                10.0.pow(2).toInt()
        cedulas50 = restoDoNumero / 50
    }
    while (true) {
        if (dezenaUnidade >= 50) {
            dezenaUnidade -= 50
            ++cedulas50
        } else if (dezenaUnidade >= 20) {
            dezenaUnidade -= 20
            ++cedulas20
        } else if (dezenaUnidade >= 10) {
            dezenaUnidade -= 10
            ++cedulas10
        } else if (dezenaUnidade > 0){
            dezenaUnidade -= 1
            ++cedulas1
        } else {
            break
        }
    }
    if (cedulas50 != 0) println("Total de $cedulas50 cédulas de R$50")
    if (cedulas20 != 0) println("Total de $cedulas20 cédulas de R$20")
    if (cedulas10 != 0) println("Total de $cedulas10 cédulas de R$10")
    if (cedulas1 != 0) println("Total de $cedulas1 cédulas de R$1")
}
