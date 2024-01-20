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

abstract class Pessoa() {
    var nome = ""
    var idade = 0
    var sexo = ""

    fun fazerAniv() {
        idade++
    }

    override fun toString(): String {
        return "Dados(nome='$nome', idade=$idade, sexo='$sexo')"
    }


}

class Visitante: Pessoa()

open class Aluno: Pessoa() {
    var matricula = 0
    var curso = ""

    open fun pagarMensalidade() {
        println("Pagando mensalidade de aluno $nome")
    }
}

class Bolsista: Aluno() {
    var bolsa = 0f

    fun renovarBolsa() {
        println("Renovando bolsa de $nome")
    }

    override fun pagarMensalidade() {
        println("$nome é bolsista! Pagamento facilitado!")
    }

}

class Tecnico: Aluno() {
    private val registroProfissional = 0

    fun praticar() {

    }
}
