fun main() {
    val controle = ControleRemoto()

    controle.ligar()
    controle.abrirMenu()
    controle.fecharMenu()

}

interface Controlador {
    fun ligar()
    fun desligar()
    fun abrirMenu()
    fun fecharMenu()
    fun maisVolume()
    fun menosvolume()
    fun ligarMudo()
    fun desligarMudo()
    fun play()
    fun pause()
}

class ControleRemoto : Controlador {
    private var _volume = 50
    private var volume: Int
        get() {
            return _volume
        }
        set(valor) {
            _volume = valor
        }

    private var _ligado = true
    private var ligado: Boolean
        get() {
            return _ligado
        }
        set(valor) {
            _ligado = valor
        }

    private var _tocando = false
    private var tocando: Boolean
        get() {
            return _tocando
        }
        set(valor) {
            _tocando = valor
        }

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