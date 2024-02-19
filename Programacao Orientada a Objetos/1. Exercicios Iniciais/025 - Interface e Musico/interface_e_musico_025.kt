fun main() {
    val user1 = Musico("João", Violao())
    user1.tocar()

    val user2 = Musico("Beatriz", Piano())
    user2.tocar()
}

class Musico(private val nome: String, private val instrumento: MusicaInterface) {

    fun tocar() {
        print("$nome ")
        instrumento.tocar()
    }
}

interface MusicaInterface {

    fun tocar()
}

class Violao : MusicaInterface {
    override fun tocar() {
        println("está tocando violão")
    }
}

class Piano : MusicaInterface {
    override fun tocar() {
        println("está tocando piano")
    }
}