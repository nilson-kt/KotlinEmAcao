open class Aluno: Pessoa() {
    var matricula = 0
    var curso = ""

    open fun pagarMensalidade() {
        println("Pagando mensalidade de aluno $nome")
    }
}