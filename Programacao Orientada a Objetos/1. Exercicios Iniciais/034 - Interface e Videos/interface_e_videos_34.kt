fun main() {

    val v = mutableListOf<Video>()
    v.add(Video("Aula 1 de POO"))
    v.add(Video("Aula 12 de PHP"))
    v.add(Video("Aula 10 DE HTML5"))

    val g = mutableListOf<Gafanhoto>()
    g.add(Gafanhoto("Jubileu", 22, "M", "juba"))
    g.add(Gafanhoto("Creuza", 1, "M", "creuzita"))

    println("VÍDEOS")
    println("-".repeat(30))
    println(v[0].toString())
    println(v[1].toString())
    println(v[2].toString())

    println("\nGAFANHOTOS")
    println("-".repeat(30))
    println(g[0].toString())
    println(g[1].toString())

    println("\nVISUALIZAÇõES")
    val vis = mutableListOf<Visualizacao>()
    vis.add(Visualizacao(g[0], v[2]))
    println(vis[0].toString())
    vis.add(Visualizacao(g[0], v[1]))
    println(vis[1].toString())

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

    var totAssistido = 0

    fun viuMaisUm() {

    }

    override fun toString(): String {
        return "Gafanhoto(${super.toString()}, login='$login',  totAssistido=$totAssistido)"
    }


}

class Visualizacao(private var espectador: Gafanhoto, private var filme: Video) {

    init {
        espectador.totAssistido++
        filme.views++
    }

    fun avaliar() {

    }

    fun avaliar(nota: Int) {

    }

    fun avaliar(porc: Float) {

    }

    override fun toString(): String {
        return "Visualizacao(espectador=$espectador, filme=$filme)"
    }


}