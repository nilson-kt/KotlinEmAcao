fun main() {
    val user1 = Pessoa("Thiago", 30)
    println("Nome: " + user1.nome)
    println("Idade: " + user1.idade + " anos")
}

class Pessoa(private var _nome: String) {
    private var _idade: Int? = null

    var nome: String
        get() {
            return _nome
        }
        set(valor) {
            _nome = valor
        }

    var idade: Int?
        get() {
            return _idade
        }

        set(valor) {
            _idade = valor
        }

    constructor(nome: String, idade: Int) : this(nome) {
        _idade = idade
    }
}