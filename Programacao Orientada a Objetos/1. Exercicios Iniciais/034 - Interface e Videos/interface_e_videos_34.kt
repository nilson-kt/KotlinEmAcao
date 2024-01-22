fun main() {

    val videos = arrayOfNulls<Video>(5)

    videos[0] = Video("Aula 1 de POO")
    videos[1] = Video("Aula 12 de PHP")
    videos[2] = Video("Aula 10 DE HTML5")

    println(videos[0].toString())

}

interface AcoesVideo {
    fun play()

    fun pause()

    fun like()
}


class Video(var titulo: String): AcoesVideo {
    val avaliacao = 1
    var views = 0
    var curtidas = 0
    var reproduzindo = false

    override fun play() {
        TODO("Not yet implemented")
    }

    override fun pause() {
        TODO("Not yet implemented")
    }

    override fun like() {
        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return """Video(titulo='$titulo', avaliacao=$avaliacao, views=$views, curtidas=$curtidas,
             reproduzindo=$reproduzindo)"""
    }


}

open class Pessoa {
    protected var nome = ""
    protected var idade = 0
    protected var sexo = ""
    protected var experiencia = 0

    protected fun ganharExp() {

    }
}

class Gafanhoto {
    private val login = ""
    private val totAssistido = ""

    fun viuMaisUm() {

    }

}
