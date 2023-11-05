// Programa que lê uma temperatura em graus Celsius e a converte para Fahrenheit.

fun main() {
    print("Digite uma temperatura em graus Celsius: Cº")
    val tempCelsius = readln().toDouble()
    val tempFahrenheit = String.format("%.1f", (tempCelsius * 9/5) + 32)
    print("Essa temperatura, em Fahrenheit, fica: Fº$tempFahrenheit")

}