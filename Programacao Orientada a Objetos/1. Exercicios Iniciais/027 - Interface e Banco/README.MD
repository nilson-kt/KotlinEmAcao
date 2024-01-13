Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar um sistema para isso. Crie uma interface Tributavel que possui o método calculaTributos(), que retorna um double. Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais. As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo da conta. Crie um código na função main para testar o que foi criado.

Exemplo de Output:
~~~
CONTA POUPANÇA
Saldo: R$600.0
----------------------------------------
CONTA CORRENTE
Saldo: R$1000.0
Tributo: R$10.0
----------------------------------------
SEGURO DE VIDA
Tributo: R$42.0
~~~