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