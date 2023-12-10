package poo

class Escola {
    val departamentos = mutableListOf<MutableMap<Int, Departamento>>()

    inner class Departamento(var nome: String) {
        var id = 0


        init {
            id = if (departamentos.isEmpty()) {
                1
            } else {
                departamentos.last().keys.first()+1
            }
            departamentos.add(mutableMapOf(id to this))
        }


        inner class Professor(var nome: String) {
            val id = 0
        }

        inner class Curso(var nome: String) {
            val codigo = 0
            val ministrantes = mutableListOf<Professor>()
            val cargaHoraria = 0
        }

    }

    fun visualizarDepartamentos() {
        println(buildString {
            append("ID".padEnd(5))
            append("Nome")
        })
        departamentos.forEach {
            it.forEach { (id, departamento) ->
                println(buildString {
                    append("$id".padEnd(5))
                    append(departamento.nome)
                })
            }
        }
    }


}

fun main() {
    val usp = Escola()
    val depLinguistica = usp.Departamento("Linguística")
    val profBianca = depLinguistica.Professor("Bianca")
    val portuguesDepLing = depLinguistica.Curso("Pragmática da Enunciação")
    portuguesDepLing.ministrantes.add(profBianca)
    val depLetrasClassicas = usp.Departamento("Letras Clássicas")
    println(usp.departamentos)
    usp.visualizarDepartamentos()

}