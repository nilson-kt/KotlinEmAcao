fun main() {
    val casaNova = ImovelNovo("Rua Machado Vieira")
    casaNova.exibirAnuncio()

    val casaVelha = ImovelVelho("Rua Santos Gonçalves")
    casaVelha.exibirAnuncio()
}

open class Imovel(private var endereco: String) {
    protected var preco = 5000.0f

    fun exibirAnuncio() {
        println("O imóvel está localizado em $endereco e custa R$$preco")
    }

}
class ImovelNovo(endereco: String) : Imovel(endereco) {
    init {
        preco += 5000
    }

}

class ImovelVelho(endereco: String) : Imovel(endereco) {
    init {
        preco -= 2000
    }
}