fun main() {
    val numero1 = Leitor.lerNumero("Digite um número: ")
    val numero2 = Leitor.lerNumero("Digite um número: ")
    Calculadora.somar(numero1, numero2)
    Calculadora.subtrair(numero1, numero2)
    Calculadora.multiplicar(numero1, numero2)
    Calculadora.dividir(numero1, numero2)
}