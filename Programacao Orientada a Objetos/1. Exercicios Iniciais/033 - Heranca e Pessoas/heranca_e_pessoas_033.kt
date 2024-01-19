fun main() {
    val v1 = Visitante()
    v1.nome = "Juvenal"
    v1.idade = 22
    v1.sexo = "M"
    println(v1.toString())
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
    private val matricula = 0
    private val curso = ""

    open fun pagarMensalidade() {

    }
}

class Bolsista: Aluno() {
    private val bolsa = 0

    fun renovarBolsa() {

    }

    override fun pagarMensalidade() {

    }

}

class Tecnico: Aluno() {
    private val registroProfissional = 0

    fun praticar() {

    }
}
