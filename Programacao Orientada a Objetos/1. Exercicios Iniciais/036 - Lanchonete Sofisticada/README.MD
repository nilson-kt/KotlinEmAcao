Crie uma classe Cliente e um singleton Lanchonete. A lanchonete deve possuir o seguinte cardápio:
~~~
Especificação	Código	Preço
Cachorro quente	100	1,20
Bauru simples	101	1,30
Bauru com ovo	102	1,50
Hambúrger	    103	1,20
Cheeseburguer	104	1,30
Refrigerante	105	1,00
~~~

Com isso, crie um método que exiba o cardápio, registre e exiba um pedido feito por uma instância da classe Cliente. O algoritmo deve ler o código do item pedido, a quantidade e calcular o valor a ser pago por um lanche. Considere que a cada execução somente será calculado um item.

Exemplo de Output:
~~~
--------------------------------------------------------------------------------
Lanche                                  Código                   Preço
Cachorro Quente                         100                      R$1.20
Bauru simples                           101                      R$1.30
Bauru com Ovo                           102                      R$1.50
Hambúrguer                              103                      R$1.20
Cheeseburguer                           104                      R$1.30
Refrigerante                            105                      R$1.00
--------------------------------------------------------------------------------
Digite o código: 100
Quantidade: 4
4x Cachorro Quente de João registrado com sucesso!
--------------------------------------------------------------------------------
Cliente        Lanche              Código    Quantidade    Total
João           Cachorro Quente     100       4x            R$4.80
~~~