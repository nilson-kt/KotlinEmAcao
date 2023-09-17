// Algoritmo que lê um valor em reais e exibe o mesmo valor convertido em dólar.
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.Locale

fun main() {
    print("Quanto de dinheiro você possui na carteira?: R$")
    val real = readln().toDouble()
    println("Beleza! Agora mostrarei quantos dólares você pode comprar com esse valor!:")
    val dolar = real / 3.27
    val formato = DecimalFormat("0.00", DecimalFormatSymbols(Locale.US))
    val numeroFormatado = formato.format(dolar)
    print("U$${numeroFormatado}")

}