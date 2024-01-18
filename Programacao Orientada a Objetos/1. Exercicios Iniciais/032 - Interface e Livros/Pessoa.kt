class Pessoa(private var _nome: String, private var _idade: Int, private var _sexo: String) {

    var nome: String
        get() {
            return _nome
        }
        set(valor) {
            _nome = valor
        }


    var idade: Int
        get() {
            return _idade
        }
        set(valor) {
            _idade = valor
        }

    var sexo: String
        get() {
            return _sexo
        }
        set(valor) {
            _sexo = valor
        }

    fun fazerAniver() {
        idade++
    }
}