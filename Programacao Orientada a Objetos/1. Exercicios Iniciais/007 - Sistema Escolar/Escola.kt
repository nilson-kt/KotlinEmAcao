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
            private var idCurso = 0

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

    fun visualizarDepartamentos(mensagemDeRetorno: Boolean = true) {
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
        if (mensagemDeRetorno) Leitor.mensagemDeRetorno() else println("-".repeat(40))
    }

    fun visualizarCursos() {
        if (departamentos.isEmpty()) {
            println(Cores.amarelo("Crie um departamento primeiro."))
            Leitor.mensagemDeRetorno()
        } else {
            visualizarDepartamentos(false)
            val selecao = Leitor.lerIdDepartamento("Selecione um departamento: ", this)
            if (selecao != null) {
                val depSelecionado = departamentos[selecao - 1].values.first()
                if (depSelecionado.cursos.isEmpty()) {
                    println(Cores.amarelo("Não existe nenhum curso atrelado a este departamento."))
                } else {
                    println(buildString {
                        append("ID".padEnd(5))
                        append("Nome")
                    })
                    depSelecionado.cursos.forEach {
                        it.forEach { (id, curso) ->
                            println(buildString {
                                append("$id".padEnd(5))
                                append(curso.nome)
                            })
                        }
                    }
                }
            }
            Leitor.mensagemDeRetorno()
        }
    }

    fun adicionarDepartamento() {
        println(Interface.adicaoDepartamento)
        val nome = Leitor.lerString("Nome do Departamento: ", this, departamentos = true)
        val departamentoBuscado = departamentos.filter {it.values.first().nome == nome}
        if (departamentoBuscado.isNotEmpty()) {
            println(Cores.amarelo("Já existe um departamento chamado \"$nome\"!"))
        } else {
            this.Departamento(nome)
            println(Cores.verde("Departamento criado com sucesso."))
        }
        Leitor.mensagemDeRetorno()
    }

    fun adicionarCursos() {
        if (departamentos.isEmpty()) {
            println(Cores.amarelo("Crie um departamento primeiro."))
            Leitor.mensagemDeRetorno()
        } else {
            visualizarDepartamentos(false)
            val selecao = Leitor.lerIdDepartamento("Selecione um departamento: ", this)
            if (selecao != null) {
                println(Interface.adicaoCurso)
                val depSelecionado = departamentos[selecao - 1].values.first()
                val nome = Leitor.lerString("Digite o nome do curso: ", this, cursos = true)
                val cursoBuscado = depSelecionado.cursos.filter { it.values.first().nome == nome }
                if (cursoBuscado.isNotEmpty()) {
                    println(Cores.amarelo("Já existe um curso chamado \"$nome\"!"))
                } else {
                    depSelecionado.Curso(nome)
                    println(Cores.verde("Curso criado com sucesso."))
                }
            }
            Leitor.mensagemDeRetorno()
        }

    }
}