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
