Crie um programa que leia nome, sexo e idade de várias pessoas, guardando os dados de cada pessoa em um mapa e todos os mapas em uma lista. No final, mostre:

A - Quantas pessoas foram cadastradas;

B - A média de idade do grupo;

C - Uma lista com todas as mulheres;

D - Uma lista com todas as pessoas com idade acima da média.

Exemplo de Output:
~~~
Nome: Ana
Sexo (M/F): f
Idade: 22
Deseja continuar? [S/N]: s
Nome: Pedro
Sexo (M/F):    
Sexo inválido. Tente novamente. Sexo (M/F): 
Sexo inválido. Tente novamente. Sexo (M/F): a
Sexo inválido. Tente novamente. Sexo (M/F):  M
Idade: 43
Deseja continuar? [S/N]:  a
Opção inválida. Deseja continuar? [S/N]: 
Opção inválida. Deseja continuar? [S/N]: s
Nome: Geovani
Sexo (M/F): M
Idade: 23
Deseja continuar? [S/N]: Paula
Opção inválida. Deseja continuar? [S/N]: s
Nome: Paula
Sexo (M/F): f
Idade: 41
Deseja continuar? [S/N]: n
----------------------------------------------------------------------------------------------------
[{Nome=Ana, Sexo=F, Idade=22}, {Nome=Pedro, Sexo=M, Idade=43}, {Nome=Geovani, Sexo=M, Idade=23}, {Nome=Paula, Sexo=F, Idade=41}]
Quantidade de pessoas cadastradas: 4
Média de idade: 32.25
Lista com todas as mulheres: [Ana, Paula]
Lista de pessoas com idade acima da média: [[Pedro, 43], [Paula, 41]]
----------------------------------------------------------------------------------------------------
Programa Encerrado.
~~~