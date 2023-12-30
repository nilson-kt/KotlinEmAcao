fun main() {
    val cachorro1 = Cachorro()
    val gato1 = Gato()
    val boi1 = Boi()
    println("FAZENDA")
    println("-".repeat(40))

    //Cachorros
    println("Cachorros")
    cachorro1.comer()
    cachorro1.emitirSom()

    println("-".repeat(25))
    println("Gatos")
    gato1.comer()
    gato1.emitirSom()

    //Bois
    println("-".repeat(25))
    println("Bois")
    boi1.comer()
    boi1.emitirSom()
}

open class Animal {
    open fun comer() {
        println("Animal comendo.")
    }
    open fun emitirSom() {
        println("Som produzido pelo animal.")
    }
}

open class Carnivoro : Animal() {
    override fun comer() {
        println("Animal carnívoro comendo.")
    }
}

open class Onivoro : Animal() {
    override fun comer() {
        println("Animal onívoro comendo.")
    }
}

open class Herbivoro : Animal() {
    override fun comer() {
        println("Animal herbívoro comendo.")
    }
}

class Cachorro : Onivoro() {
    override fun emitirSom() {
        println("Au Au!")
    }
}

class Gato : Carnivoro() {
    override fun emitirSom() {
        println("Miau!")
    }
}

class Boi : Herbivoro() {
    override fun emitirSom() {
        println("Muu!")
    }
}
