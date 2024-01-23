fun main() {

    val v = arrayOfNulls<Video>(5)

    v[0] = Video("Aula 1 de POO")
    v[1] = Video("Aula 12 de PHP")
    v[2] = Video("Aula 10 DE HTML5")

    val g = arrayOfNulls<Gafanhoto>(2)


    g[0] = Gafanhoto("Jubileu", 22, "M", "juba")
    g[1] = Gafanhoto("Creuza", 1, "M", "creuzita")

    g[0]

    println(g[0].toString())

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
        reproduzindo = true
    }

    override fun pause() {
        reproduzindo = false
    }

    override fun like() {
        curtidas++
    }

    override fun toString(): String {
        return "Video(titulo='$titulo', avaliacao=$avaliacao, views=$views, curtidas=$curtidas," +
                " reproduzindo=$reproduzindo"
    }


}

abstract class Pessoa(protected var nome: String, protected var idade: Int, protected var sexo: String) {
    protected var experiencia = 0

    protected fun ganharExp() {

    }

    override fun toString(): String {
        return "Pessoa(nome='$nome', idade=$idade," +
                " sexo='$sexo', experiencia=$experiencia)"
    }


}

class Gafanhoto(nome: String, idade: Int, sexo: String, private val login: String)
    : Pessoa(nome, idade, sexo) {

    private val totAssistido = 0

    fun viuMaisUm() {

    }

    override fun toString(): String {
        return "Gafanhoto(${super.toString()}, login='$login',  totAssistido=$totAssistido)"
    }


}
