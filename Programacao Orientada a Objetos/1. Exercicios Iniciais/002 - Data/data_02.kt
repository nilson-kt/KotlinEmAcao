import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException

fun main() {
    class Data(var data: String) {

        init {
            val formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            try {
                LocalDate.parse(data, formatoData)
            } catch (e: DateTimeParseException) {
                data = "01/01/0001"
            }
        }

        fun compara(data2: Data): String {
            val objetoData1 = LocalDate.of(getAno(), getMes(), getDia())
            val objetoData2 = LocalDate.of(data2.getAno(), data2.getMes(), data2.getDia())
            return if (objetoData1.isAfter(objetoData2)) {
                "$data está depois de ${data2.data}"
            } else if (objetoData1.isBefore(objetoData2)) {
                "$data está antes de ${data2.data}"
            } else {
                "As datas são iguais."
            }
        }

        fun getDia(): Int {
            return data.split("/")[0].toInt()
        }

        fun getMes(): Int {
            return data.split("/")[1].toInt()
        }

        fun getMesExtenso(): String {
            val nomesMeses = mapOf(
                "01" to "janeiro",
                "02" to "fevereiro",
                "03" to "março",
                "04" to "abril",
                "05" to "maio",
                "06" to "junho",
                "07" to "julho",
                "08" to "agosto",
                "09" to "setembro",
                "10" to "outubro",
                "11" to "novembro",
                "12" to "dezembro"
            )
            val mes = data.split("/")[1]
            return nomesMeses[mes].toString()
        }

        fun getAno(): Int {
            return data.split("/")[2].toInt()
        }

        fun clone(): Data {
            return Data(data)
        }

    }
    print("Digite a primeira data (00/00/0000): ")
    val tempo1 = readln()
    print("Digite a segunda data (00/00/0000): ")
    val tempo2 = readln()

    val data1 = Data(tempo1)
    val data2 = Data(tempo2)

    println("-".repeat(45))
    println("Primeira Data: ${data1.data}")
    println("Dia: ${data1.getDia()} ")
    println("Mês: ${data1.getMes()}")
    println("Ano: ${data1.getAno()}")
    println("Mês por extenso: ${data1.getMesExtenso()}")
    println("-".repeat(20))
    println("Segunda Data: ${data2.data}")
    println("Dia: ${data2.getDia()} ")
    println("Mês: ${data2.getMes()}")
    println("Ano: ${data2.getAno()}")
    println("Mês por extenso: ${data2.getMesExtenso()}")
    println("-".repeat(20))
    println("Comparação: ${data1.compara(data2)}")
    println("-".repeat(20))
    val cloneData1 = data1.clone()
    println("Clonagem Data 1: ${cloneData1.data}")
}
