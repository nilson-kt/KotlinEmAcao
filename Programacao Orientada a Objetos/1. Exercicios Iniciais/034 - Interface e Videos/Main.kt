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
