/**
 * Programa que lê o sexo de uma pessoa, mas que só aceita os valores "M", "m" ou "F", "f".
 * Caso esteja errado, o programa pede a digitação novamente até ter um valor correto.
 */

fun main() {
    print("Informe seu sexo [M/F]: ")
    var sexo = readln().uppercase().trim()
    while (sexo !in "MF" || sexo == "") {
        print("Dado inválido. Por favor, digite seu sexo (M/F): ")
        sexo = readln().uppercase().trim()
    }
    print("Sexo $sexo registrado com sucesso.")
}
