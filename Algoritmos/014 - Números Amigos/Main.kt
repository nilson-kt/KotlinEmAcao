fun main() {
    print("Digite o primeiro número: ")
    val n1 = readln().toInt()
    print("Digite o segundo número: ")
    val n2 = readln().toInt()

    val divisoresN1 = (1..n1 / 2).filter {it != n1 && n1 % it == 0 }
    val divisoresN2 = (1..n2 / 2).filter {it != n2 && n2 % it == 0 }
    val soma1 = divisoresN1.sum()
    val soma2 = divisoresN2.sum()

    println("""
        Divisores do Primeiro Número: $divisoresN1
        Divisores do Segundo Número: $divisoresN2
        Soma dos Divisores do Primeiro Número: $soma1
        Soma dos Divisores do Segundo Número: $soma2
        ${"-".repeat(40)}
        Resultado:
        ${if (soma1 == n2 && soma2 == n1) "$n1 e $n2 são amigos!" else "$n1 e $n2 não são amigos!"}
    """.trimIndent())
}
