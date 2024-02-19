/**
 * Este programa permite ao usuário cadastrar nome e pesos de várias pessoas.
 * Após a entrada de dados, o programa exibe listas de pessoas com os pesos
 * mais altos e mais baixos, juntamente com seus respectivos pesos.
 */

fun main() {
    var contador = 0
    val lista = mutableListOf<MutableList<Any>>()
    val listaPesados = mutableListOf<Any>()
    val listaLeves = mutableListOf<Any>()
    var maiorPeso = 0.0f
    var menorPeso = 0.0f
    while (true) {
        ++contador
        print("Digite o nome da ${contador}ª pessoa: ")
        val nome = readln()
        print("Digite o peso de $nome: ")
        val peso = readln().toFloat()
        lista.add(
            mutableListOf(nome, peso)
        )
        var resposta = ""
        while (resposta !in "SsNn" || resposta == "") {
            print("Deseja continuar? [S/N]: ")
            resposta = readln().trim()
            if (resposta !in "SsNn" || resposta == "") print("Opção inválida. ")
        }
        if (resposta in "Nn") break
    }
    for (sublista in lista) {
        for(elemento in sublista) {
            if (elemento is Float) {
                if (elemento > maiorPeso) maiorPeso = elemento
                if (lista.indexOf(sublista) == 0) {
                    menorPeso = elemento
                } else if (elemento < menorPeso) {
                    menorPeso = elemento
                }
            }
        }
    }
    for (sublista in lista) {
        for (elemento in sublista) {
            if (elemento == maiorPeso) {
                listaPesados.add(sublista[sublista.indexOf(elemento) - 1])
            } else if (elemento == menorPeso) {
                listaLeves.add(sublista[sublista.indexOf(elemento) - 1])
            }
        }
    }
    println("Quantidade de pessoas cadastradas: ${lista.size}")
    println("Lista das pessoas com maior peso: $listaPesados com ${maiorPeso}Kg")
    print("Lista das pessoas com menor peso: $listaLeves com ${menorPeso}Kg")
}
