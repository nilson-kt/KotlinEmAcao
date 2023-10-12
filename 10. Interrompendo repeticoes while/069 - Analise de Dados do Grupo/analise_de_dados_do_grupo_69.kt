/**
 * Este programa solicita informações sobre pessoas, incluindo idade e sexo,
 * e realiza várias contagens com base nessas informações. Ele calcula a quantidade de homens, a
 * quantidade de pessoas maiores de 18 anos e a quantidade de mulheres com menos de 20 anos.
 * O programa permite que o usuário insira os dados de várias pessoas até que escolha parar.
 *
 * Para cada pessoa, o programa verifica a validade dos dados de entrada e fornece
 * feedback em caso de dados inválidos. Os dados de idade devem ser numéricos e não nulos,
 * enquanto os dados de sexo devem ser 'M' ou 'F' (maiúsculo ou minúsculo).
 *
 * O programa exibe os resultados após a coleta de dados.
 */

fun main() {
    var contador = 0
    var qntMaiores = 0
    var qntHomens = 0
    var qntMulheresAbaixo20 = 0
    while (true) {
        ++contador
        var idadeTeste = ""
        while (!idadeTeste.all { it.isDigit() } || idadeTeste == "") {
            print("Digite a idade da ${contador}ª pessoa: ")
            idadeTeste = readln()
            if (!idadeTeste.all { it.isDigit() } || idadeTeste == "") print("Dado inválido. ")
        }
        val idade = idadeTeste.toInt()
        var sexo = ""
        while (sexo !in "MmFf" || sexo == "") {
            print("Digite o sexo [M/F]: ")
            sexo = readln().trim()
            if (sexo !in "MmFf" || sexo == "") print("Opção inválida. ")
        }
        if (idade > 18) ++qntMaiores
        if (sexo in "Mm") ++ qntHomens else if (idade < 20 && sexo in "Ff") ++ qntMulheresAbaixo20
        var resposta = ""
        while (resposta !in "SsNn" || resposta == "") {
            print("Quer continuar? [S/N]: ")
            resposta = readln().trim()
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        }
        if (resposta in "Nn") break
    }
    println("=".repeat(45))
    println("Quantidade de pessoas maiores de idade: $qntMaiores")
    println("Quantidade de homens: $qntHomens")
    print("Quantidade de mulheres com menos de 20 anos: $qntMulheresAbaixo20")
}
