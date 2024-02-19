fun main() {
    println("CONTA POUPANÇA")
    val conta1 = ContaPoupanca(500.0)
    conta1.sacar(400.0)
    conta1.depositar(500.0)
    println("Saldo: R$${conta1.obterSaldo()}")

    mostrarLinha()
    println("CONTA CORRENTE")
    val conta2 = ContaCorrente(1000.0)
    println("Saldo: R$${conta2.obterSaldo()}")
    println("Tributo: R$${conta2.calculaTributos()}")

    mostrarLinha()
    println("SEGURO DE VIDA")
    val conta3 = SeguroDeVida()
    println("Tributo: R$${conta3.calculaTributos()}")

}

fun mostrarLinha() {
    println("-".repeat(40))
}

interface Tributavel {
    fun calculaTributos(): Double

}

open class Conta(protected var saldo: Double) {
    fun sacar(dinheiro: Double)  {
        saldo -= dinheiro
    }

    fun depositar(dinheiro: Double) {
        saldo += dinheiro
    }

    fun obterSaldo(): Double {
        return saldo
    }
}

class ContaPoupanca(saldo: Double) : Conta(saldo) {

}

class ContaCorrente(saldo: Double) : Conta(saldo), Tributavel  {
    override fun calculaTributos(): Double {
        return saldo / 100
    }
}

class SeguroDeVida : Tributavel {
    override fun calculaTributos(): Double {
        return 42.0
    }
}
