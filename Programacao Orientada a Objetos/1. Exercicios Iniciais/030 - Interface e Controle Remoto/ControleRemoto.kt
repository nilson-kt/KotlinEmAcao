class ControleRemoto : Controlador {
    private var volume = 50
    private var ligado = true
    private var tocando = false

    override fun ligar() {
        ligado = true
    }

    override fun desligar() {
        ligado = false
    }

    override fun abrirMenu() {
        println("---- MENU ----")
        println("Está ligado? $ligado")
        println("Está tocando? $tocando")
        print("Volume: $volume ")
        for (contador in 1..volume step 10) {
            print("|")
        }
        println()
    }

    override fun fecharMenu() {
        println("Fechando Menu...")
    }

    override fun maisVolume() {
        if (ligado) volume += 5
    }

    override fun menosvolume() {
        if (ligado) volume -= 5
    }

    override fun ligarMudo() {
        if (ligado && volume > 0) {
            volume = 0
        }
    }

    override fun desligarMudo() {
        if (ligado && volume == 0) {
            volume = 50
        }
    }

    override fun play() {
        if (ligado && !tocando) tocando = true
    }

    override fun pause() {
        if (ligado && tocando) tocando = false
    }
}
