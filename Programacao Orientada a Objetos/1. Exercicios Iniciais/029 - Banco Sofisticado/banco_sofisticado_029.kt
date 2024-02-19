fun main() {
    // Criação da Conta do Jubileu
    val contaJubileu = ContaBanco()
    contaJubileu.numConta = 1111
    contaJubileu.dono = "Jubileu"
    contaJubileu.abrirConta("CC")

    // Criação da Conta da Creuza
    val contaCreuza = ContaBanco()
    contaCreuza.numConta = 2222
    contaCreuza.dono = "Creuza"
    contaCreuza.abrirConta("CP")

    // Operações Bancárias
    contaJubileu.depositar(100f)
    contaCreuza.depositar(500f)
    contaCreuza.sacar(100f)
    contaJubileu.sacar(150f)
    contaJubileu.fecharConta()

    // Checagem das Contas
    contaJubileu.estadoAtual()
    contaCreuza.estadoAtual()
}

class ContaBanco {
    private var _numConta: Int? = null
    var numConta: Int?
        get() {
            return _numConta
        }
        set(valor: Int?) {
            _numConta = valor
        }

    protected var _tipo: String? = null
    var tipo: String?
        get() {
            return _tipo
        }
        set(valor: String?) {
            _tipo = valor
        }


    private var _dono: String? = null
    var dono: String?
        get() {
            return _dono
        }
        set(valor: String?) {
            _dono = valor
        }

    private var _saldo = 0f
    var saldo: Float
        get() {
            return _saldo
        }
        set(valor: Float) {
            _saldo = valor
        }

    private var _status: Boolean = false
    var status: Boolean
        get() {
            return _status
        }
        set(valor: Boolean) {
            _status = valor
        }

    fun abrirConta(tipoConta: String) {
        tipo = tipoConta
        status = true
        saldo = when (tipo) {
            "CC" -> 50f
            "CP" -> 150f
            else -> 0f
        }
        println("Conta aberta com sucesso!")
    }

    fun fecharConta() {
        if (saldo > 0)  {
            println("Não foi possível fechar a conta de $dono porque ainda há dinheiro.")
        } else if (saldo < 0) {
            println("Não foi possível fechar a conta de $dono porque há débitos.")
        } else {
            status = false
            println("Conta de $dono fechada com sucesso.")
        }
    }

    fun depositar(deposito: Float) {
        if (!status) {
            println("Não existe uma conta.")
        } else {
            saldo += deposito
            println("Depósito de R$$deposito realizado com sucesso na conta de $dono.")
        }
    }

    fun sacar(valor: Float) {
        if (!status) {
            println("Impossível sacar de uma conta fechada!")
        } else if (saldo < 0) {
            println("Não existe dinheiro para ser sacado.")
        } else if (saldo < valor) {
            println("Saldo insuficiente para saque")
        } else {
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso na conta de $dono!")
        }
    }

    fun pagarMensal() {
        if (!status) {
            println("Impossível pagar uma conta fechada!")
        } else if (tipo == "CC" && saldo < 12 || tipo == "CP" && saldo < 20) {
            println("Sem dinheiro suficiente")
        } else {
            if (tipo == "CC") {
                saldo -= 12
            } else if (tipo == "CP") {
                saldo -= 20
            }
            println("Mensalidade na conta de $dono paga com sucesso")
        }
    }

    fun estadoAtual() {
        println("-".repeat(30))
        println("Conta: ${this.numConta}")
        println("Tipo: ${this.tipo}")
        println("Dono: ${this.dono}")
        println("Saldo: ${this.saldo}")
        println("Status: ${this.status}")
    }
}