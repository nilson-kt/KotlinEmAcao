fun main() {
    val v1 = Visitante()
    v1.nome = "Juvenal"
    v1.idade = 22
    v1.sexo = "M"
    println(v1.toString())

    val a1 = Aluno()
    a1.nome = "Cláudio"
    a1.matricula = 1111
    a1.curso = "Informática"
    a1.sexo = "M"
    a1.pagarMensalidade()

    val b1 = Bolsista()
    b1.matricula = 1112
    b1.nome = "Jubileu"
    b1.bolsa = 12.5f
    b1.sexo = "M"
    b1.pagarMensalidade()
}
