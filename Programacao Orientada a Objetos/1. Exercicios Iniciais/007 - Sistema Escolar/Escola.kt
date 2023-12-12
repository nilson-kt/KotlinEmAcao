class Escola {
    val departamentos = mutableListOf<MutableMap<Int, Departamento>>()

    inner class Departamento(var nome: String) {
        var idDep = 0
        val cursos = mutableListOf<MutableMap<Int, Curso>>()


        init {
            idDep = if (departamentos.isEmpty()) {
                1
            } else {
                departamentos.last().keys.first()+1
            }
            departamentos.add(mutableMapOf(idDep to this))
        }


        inner class Professor(var nome: String) {
            var idProf = 0


        }

        inner class Curso(var nome: String) {
            var idCurso = 0
            val ministrantes = mutableListOf<Professor>()
            val cargaHoraria = 0

            init {
                idCurso = if (cursos.isEmpty()) {
                    1
                } else {
                    cursos.last().keys.first()+1
                }
                cursos.add(mutableMapOf(idCurso to this))
            }
        }

    }

    fun visualizarDepartamentos() {
        println(Interface.exibicaoDepartamento)
        if (departamentos.isEmpty()) {
            println(Cores.amarelo("Nenhum departamento foi criado."))
        } else {
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
        Leitor.mensagemDeRetorno()
    }

    fun visualizarCursos() {
        visualizarDepartamentos()
        print("Selecione um departamento")
        val selecao = readln().toInt()
        val depSelecionado = departamentos[selecao-1].values.first()
        println(buildString {
            append("ID".padEnd(5))
            append("Nome")
        })
        depSelecionado.cursos.forEach {
            it.forEach { (id, curso) ->
                println(buildString {
                    append("$id",padEnd(5))
                    append(curso.nome)
                })
            }
        }
    }

    fun adicionarDepartamento() {
        println(Interface.adicaoDepartamento)
        val nome = Leitor.lerString("Nome do Departamento: ")
        val departamentoBuscado = departamentos.filter {it.values.first().nome == nome}
        if (departamentoBuscado.isNotEmpty()) {
            println(Cores.amarelo("Já existe um departamento chamado \"$nome\"!"))
            Leitor.mensagemDeRetorno()
        } else {
            this.Departamento(nome)
            println(Cores.verde("Departamento criado com sucesso."))
            Leitor.mensagemDeRetorno()
        }
    }

    fun adicionarCursos() {
        visualizarDepartamentos()
        print("Selecione um departamento")
        val selecao = readln().toInt()
        val depSelecionado = departamentos[selecao-1].values.first()
        print("Digite o nome do curso: ")
        val nome = readln()
        val curso = depSelecionado.Curso(nome)

    }

}