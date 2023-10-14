/**
 * Este programa permite ao usuário inserir informações sobre produtos,
 * incluindo nome e preço. Ele calcula o total gasto na compra, conta quantos
 * produtos têm um valor acima de R$1000 e identifica o produto mais barato.
 * O programa continuará solicitando informações de produtos até que o usuário
 * decida não continuar.
 */

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    var contador = 0
    var total = 0.0f
    var qntMaisDe1000 = 0
    var precoMaisBarato = 0.0f
    var nomeMaisBarato: String? = null
    while (true) {
        contador++
        print("Digite o nome do ${contador}º produto: ")
        val nome = readln()
        print("Digite o preço: R$")
        val preco = readln().toFloat()
        total += preco
        if (preco > 1000) ++qntMaisDe1000
        if (contador == 1) {
            precoMaisBarato = preco
            nomeMaisBarato = nome
        } else if (preco < precoMaisBarato) {
            precoMaisBarato = preco
            nomeMaisBarato = nome
        }
        var resposta = ""
        while (resposta !in "SsNn" || resposta == "") {
            print("Quer continuar? [S/N]: ")
            resposta = readln().trim()
        }
        if (resposta in "Nn") break
    }
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    println("=".repeat(40))
    println("Total gasto na compra: R$${formato.format(total)}")
    println("Número de produtos com o valor acima de R$1000: $qntMaisDe1000")
    print("Produto mais barato: $nomeMaisBarato - valendo R$${formato.format(precoMaisBarato)}.")
}
