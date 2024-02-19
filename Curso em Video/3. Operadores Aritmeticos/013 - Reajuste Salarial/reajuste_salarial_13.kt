// Algoritmo que lê o salário de uma pessoa e exibe o salário com 15% de aumento.

fun main() {
    print("Digite seu salário: R$")
    val salario = readln().toFloat()
    val novoSalario = String.format("%.2f", salario + salario*0.15)
    print("Seu salário sofreu mudanças! Com 15% de aumento, seu salário agora é R$$novoSalario")

}