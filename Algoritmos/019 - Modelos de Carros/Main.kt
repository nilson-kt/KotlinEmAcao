fun main() {
    Sistema.input()
}

object Sistema {

    data class Carro(val modelo: String, val consumo: Int)

    private val listaCarros = mutableListOf<Carro>()

    fun run() {

    }

    fun input() {
        for (contador in 1..5) {
            println("Veículo $contador")
            print("Modelo: ")
            val modelo = readln()
            print("Km por litro: ")
            val consumo = readln().toInt()
            listaCarros.add(Carro(modelo, consumo))
            println("-".repeat(20))
        }
    }

    fun process() {

    }

    fun output() {

    }
}