Desenvolver uma calculadora em Kotlin, modularizando o código. 

Singletons:

Calculadora - métodos: somar, subtrair, multiplicar, dividir, mensagem, conversaoNumerica, tratarDivisao. A calculadora lida com as operações matemáticas, aceitando qualquer tipo de número. Adicionalmente, trata casos especiais, como divisão por zero ou divisão cujo divisor é 0. Em última instância, exibe uma mensagem que mostra o resultado da operação formatado com duas casas decimais.

Leitor - método: lerNumero. O leitor valida e faz a leitura de um número a partir da entrada do usuário.

Cores - opcional - métodos: azul, vermelho. O objeto Cores formata o texto para exibição colorida no terminal, exibindo o vermelho para mensagens de erro e o azul para as mensagens da calculadora.

Exemplos de Output:

1-
~~~
Digite um número: 325
Digite um número: 10532
325.0 + 10532.0 é igual a 10857.00
325.0 - 10532.0 é igual a -10207.00
325.0 * 10532.0 é igual a 3422900.00
325.0 / 10532.0 é igual a 0.03
~~~

2-
~~~
Digite um número: 5.42344
Digite um número: 10.23
5.42344 + 10.23 é igual a 15.65
5.42344 - 10.23 é igual a -4.81
5.42344 * 10.23 é igual a 55.48
5.42344 / 10.23 é igual a 0.53
~~~

3-
~~~
Digite um número: 5.4534
Digite um número: 0
5.4534 + 0.0 é igual a 5.45
5.4534 - 0.0 é igual a 5.45
5.4534 * 0.0 é igual a 0.00
5.4534 / 0.0 é igual a Divisor é um Zero!
~~~

4-
~~~
Digite um número: 0
Digite um número: 0
0.0 + 0.0 é igual a 0.00
0.0 - 0.0 é igual a 0.00
0.0 * 0.0 é igual a 0.00
0.0 / 0.0 é igual a Divisão por Zero!
~~~