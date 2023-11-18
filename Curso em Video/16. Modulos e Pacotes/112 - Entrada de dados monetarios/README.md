Dentro do pacote utilidadesCeV que criamos no desafio 111, temos um módulo chamado dado. Crie uma função chamada leiaDinheiro() que seja capaz de funcionar como a função input(), mas com uma validação de dados para aceitar apenas valores que sejam monetários.

Exemplo de Output:

1-
~~~
Digite um preço: R$550.00
----------------------------------------
            RESUMO DO VALOR
----------------------------------------
A metade de R$550.0 é R$275.00
O dobro de R$550.0 é R$1100.00
Aumentando 10%, temos R$605.00
Reduzindo 13%, temos R$478.50
----------------------------------------
~~~

2-
~~~
Digite um preço: R$a
"a" é um preço inválido!
Digite um preço: R$
"" é um preço inválido!
Digite um preço: R$     Barato
"Barato" é um preço inválido!
Digite um preço: R$
"" é um preço inválido!
Digite um preço: R$ 250,423
----------------------------------------
            RESUMO DO VALOR
----------------------------------------
A metade de R$250.423 é R$125.21
O dobro de R$250.423 é R$500.85
Aumentando 10%, temos R$275.47
Reduzindo 13%, temos R$217.87
----------------------------------------
~~~