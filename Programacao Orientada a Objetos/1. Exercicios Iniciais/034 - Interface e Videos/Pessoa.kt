abstract class Pessoa(protected var nome: String, protected var idade: Int, protected var sexo: String) {
    protected var experiencia = 0

    protected fun ganharExp() {

    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade," +
                " sexo='$sexo', experiencia=$experiencia)"
    }
}
