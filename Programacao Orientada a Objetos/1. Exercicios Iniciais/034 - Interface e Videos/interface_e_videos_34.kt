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
    println("-".repeat(30))
    val vis = mutableListOf<Visualizacao>()
    vis.add(Visualizacao(g[0], v[2])) // Jubileu assiste HTML5
    vis[0].avaliar()
    println(vis[0].toString())

    vis.add(Visualizacao(g[0], v[1])) // Jubileu assiste PHP
    vis[1].avaliar(7)
    println(vis[1].toString())

}

interface AcoesVideo {
    fun play()

    fun pause()

    fun like()
}


class Video(var titulo: String): AcoesVideo {
    var avaliacao = 1
        set(valor) {
            field = (avaliacao + valor) / views
        }

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
        filme.avaliacao = 5
    }

    fun avaliar(nota: Int) {
        filme.avaliacao = nota
    }

    fun avaliar(porc: Float) {
        val total = if (porc <= 20) {
            3
        } else if (porc <= 50) {
            5
        } else if (porc <= 90) {
            8
        } else {
            10
        }
        filme.avaliacao = total
    }

    override fun toString(): String {
        return "Visualizacao(espectador=$espectador, filme=$filme)"
    }


}