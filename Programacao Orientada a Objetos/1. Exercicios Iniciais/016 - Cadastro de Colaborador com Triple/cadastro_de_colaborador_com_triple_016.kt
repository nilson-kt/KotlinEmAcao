fun main() {
    val funcionario1 = Funcionario.cadastrarFuncionario()
    println("Nome, cargo e salário, respectivamente:\n${funcionario1.informacoes}")

}

class Funcionario(var informacoes: Triple<String, String, Double>) {

    companion object {
        fun cadastrarFuncionario(): Funcionario {
            println("CADASTRO DE FUNCIONÁRIO")
            print("Nome: ")
            val nome = readln()
            print("Cargo: ")
            val cargo = readln()
            print("Salário: R$")
            val salario = readln().toDouble()
            println("-".repeat(40))
            return Funcionario(Triple(nome, cargo, salario))
        }
    }
}