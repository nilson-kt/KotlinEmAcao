import java.time.LocalDate

fun main() {
    val totalDiasVividosNesseAno = LocalDate.now().dayOfYear-1
    print("Digite a quantidade de cigarros fumados por dia: ")
    val qntCigarrosDia = readln().toInt()
    val minutosVidaPerdidosPorDia = qntCigarrosDia * 10
    val minutosVidaPerdidosNesseAno = minutosVidaPerdidosPorDia * totalDiasVividosNesseAno
    print("Digite o número de anos fumados: ")
    val qntAnosFumando = readln().toInt()
    val qntTotalMinutosVidaPerdidos = minutosVidaPerdidosPorDia * 365 * qntAnosFumando + minutosVidaPerdidosNesseAno
    val qntTotalHorasVidaPerdidas = qntTotalMinutosVidaPerdidos / 60
    val qntTotalDiasVidaPerdidos = qntTotalHorasVidaPerdidas / 24
    println("Foram perdidos $qntTotalDiasVidaPerdidos dias de vida.")
}