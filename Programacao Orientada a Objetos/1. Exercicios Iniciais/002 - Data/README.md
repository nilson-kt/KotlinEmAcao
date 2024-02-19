Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos seguintes métodos:

-construtor: define a data do determinado objeto (através de parâmetro). Este método verifica se a data está correta, caso não esteja a data é configurada como 01/01/0001.

-compara: recebe como parâmetro um outro objeto da classe data, compara com a data corrente e retorna uma string, informando se as datas são iguais, se a corrente for maior que a do parâmetro ou se a do parâmetro for maior que a corrente.

-getDia: retorna o dia da data

-getMes: retorna o mês dta

-getMesExtenso: retorna o mês da data corrente por extenso

-getAno: retorna o ano da data

-clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os mesmos valores de atributos e retorna sua referência pelo método.

Exemplos de Output:

1-
~~~
Digite a primeira data (00/00/0000): 10/04/2023
Digite a segunda data (00/00/0000): 02/05/1970
---------------------------------------------
Primeira Data: 10/04/2023
Dia: 10 
Mês: 4
Ano: 2023
Mês por extenso: abril
--------------------
Segunda Data: 02/05/1970
Dia: 2 
Mês: 5
Ano: 1970
Mês por extenso: maio
--------------------
Comparação: 10/04/2023 está depois de 02/05/1970
--------------------
Clonagem Data 1: 10/04/2023
~~~

2-
~~~
Digite a primeira data (00/00/0000): a
Digite a segunda data (00/00/0000): 02/112/2010
---------------------------------------------
Primeira Data: 01/01/0001
Dia: 1 
Mês: 1
Ano: 1
Mês por extenso: janeiro
--------------------
Segunda Data: 01/01/0001
Dia: 1 
Mês: 1
Ano: 1
Mês por extenso: janeiro
--------------------
Comparação: As datas são iguais.
--------------------
Clonagem Data 1: 01/01/0001
~~~