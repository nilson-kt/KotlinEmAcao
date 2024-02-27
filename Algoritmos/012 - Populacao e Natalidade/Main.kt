fun main() {

    val paisA = Pais(5_000_000, 0.03f)
    val paisB = Pais(7_000_000, 0.02f)

}

class Pais(val populacao: Int, val taxaNatalidade: Float) {
    val pessoasPorAno = (populacao * taxaNatalidade).toInt()

    fun calcularUltrapassagem(paisB: Pais) {
        var populacaoPaisA = this.populacao
        var contador = 0
        if (paisB.populacao < this.populacao) {
            println("O país B já tem uma população menor")
        } else {
            println(this.populacao)
            while (populacaoPaisA < paisB.populacao) {
                populacaoPaisA += this.pessoasPorAno
                contador++
                println("$contador $populacaoPaisA")
            }
        }
    }



}