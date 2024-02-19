fun main() {
    val prettyBoy = Lutador("Pretty Boy", "França", 31, 1.75f,
        68.9f,11, 2, 1)

    val putscript = Lutador("Putscript", "Brasil", 29, 1.68f,
        57.8f,14, 2, 3)

    val snapshadow = Lutador("Snapshadow", "EUA", 35, 1.65f,
        80.9f,12, 2, 1)

    val deadCode = Lutador("Dead Code", "Austrália", 28, 1.93f,
        81.6f,13, 0, 2)

    val ufocobol = Lutador("Ufocobol", "Brasil", 37, 1.70f,
        119.3f,5, 4, 3)

    val nerdaard = Lutador("Nerdaard", "EUA", 30, 1.81f,
        105.7f, 12, 2, 4)

    val lutadores = mutableListOf(prettyBoy, putscript, snapshadow, deadCode, ufocobol, nerdaard)

    val streetFight = Luta()
    streetFight.marcarLuta(lutadores[0], lutadores[1])
    streetFight.lutar()

    lutadores[0].status()
    lutadores[1].status()
}