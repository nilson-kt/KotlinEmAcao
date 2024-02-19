fun main() {
    val p: MutableList<Pessoa> = mutableListOf()
    val l: MutableList<Livro> = mutableListOf()

    p.add(Pessoa("Pedro", 22, "M"))
    p.add(Pessoa("Maria", 25, "F"))

    l.add(Livro("Aprendendo Kotlin", "José da Silva", 300, p[0]))
    l.add(Livro("POO para Iniciantes", "Pedro Paulo", 500, p[0]))
    l.add(Livro("Kotlin Avançado", "Maria Cândido", 800, p[0]))

    l[0].run {
        abrir()
        folhear(51)
        avancarPag()
        avancarPag()
        voltarPag()
        println(detalhes())
        fechar()
    }
}
