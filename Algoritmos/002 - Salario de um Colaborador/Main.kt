import java.util.Locale

fun main() {
    print("Digite o número de dias trabalhados no mês: ")
    val qntHorasTrabalhadasNoMes = (readln().toIntOrNull() ?: 0) * 8
    val salario = (qntHorasTrabalhadasNoMes * 25).toFloat()
    println("O colaborador já ganhou ${String.format(Locale.US, "R$%.2f", salario)} de dinheiro.")
}