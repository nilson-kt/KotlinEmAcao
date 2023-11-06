Aprimore o DESAFIO 093 para que ele funcione com vários jogadores, incluindo um sistema de visualização de detalhes do aproveitamento de cada jogador.

Exemplo de Output:
~~~
Nome do Jogador: Marcos
Número de partidas jogadas: 3
Quantos gols na partida 1?: 2
Quantos gols na partida 2?: 5
Quantos gols na partida 3?: 1
Deseja continuar [S/N]:    a
Opção inválida. Deseja continuar [S/N]: 
Opção inválida. Deseja continuar [S/N]: s
Nome do Jogador: Pedro
Número de partidas jogadas: 4
Quantos gols na partida 1?: 2
Quantos gols na partida 2?: 0
Quantos gols na partida 3?: 0
Quantos gols na partida 4?: 1
Deseja continuar [S/N]: s
Nome do Jogador: Otávio
Número de partidas jogadas: 5
Quantos gols na partida 1?: 4
Quantos gols na partida 2?: 5
Quantos gols na partida 3?: 3
Quantos gols na partida 4?: 4
Quantos gols na partida 5?: 2
Deseja continuar [S/N]: n
-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
cod nome              gols                total
--------------------------------------------------
  0 Marcos            [2, 5, 1]           8
  1 Pedro             [2, 0, 0, 1]        3
  2 Otávio            [4, 5, 3, 4, 2]     18
--------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 1
-------------------------------------------------------
*** LEVANTAMENTO DO JOGADOR Pedro
No jogo 1 fez 2 gols.
No jogo 2 fez 0 gols.
No jogo 3 fez 0 gols.
No jogo 4 fez 1 gols.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 2
-------------------------------------------------------
*** LEVANTAMENTO DO JOGADOR Otávio
No jogo 1 fez 4 gols.
No jogo 2 fez 5 gols.
No jogo 3 fez 3 gols.
No jogo 4 fez 4 gols.
No jogo 5 fez 2 gols.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 3
ERRO! Não existe jogador com o código 3! Tente novamente.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 0
-------------------------------------------------------
*** LEVANTAMENTO DO JOGADOR Marcos
No jogo 1 fez 2 gols.
No jogo 2 fez 5 gols.
No jogo 3 fez 1 gols.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: -1
ERRO! Não existe jogador com o código -1! Tente novamente.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 
ERRO! Resposta nula. Digite um código de algum jogador.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 1
-------------------------------------------------------
*** LEVANTAMENTO DO JOGADOR Pedro
No jogo 1 fez 2 gols.
No jogo 2 fez 0 gols.
No jogo 3 fez 0 gols.
No jogo 4 fez 1 gols.
-------------------------------------------------------
Mostrar dados de qual jogador? (999) para parar: 999
-------------------------------------------------------
Programa Encerrado.
~~~