import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

class Data(var data: String) {
    init {
        val formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        try {
            LocalDate.parse(data, formatoData)
        } catch (e: DateTimeParseException) {
            data = "01/01/0001"
        }
    }
}

class Voo(private val id: Int, var data: Data) {
    var cadeiras = (1..100).associateWith { "vazia" } as MutableMap

    fun ocupa(numeroCadeira: Int): Boolean {
        if (cadeiras[numeroCadeira] == "ocupada") {
            return false
        } else if (cadeiras[numeroCadeira] == "vazia") {
            cadeiras[numeroCadeira] = "ocupada"
            return true
        }
        return false
    }

    fun verifica(numeroCadeira: Int) {
        if (cadeiras[numeroCadeira] == "ocupada") {
            println("A cadeira $numeroCadeira está ocupada.")
        } else if (cadeiras[numeroCadeira] == "vazia") {
            println("A cadeira $numeroCadeira está disponível.")
        }
    }

    fun vagas(): Map<Int, String> {
        return cadeiras.filter{ it.value == "vazia"}
    }

    fun getVoo(): Int {
        return id
    }

    fun proximoLivre(): Int {
        return vagas().keys.first()
    }

}

fun menu() {
    val dataVoo1 = Data("02/12/2023")
    val voo1 = Voo(1, dataVoo1)

    while (true) {
        println("-".repeat(40))
        println("MENU")
        println("-".repeat(40))
        println("[1] Ver cadeiras disponíveis")
        println("[2] Ver todas as cadeiras")
        println("[3] Ocupar uma cadeira")
        println("[4] Ver próxima cadeira disponível")
        println("[5] Verificar uma cadeira")
        println("[6] Ver informações sobre o voo")
        println("[7] Sair do programa")
        println("-".repeat(40))
        print("Sua opção: ")
        val opcao = readln().toInt()
        when (opcao) {
            1 -> println(voo1.vagas())
            2 -> println(voo1.cadeiras)
            3 -> {
                print("Qual cadeira deseja ocupar?: ")
                val cadeira = readln().toInt()
                if (voo1.ocupa(cadeira)) {
                    println("A cadeira $cadeira foi ocupada com sucesso!")
                } else {
                    println("A cadeira $cadeira já está ocupada. Por favor, procure outra cadeira.")
                }
                Thread.sleep(1400)
            }

            4 -> {
                println("A próxima cadeira disponível é: ${voo1.proximoLivre()}")
                Thread.sleep(1400)
            }
            5 -> {
                print("Digite o número de uma cadeira para fazermos a verificação: ")
                val cadeira = readln().toInt()
                voo1.verifica(cadeira)
                Thread.sleep(1400)
            }

            6 -> {
                println("ID: ${voo1.getVoo()}")
                println("Data: ${voo1.data.data}")
                Thread.sleep(1400)
            }

            7 -> {
                println("Programa Encerrado. Volte sempre.")
                break
            }
        }
    }
}

fun main() {
    menu()
}
