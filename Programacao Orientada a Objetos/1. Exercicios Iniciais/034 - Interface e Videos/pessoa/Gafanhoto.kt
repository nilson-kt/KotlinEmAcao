class Gafanhoto(nome: String, idade: Int, sexo: String, private val login: String)
    : Pessoa(nome, idade, sexo) {

    var totAssistido = 0

    fun viuMaisUm() {

    }

    override fun toString(): String {
        return "Gafanhoto(${super.toString()}, login='$login',  totAssistido=$totAssistido)"
    }
}
