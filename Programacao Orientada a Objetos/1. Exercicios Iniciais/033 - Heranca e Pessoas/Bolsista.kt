class Bolsista: Aluno() {
    var bolsa = 0f

    fun renovarBolsa() {
        println("Renovando bolsa de $nome")
    }

    override fun pagarMensalidade() {
        println("$nome é bolsista! Pagamento facilitado!")
    }

}