/**
 * Este programa permite ao usuário cadastrar várias pessoas, cada uma contendo estes dados:
 * nome, sexo (M/F) e idade.
 *
 * No final, ele exibe as seguintes informações:
 * A) A quantidade de pessoas cadastradas;
 * B) A média de idade das pessoas;
 * C) Uma lista de todas as mulheres cadastradas.
 * D) Uma lista das pessoas com a idade acima da média.
 */

import java.util.Locale

fun main() {
    val mapa = mutableMapOf<String, Any>()
    val lista = mutableListOf<MutableMap<String,Any>>()
    val mulheres = mutableListOf<String>()
    val idadeAcimaMedia = mutableListOf<MutableList<Any?>>()
    while (true) {
        print("Nome: ")
        val nome = readln()
        var sexo: String?
        do {
            print("Sexo (M/F): ")
            sexo = readlnOrNull()?.uppercase()?.trim()
            if (sexo.isNullOrEmpty() || sexo !in "MF") print("Sexo inválido. Tente novamente. ")
        } while (sexo.isNullOrEmpty() || sexo !in "MF")
        var idade: Int?
        do {
            print("Idade: ")
            idade = readln().toIntOrNull()
            if (idade == null || idade <= 0) print("Idade inválida. Tente novamente. ")
        } while (idade == null || idade <= 0)
        mapa["Nome"] = nome
        mapa["Sexo"] = sexo
        mapa["Idade"] = idade
        lista.add(mapa.toMutableMap())
        var resposta: String?
        do {
            print("Deseja continuar? [S/N]: ")
            resposta = readlnOrNull()?.trim()
            if (resposta.isNullOrEmpty() || resposta !in "SsNn") print("Opção inválida. ")
        } while (resposta.isNullOrEmpty() || resposta !in "SsNn")
        if (resposta in "Nn") break
    }
    println("-".repeat(100))
    println(lista)
    println("A) Quantidade de pessoas cadastradas: ${lista.size}")
    val soma = lista.sumOf { it["Idade"] as Int}
    mulheres.addAll(lista.filter { it["Sexo"] == "F" }.map {it["Nome"] as String})
    val media = soma / lista.size.toFloat()
    println("B) Média de idade: %.2f".format(Locale.US, media))
    println("C) Lista com todas as mulheres: $mulheres")
    for (registro in lista) {
        if (registro["Idade"] as Int > media) {
            val sublista = mutableListOf(
                registro["Nome"],
                registro["Idade"]
            )
            idadeAcimaMedia.add(sublista)
        }
    }
    println("D) Lista de pessoas com idade acima da média: $idadeAcimaMedia")
    println("-".repeat(100))
    print("Programa Encerrado.")
}
