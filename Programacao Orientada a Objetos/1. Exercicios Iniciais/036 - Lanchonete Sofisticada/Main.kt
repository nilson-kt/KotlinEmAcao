import java.util.Locale

fun main() {
    val c1 = Cliente("João")
    Lanchonete.fazerAtendimento(c1)

}

class Cliente(val nome: String)

object Lanchonete {
    private val lanches = mutableListOf(
        Lanche("Cachorro Quente", 100, 1.20f),
        Lanche("Bauru simples", 101, 1.30f),
        Lanche("Bauru com Ovo", 102, 1.50f),
        Lanche("Hambúrguer", 103, 1.20f),
        Lanche("Cheeseburguer", 104, 1.30f),
        Lanche("Refrigerante", 105, 1.00f)
    )

    private fun exibirLinha() {
        println("-".repeat(80))
    }

    private fun exibirCardapio() {
        exibirLinha()
        println("Lanche".padEnd(40) + "Código".padEnd(25) + "Preço")
        lanches.forEach {
            println(buildString {
                append(it.nome.padEnd(40))
                append(it.codigo.toString().padEnd(25))
                append(String.format(Locale.US ,"R$%.2f", it.preco))
            })
        }
        exibirLinha()
    }

    private fun exibirPedido(pedido: Pedido) {
        exibirLinha()

        println(buildString {
            append("Cliente".padEnd(15))
            append("Lanche".padEnd(20))
            append("Código".padEnd(10))
            append("Quantidade".padEnd(14))
            append("Total")
        })
        println(buildString {
            append(pedido.cliente.nome.padEnd(15))
            append(pedido.lanche.nome.padEnd(20))
            append(pedido.lanche.codigo.toString().padEnd(10))
            append("${pedido.quantidade}x".padEnd(14))
            append(String.format(Locale.US, "R$%.2f", pedido.lanche.preco * pedido.quantidade))
        })
    }

    private fun registrarPedido(cliente: Cliente): Pedido {
        print("Digite o código: ")
        val codigo = readln().toInt()
        print("Quantidade: ")
        val quantidade = readln().toInt()
        val lanche = lanches.first { it.codigo == codigo }
        println("${quantidade}x ${lanche.nome} de ${cliente.nome} registrado com sucesso!")
        return Pedido(cliente, lanche, quantidade)
    }

    fun fazerAtendimento(cliente: Cliente) {
        exibirCardapio()
        exibirPedido(registrarPedido(cliente))
    }
}

data class Lanche(val nome: String, val codigo: Int, val preco: Float)

data class Pedido(val cliente: Cliente, val lanche: Lanche, val quantidade: Int)