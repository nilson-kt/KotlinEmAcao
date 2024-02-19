/**
 * Este programa solicita ao usuário o nome e a média de um aluno, armazena esses valores em um mapa
 * mutável e, em seguida, determina a situação do aluno com base em sua média (aprovado, de recuperação ou
 * reprovado). Essa situação também é armazenada no mapa. No final, todas as informações são exibidas
 * na tela.
 */

fun main() {
    val mapa = mutableMapOf<String, Any>()
    print("Nome: ")
    mapa["Nome"] = readln()
    print("Média: ")
    mapa["Média"] = readln().toFloat()
    if (mapa["Média"] as Float >= 7) {
        mapa["Situação"] = "Aprovado"
    } else if (mapa["Média"] as Float >= 5){
        mapa["Situação"] = "Recuperação"
    } else {
        mapa["Situação"] = "Reprovado"
    }
    for ((chave, valor) in mapa.entries) {
        println("$chave é igual a $valor")
    }
}
